package com.ssafy.servlet;

import java.io.IOException;

import com.ssafy.dto.Person;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/main")
public class MainServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		doProcess(req, resp);
//		
//	}
//	
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		doProcess(req, resp);
//	}
//	
//	private void doProcess() {
//		// TODO Auto-generated method stub
//
//	}

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// GET, POST 모두 다 요청과 관련이 있어서,
		// method를 가져와서 GET, POST를 구분할 수 있다.
		
		String method = req.getMethod();
		
		String act = req.getParameter("act");
		
		switch(act) {
		case "regist":
			doRegist(req,resp);
			break;
		
		}
		
	
	}

	private void doRegist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String gender = req.getParameter("gender");
		String[] hobbies = req.getParameterValues("hobby");
		
		Person p = new Person(name, age, gender, hobbies);
		
		req.setAttribute("person", p);
		
		// RequestDispatcher 같은 서버 내에서, 다른 Servlet, JSP로 요청을 넘겨주는 역할을 한다.
		// req.setAttribute로 설정한 데이터를 보낼 수 있다.
		// 다른 자원으로 데이터를 넘기는 disp 객체에, req, resp 데이터를 담아서 보낸다. 
		RequestDispatcher disp = req.getRequestDispatcher("/12_result.jsp");
		disp.forward(req, resp);
		
//		resp.sendRedirect("12_result.jsp");
		
			
	}
	
	
}
