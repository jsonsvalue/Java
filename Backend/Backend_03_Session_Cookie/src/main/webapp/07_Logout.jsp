<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그아웃</title>
</head>
<body>
	<!-- 로그인된 유저를 지운다. -->
	<% session.removeAttribute("loggedUser"); %>
	
	<!-- 세션 자체를 지운다. -->
	<%
	session.invalidate();
	response.sendRedirect("index.html");
	%>
	
	
	
</body>
</html>