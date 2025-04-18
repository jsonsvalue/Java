<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<!-- action을 비워 놓으면, 똑같은 경로에 POST요청을 보내는 것이다. -->
	<!--  tomcat 안 넣어두면 해당되는 경로를 찾을 수 없다는 것을 잊지 말자. -->
	<h2>다중 파일 업로드</h2>
	<form action = "/multipleFileUpload" method = "POST" enctype = "multipart/form-data">
		<input type = "file" name = "files" multiple = "multiple">
		<button>파일 등록</button>
		
		
	</form>
	
	
</body>
</html>