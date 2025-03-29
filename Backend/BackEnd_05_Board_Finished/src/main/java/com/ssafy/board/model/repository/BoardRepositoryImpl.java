package com.ssafy.board.model.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ssafy.board.model.dto.Board;

public class BoardRepositoryImpl implements BoardRepository {

	private static BoardRepository repo = new BoardRepositoryImpl();
	// 게시글을 저장 관리 자료구조 하나 필요해!(메모리 관리)
	// List(관통때/개인학습용)
	private List<Board> list = new ArrayList<>();
	// Map(V)
	private Map<Integer, Board> map = new HashMap<>();

	private BoardRepositoryImpl() {
		map.put(1, new Board("아직은 괜찮아1", "양강사", "사실 안괜찮아"));

	}

	public static BoardRepository getInstance() {
		return repo;
	}

	@Override
	public List<Board> selectAll() {
//		return list;
		///////////////////////////////////////////////
//		return (List<Board>)map.values();

		List<Board> tmp = new ArrayList<>();
		for (int key : map.keySet()) {
			tmp.add(map.get(key));
		}
		return tmp;
	}

	@Override
	public Board selectOne(int id) {
		// 리스트는 반복문 돌면서 찾아!

		return map.get(id);
	}

	@Override
	public void insertBoard(Board board) {
		list.add(board);
		/////////////////////////////////////////
		map.put(board.getId(), board);
	}

	@Override
	public void updateBoard(Board board) {
		map.put(board.getId(), board); // 맵으로
	}

	@Override
	public void deleteBoard(int id) {
		// 리스트 였다면 반복문을 돌리면서 제거

		map.remove(id);

	}

	@Override
	public void updateViewCnt(int id) {
		Board b = map.get(id);
		b.setViewCnt(b.getViewCnt() + 1);
	}

}
