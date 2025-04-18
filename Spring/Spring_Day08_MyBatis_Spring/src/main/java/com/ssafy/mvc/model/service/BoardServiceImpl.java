package com.ssafy.mvc.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.mvc.model.dao.BoardDao;
import com.ssafy.mvc.model.dto.Board;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDao boardDao;
	
	// 게시글 전체 목록을 조회한다.
	@Override
	public List<Board> getBoardList() {
		System.out.println("게시글 전체 목록");
		List<Board> list = boardDao.selectAll();
		return list;
	}
	
	// 상세 게시글을 조회한다.(조회 수를 업데이트하고 조회한다.)
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
	@Override
	public void writeBoard(Board board) {
		System.out.println("게시글을 작성한다.");
		boardDao.insertBoard(board);
		
	}
	
	// 게시글을 삭제한다.
	@Override
	public void removeBoard(int id) {
		System.out.println("게시글을 삭제한다.");
		boardDao.deleteBoard(id);
	}

	// 게시글을 수정한다.
	@Override
	public void modifyBoard(Board board) {
		System.out.println("게시글을 수정한다.");
		boardDao.updateBoard(board);
	}

}
