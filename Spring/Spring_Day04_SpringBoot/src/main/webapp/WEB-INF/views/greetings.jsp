<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="js" uri = "jakarta.tags.core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	
	<js:if test= "${empty loginUser}">
		<a href ="/login">로그인 페이지</a>
	</js:if>
	
	<js:if test= "${not empty loginUser}">
		<p>${loginUser} 님 반갑습니다.</p>
		<a href ="/logout">로그아웃</a>
	</js:if>
	 
	
	
	<h2>Greetings</h2>
	<p>${msg}</p>
	
</body>
</html>