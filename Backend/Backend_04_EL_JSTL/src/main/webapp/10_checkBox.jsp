<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>반찬고르기</title>
</head>
<body>
	<h2>반찬을 골라보자</h2>
	<form action="10_checkBoxResult.jsp">
		<input type ="cehckbox" name = "dish" value = "계란말이"> 계란말이
		<input type ="cehckbox" name = "dish" value = "연근"> 연근
		<input type ="cehckbox" name = "dish" value = "제육"> 제육
		<input type ="cehckbox" name = "dish" value = "김치"> 김치
		<input type ="cehckbox" name = "dish" value = "시금치"> 시금치
		<button>구매</button>
	</form>
</body>
</html>