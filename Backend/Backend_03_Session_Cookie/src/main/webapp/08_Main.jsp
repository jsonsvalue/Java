<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인화면</title>
</head>
<body>
	<h1>메인화면</h1>
	
	<!-- 로그인 하지 않았다면, 로그인 페이지로 이어지게 만든다. -->
	<%
		if(session.getAttribute("loggedUser")==null){
			response.sendRedirect("07_LoginForm.jsp");
		}else{
			%>
			
			<%= session.getAttribute("loggedUser") %>님 반갑습니다.
			
			<%
		}
	%>
	
	<!-- 로그아웃 -->
	<form action = "07_Logout.jsp" method = "POST">
		<button>로그아웃</button>
	</form>
	<a href = "07_Logout.jsp">로그아웃 링크</a>
	
	
	
	
</body>
</html>