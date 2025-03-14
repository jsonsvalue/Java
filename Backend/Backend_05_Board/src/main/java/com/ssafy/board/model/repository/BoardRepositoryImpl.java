package com.ssafy.board.model.repository;

import java.util.*;

import com.ssafy.board.model.dto.Board;

public class BoardRepositoryImpl implements BoardRepository{
	private static BoardRepository repo = new BoardRepositoryImpl();
	
	// 게시글을 저장하기 위한 자료구조를 생성한다.
	private List<Board> list = new ArrayList<>();
	private Map<Integer, Board> map = new HashMap<>();
	
	
	private BoardRepositoryImpl() {
	}
	
	public static BoardRepository getInstance() {
		return repo;
	}
	
	@Override
	public List<Board> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Board selectOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertBoard(Board board) {
		list.add(board);
		map.put(board.getId(), board);
	}

	@Override
	public void updateBoard(Board board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBoard(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateViewCnt(int id) {
		// TODO Auto-generated method stub
		
	}

}
