<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 상세</title>
</head>
<body>
	<h2>${board.title }</h2>
	<div>
		${board.content}
	</div>
	
	<!-- 삭제 심플 -->
	<a href="board?act=remove&id=${board.id}">삭제</a>
	<a href="board?act=updateform&id=${board.id}">수정</a>
	
</body>
</html>