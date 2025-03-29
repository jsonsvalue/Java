package com.ssafy.cookie;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/make")
public class MainServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request에서 받은 key, value를 추출한다.
		String key = request.getParameter("key");
		String value = request.getParameter("value");
		
		// 쿠키를 설정한다.
		Cookie cookie = new Cookie(key, value);
		
		// 쿠키 만료 시간
		cookie.setMaxAge(60);

		// 쿠키를 삭제하기 위해서는 setMaxAge(0)으로 한다.
		// cookie.setMaxAge(0);
		
		// 응답에 cookie를 추가한다.
		response.addCookie(cookie);
		
		response.sendRedirect("02_CookieResult.jsp");
	}
}
