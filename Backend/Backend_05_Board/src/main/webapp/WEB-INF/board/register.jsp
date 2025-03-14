<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<h2>게시글 등록</h2>
	
	<form action = "board" method = "POST">
		<input type = "hidden" name = "act" value = "write">
		<div>
		글 제목:
		<input type = "text" name = "title">
		</div>
		
		<div>
		글쓴이:
		<input type = "text" name = "title" value = "anonymous">
		</div>
		
		<div>
		글 내용:
		<textarea rows = "10" cols = "30" type = "text" name = "content"></textarea>
		</div>
		<button>게시글 등록</button>
		
	</form>
</body>
</html>