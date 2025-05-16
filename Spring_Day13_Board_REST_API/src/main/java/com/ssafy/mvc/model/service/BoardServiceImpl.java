package com.ssafy.mvc.model.service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.ssafy.mvc.model.dao.BoardDao;
import com.ssafy.mvc.model.dto.Board;
import com.ssafy.mvc.model.dto.SearchCondition;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDao boardDao;
	
	@Autowired
	private ResourceLoader resourceLoader;
	
	// 게시글 전체 목록을 조회한다.
	@Override
	public List<Board> getBoardList() {
		System.out.println("게시글 전체 목록");
		List<Board> list = boardDao.selectAll();
		return list;
	}
	
	// 상세 게시글을 조회한다.(조회 수를 업데이트하고 조회한다.)
	@Transactional
	@Override
	public Board readBoard(int id) {
		System.out.println("게시글 상세 페이지를 조회한다.");
		boardDao.updateViewCnt(id);
		return boardDao.selectOne(id);
	}
	
	// 상세 게시글을 조회한다.(조회수 업데이트 없이 조회한다.)
	@Override
	public Board getBoard(int id) {
		
		return boardDao.selectOne(id);
	}
	
	// 게시글을 작성한다.
	@Transactional
	@Override
	public void writeBoard(Board board) {
		System.out.println("게시글을 작성한다.");
		boardDao.insertBoard(board);
		
	}
	
	// 게시글을 삭제한다.
	@Transactional
	@Override
	public boolean removeBoard(int id) {
		System.out.println("게시글을 삭제한다.");
		int result = boardDao.deleteBoard(id);
		
		return result == 1;
	}

	// 게시글을 수정한다.
	@Transactional
	@Override
	public void modifyBoard(Board board) {
		System.out.println("게시글을 수정한다.");
		boardDao.updateBoard(board);
	}
	
	// 게시글을 검색한다.
	@Override
	public List<Board> search(SearchCondition condition) {
		// TODO Auto-generated method stub
		
		return boardDao.search(condition);
	}

	@Override
	public void fileUpload(MultipartFile file, Board board) {
		if(file != null && file.getSize()>0) {
			String fileName = file.getOriginalFilename(); // 확장자를 포함한 실제 파일 이름
			String fileId = UUID.randomUUID().toString();
			
			// 게시글에 파일 이름을 추가로 넣는다.
			board.setFileId(fileId);
			board.setFileName(fileName);
			
			// 저장할 경로를 지정한다.
			// static/img 폴더 안에 넣는다.
			Resource resource = resourceLoader.getResource("classpath:/static/img");
			try {
				file.transferTo(new File(resource.getFile(), fileId));
				
				// File은 Board가 등록되고 나서 id가 생겼을 때 등록가능하기 때문에, 
				// Board를 등록하고 나서 File을 등록해야 한다.
				boardDao.insertBoard(board);
				boardDao.insertFile(board);
				
				
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
