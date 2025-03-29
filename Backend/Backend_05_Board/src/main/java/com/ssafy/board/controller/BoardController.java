package com.ssafy.board.controller;

import java.io.IOException;

import com.ssafy.board.model.dto.Board;
import com.ssafy.board.model.service.BoardService;
import com.ssafy.board.model.service.BoardServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/board")
public class BoardController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private BoardService service = BoardServiceImpl.getInstance();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String act = req.getParameter("act");
		
		switch(act) {
		case "register":
			doRegist(req, resp);
			break;
		
		case "write":
			doWrite(req,resp);
			break;
			
			
		default:
			break;
			
		}
		
	}

	private void doWrite(HttpServletRequest req, HttpServletResponse resp) {
		String title = req.getParameter("title");
		String writer = req.getParameter("writer");
		String content = req.getParameter("content");
		
		// 필요한 변수를 모아서 DTO 객체를 생성한다.
		Board board = new Board(title, writer, content);
		
		// 서비스를 호출하여, 게시글을 등록한다.
		service.writeBoard(board);
		
		
		
	}

	private void doRegist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/board/register.jsp").forward(req, resp);
	}
	
}
