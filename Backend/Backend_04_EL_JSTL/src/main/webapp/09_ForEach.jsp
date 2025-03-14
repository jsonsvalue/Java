<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>드라마 반복</title>
</head>
<body>
	<%
		String[] dramaList = {"폭삭 속았수다", "야인시대", "뿌리 깊은 나무", "태양의 후예"};
		pageContext.setAttribute("dramaList", dramaList);
	%>
	
	<c:forEach var = "drama" items = "${dramaList}" varStatus = "status" begin = "1" end = "4" step = "2">
		${status.index} : ${drama}|
		${status.count} : ${drama}<br>
		 
	
	</c:forEach>
	
	
</body>
</html>