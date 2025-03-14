<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL</title>
</head>
<body>
	<!-- 리퀘스트 영역에서 id를 꺼낸다. -->
	<!-- query string으로 임시로 request를 보낼 수 있다. -->
<%-- 	<%= request.getParameter("id") =="ssafy" %> <br/>
	<%= request.getParameter("id").equals("ssafy") %> <br/> --%>
	
	<!-- EL -->
	== (EL) : ${param.id =="ssafy"} <br>
	
	<!-- EL equals -->
	eq (EL) : ${param.id eq "ssafy"} <br>
	
	${param.id}
	
</body>
</html>