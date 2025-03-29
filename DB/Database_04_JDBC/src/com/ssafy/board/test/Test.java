package com.ssafy.board.test;

import com.ssafy.board.model.dao.BoardDao;
import com.ssafy.board.model.dao.BoardDaoImpl;
import com.ssafy.board.model.dto.Board;

public class Test {
	public static void main(String[] args) {
		BoardDao dao = BoardDaoImpl.getInstance();
//		System.out.println(dao.selectOne(1));
				
// 		dao.insertBoard(new Board("안녕하세요", "JS", "처음 뵙겠습니다."));
		
//		for(int i=0; i < 30; i++) {
//			
//		}
		
		dao.deleteBoard(1);
		
	}
}
