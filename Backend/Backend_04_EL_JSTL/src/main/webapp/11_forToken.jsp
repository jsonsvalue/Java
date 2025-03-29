<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>캠퍼스</title>
</head>
<body>
	<h2>캠퍼스</h2>
	
	<c:forTokens var = "campus" items = "서울,대전,광주,구미,부울경" delims = ",">
		${campus}<br>
	</c:forTokens>
	
	
	
</body>
</html>