<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%!
	int cnt1 =0;
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>호출</title>
</head>
<body>

	<%
		int cnt2 = 0;
		
		out.print("cnt1 :" + (++cnt1));
		out.print("<br/>");
		out.print("cnt2 :" + (++cnt2));
	%>
	<br></br>

	<a href="index.html">홈으로</a>
</body>
</html>