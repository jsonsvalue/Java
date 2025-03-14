<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL</title>
</head>
<body>
	<%
		//pageContext.setAttribute("name", "pageAtt");
		request.setAttribute("name", "requestAtt");
		session.setAttribute("name", "sessionAtt");
		application.setAttribute("name", "appAtt");
	%>
	
	<%=pageContext.getAttribute("name")%> <br>
	
	${pageScope.name} <br>
	${requestScope.name} <br>
	${sessionScope.name} <br>
	${applicationScope.name} <br>
	${cookie.JSESSIONID.value} <br>
	
	<!-- page, request, session, application 중 scope 상 가장 가까운 것이 출력된다. -->
	<h2>어떤 것이 나올까?</h2>
	${name}

</body>
</html>