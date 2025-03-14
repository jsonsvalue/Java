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
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String act = request.getParameter("act");

		switch (act) {
		case "writeform":
			doWriteForm(request, response);
			break;
		case "write":
			doWrite(request, response);
			break;
		case "list":
			doList(request, response);
			break;
		case "detail":
			doDetail(request, response);
			break;
		case "remove":
			doRemove(request, response);
			break;
		case "updateform":
			doUpdateForm(request, response);
			break;
		case "update":
			doUpdate(request, response);
			break;
		default:
			break;
		}

	}

	private void doUpdate(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		//해보아라~
	}

	private void doUpdateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		Board board = service.getBoard(id);
		request.setAttribute("board", board);
		request.getRequestDispatcher("/WEB-INF/board/updateform.jsp").forward(request, response);
		
	}

	private void doRemove(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		service.removeBoard(id);
		//게시글을 지웠으니 메인페이지로 가던가... 게시글 전체 목록으로 
		response.sendRedirect("board?act=list");
	}

	private void doDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		request.setAttribute("board", service.getBoard(id));
		request.getRequestDispatcher("/WEB-INF/board/detail.jsp").forward(request, response);
		
	}

	private void doList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("list", service.getList());
		request.getRequestDispatcher("/WEB-INF/board/list.jsp").forward(request, response);
	}

	private void doWrite(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		//파리미터를 모아서 DTO 생성
		Board board = new Board(title, writer, content);
		
		//게시글을 등록! -> 서비스 호출
		service.writeBoard(board);
		
		
		//게시글 등록확인 
		//1. 게시글 상세보기
		
		//2. 게시글 전체보기
		response.sendRedirect("board?act=list");
		
	}

	private void doWriteForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 작성 페이지 주세요~~~
		request.getRequestDispatcher("/WEB-INF/board/writeform.jsp").forward(request, response);
	}
}
