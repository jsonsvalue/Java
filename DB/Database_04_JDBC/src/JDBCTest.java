import java.util.*;

import java.sql.*;

import com.ssafy.board.model.dto.Board;

public class JDBCTest {
	public JDBCTest() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully");
			
		}catch(ClassNotFoundException e) {
			System.out.println("Driver Loading Failed");
		}
	}
	
	public static void main(String[] args) {
		JDBCTest db = new JDBCTest();
		
		for(Board board: db.selectAll()) {
			System.out.println(board);
		}
		
	}
	
	
	// 전체 게시글 조회 
	private List<Board> selectAll(){
		List<Board> list = new ArrayList<>();
		
		try{
			// DriverManager의 static 메서드를 써서, (URL, userId, userPassword)를 통해서 DB에 연결한다. 
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssafy_board?serverTimezone=UTC", "ssafy", "ssafy1234");
			// Query를 보낼 때 쓰는 객체이다.
			Statement st = connect.createStatement();
			
			// st에 query를 담아서 rs에 담아서 결과를 받는다.
			String sql = "SELECT * FROM board";
			// Query를 실행하고 다시 받을 때 쓰는 객체이다.
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				// Query를 실행하고 반환된 값을 board 객체에 저장한다. 
				Board board = new Board();
				board.setId(rs.getInt("id"));
				board.setWriter(rs.getString("writer"));
				board.setTitle(rs.getString("title"));
				
				// DB에서 받은 정보를 list에 추가한다.
				list.add(board);
			}
			
			// System.out.println(rs);
			
			rs.close();
			st.close();
			connect.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return list;
		
	}
		
	
	
}
