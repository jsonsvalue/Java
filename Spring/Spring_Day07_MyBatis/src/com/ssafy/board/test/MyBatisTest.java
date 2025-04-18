package com.ssafy.board.test;

import org.apache.ibatis.session.SqlSession;

import com.ssafy.board.config.MyBatisConfig;
import com.ssafy.board.model.dao.BoardDao;
import com.ssafy.board.model.dto.Board;

public class MyBatisTest {
	public static void main(String[] args) {
		// myBatisConfig에서 만든 객체를 통해, Dao를 만들고 DB에 SQL문을 이용해서 데이터를 저장한다.
		
		// 전체 게시글 가져오기 
		try(SqlSession session = MyBatisConfig.getFactory().openSession(true)){ 
			  //List<Board> list =  session.selectList("com.ssafy.model.dao.BoardDao.selectAll") 
			  BoardDao dao = session.getMapper(BoardDao.class);
		  
			  for(Board board : dao.selectAll()){ 
				  System.out.println(board);
			  }
		  
		  }
		 
		
		// 상세 게시글 가져오기
//		try(SqlSession session = MyBatisConfig.getFactory().openSession(true)){
//			//List<Board> list = session.selectList("com.ssafy.model.dao.BoardDao.selectAll")
//			BoardDao dao = session.getMapper(BoardDao.class);
//			
//			System.out.println(dao.selectOne(2));
//			
//		}
		
		// 게시글 등록
		try(SqlSession session = MyBatisConfig.getFactory().openSession(true)){
			//List<Board> list = session.selectList("com.ssafy.model.dao.BoardDao.selectAll")
			BoardDao dao = session.getMapper(BoardDao.class);
			
			System.out.println(dao.insertBoard(new Board("점심 메뉴 추천 좀", "이재석", "맛있는 메뉴 좀 추천해줘")));
		
		}
		
		// 게시글 삭제
		try(SqlSession session = MyBatisConfig.getFactory().openSession(true)){
			//List<Board> list = session.selectList("com.ssafy.model.dao.BoardDao.selectAll")
			BoardDao dao = session.getMapper(BoardDao.class);
			
			dao.deleteBoard(2);
		}
		
		// 게시글 수정
		try(SqlSession session = MyBatisConfig.getFactory().openSession(true)){
			//List<Board> list = session.selectList("com.ssafy.model.dao.BoardDao.selectAll")
			// 게시글 중에서 하나를 선택하고 내용을 업데이트 한 후,
			// 해당 내용에 맞게 게시글을 수정한다.
			BoardDao dao = session.getMapper(BoardDao.class);
			Board board = dao.selectOne(4);
			board.setContent("사실 오늘은 점심 안 먹을거야.");
			
			dao.updateBoard(board);
			
			System.out.println(dao.selectOne(4));
		}
		
		
		
	}
}
