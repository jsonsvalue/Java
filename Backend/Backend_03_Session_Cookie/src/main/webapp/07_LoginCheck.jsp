<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <%
 	String id = request.getParameter("id");
 	String pw = request.getParameter("password");
 		
 	// ID, PW를 이용하여 DB에 해당 유저가 있는지 여부를 검사한다.
 	// 매니저를 이용해서 메모리를 통해 관리를 안하고 있다.
 	if(id.equals("hellojaeseok") && pw.equals("abcd")){
 		// request라는 객체를 통해서 세션을 가져올 수 있다.
 		out.println("Logged in successfully");
 		// HttpSession session1 = request.getSession();
 		session.setAttribute("loggedUser","jaeseok");
 		
 		// 페이지를 이동한다.
 		// 1. Forwarding (로그인 정보를 그대로 갖고 main.jsp 페이지로 갖고 가기 때문에, 부적절한 방법이다.)
 		// request.getRequestDispatcher("08_Main.jsp").forward(request, response);
 		response.sendRedirect("08_Main.jsp");
 		
 		
 		
 	}else{
 		out.println("Log in failed");
 		response.sendRedirect("07_LoginForm.jsp");
 	}
 	
 	
 	
 	
 	
 
 %>
 
 
 