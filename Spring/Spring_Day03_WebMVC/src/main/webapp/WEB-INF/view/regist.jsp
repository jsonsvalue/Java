<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- regist라는 action에 따라 들어오는 요청을, 특정 데이터로 응답을 보내겠다. -->
	<form action="regist" method="POST">
		<input type="text" name="id">
		<input type="password" name="pw">
		<button>로그인</button>
	</form>
	
</body>
</html>