<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<h2>�Խñ� ���</h2>
	
	<form action = "board" method = "POST">
		<input type = "hidden" name = "act" value = "write">
		<div>
		�� ����:
		<input type = "text" name = "title">
		</div>
		
		<div>
		�۾���:
		<input type = "text" name = "title" value = "anonymous">
		</div>
		
		<div>
		�� ����:
		<textarea rows = "10" cols = "30" type = "text" name = "content"></textarea>
		</div>
		<button>�Խñ� ���</button>
		
	</form>
</body>
</html>