<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
</head>
<body>
	<h2>로그인</h2>
	<form method = "POST" action = "/login">
		ID: <input name = "id" type = "text" >
		PW: <input name = "pw" type = "password" >
		<input type = "submit" value = "login">
	</form>
	
	
</body>
</html>