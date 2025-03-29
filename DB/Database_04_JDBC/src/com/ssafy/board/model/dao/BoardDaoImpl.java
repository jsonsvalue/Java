package com.ssafy.board.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.ssafy.board.model.dto.Board;
import com.ssafy.board.util.DBUtil;

public class BoardDaoImpl implements BoardDao{
	
	// 싱글톤 패턴으로 관리한다.
	private static BoardDao dao = new BoardDaoImpl();
	
	private BoardDaoImpl() {	
	}
	
	// DB연결을 하고 없애는 객체를 생성한다.
	private DBUtil util = DBUtil.getInstance();
	
	
	public static BoardDao getInstance() {
		// TODO Auto-generated method stub
		return dao;
	}
	
	
	@Override
	public List<Board> selectAll() {
		List<Board> list = new ArrayList<>();
		String sql = "SELECT * FROM board";
		Connection connect = null;
		Statement st = null;
		ResultSet rs = null;
		
		try{
			connect = util.getConnection();
			st = connect.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				Board board = new Board();
				board.setId(rs.getInt("id"));
				board.setWriter(rs.getString("writer"));
				board.setTitle(rs.getString("title"));
				
				list.add(board);
			}
			
		
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			util.close(rs,st, connect);
		}
		
		return null;
	}

	// 게시글 하나 조회
	@Override
	public Board selectOne(int id) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM Board WHERE id=?";
		Board board = null;
		
		try {
			conn = util.getConnection();
			ps = conn.prepareStatement(sql);
			// i번째 인자를 무엇으로 설정할 것인지를 결정한다.
			ps.setInt(1, id);
			
			rs = ps.executeQuery();
			board = new Board();
			if(rs.next()) {
				board.setId(rs.getInt(id));
				board.setWriter(rs.getString(2));
				board.setTitle(rs.getString(3));
				board.setContent(rs.getString(4));
				
				
			}else {
				return null;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			util.close(rs, ps, conn);
		}
		
		
		return board;
	}

	@Override
	public void insertBoard(Board board) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		String sql = "Insert into board (title, writer, content) VALUES(?,?,?)";
		try {
			conn = util.getConnection();
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, board.getTitle());
			ps.setString(2, board.getWriter());
			ps.setString(3, board.getContent());
			
			int result = ps.executeUpdate();
			
			System.out.println(result);
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			util.close(ps, conn);
		}
		
		
		
	}

	@Override
	public void deleteBoard(int id) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		StringBuilder sb = new StringBuilder();
		sb.append("DELETE FROM board WHERE id=?");
		sb.append(id);
		
		String sql = "DELETE FROM board WHERE id=?";
		
		try {
			conn = util.getConnection();
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, id);
			int result = ps.executeUpdate();
			System.out.println(result);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			util.close(ps, conn);
		}
		
	}

	@Override
	public void updateBoard(Board board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateViewCnt(int id) {
		// TODO Auto-generated method stub
		
	}


	
}
