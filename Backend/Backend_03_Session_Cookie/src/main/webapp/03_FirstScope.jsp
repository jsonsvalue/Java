<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 기본객체</title>
</head>
<body>
	<!-- 접속한 페이지는 1번째 페이지지만, 이어진 것은 2번째 페이지이다. -->
	<!-- 그래서 페이지가 바뀌었기 때문에, 페이지 속성이 나오지 않는 것이다. -->
	<%
		pageContext.setAttribute("name", "page 1");
		request.setAttribute("name", "request 1");
		session.setAttribute("name", "session 1");
		application.setAttribute("name", "application 1");
		
		System.out.println("03_FirstScope.jsp");
		System.out.println("페이지 속성 " + pageContext.getAttribute("name"));
		System.out.println("요청 속성 "+ request.getAttribute("name"));
		System.out.println("세션 속성 "+ session.getAttribute("name"));
		System.out.println("어플리케이션 속성 "+ application.getAttribute("name"));
		
		request.getRequestDispatcher("04_SecondScope.jsp").forward(request, response);
		
	%>
	
	
</body>
</html>