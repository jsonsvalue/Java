<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>이미지 등록 결과</h2>
	<!-- alt = 이미지 대체 문구, 파일 경로 -->
	<img src = "/img/${fileName}">
	
	<!-- 다운로드  요청 -->
	<a href = "/download?fileName=${fileName}">이미지 다운로드</a>
	
</body>
</html>