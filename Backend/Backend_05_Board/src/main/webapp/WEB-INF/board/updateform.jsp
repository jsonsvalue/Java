<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정</title>
</head>
<body>
	<h2>게시글 수정</h2>
	<form action="board" method="POST">
		<input type="hidden" name="act" value="update">
		<input type="hidden" name="id" value="${board.id }">
		<div>글제목 : <input type="text" name="title" value="${board.title }"></div>
		<div>글쓰니 : <input type="text" name="writer"  readonly="readonly" value="${board.writer }"></div>
		<div>글내용 : <textarea rows="10" cols="30" name="content">${board.content }</textarea></div>
		<button>게시글수정</button>	
	</form>
</body>
</html>