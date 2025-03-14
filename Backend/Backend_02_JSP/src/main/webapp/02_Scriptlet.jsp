<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트릿</title>
</head>
<body>
	<h2>스크립트릿 연습</h2>
	
	<h2>합 구하기</h2>
	<%
	// 자바 코드 작성 가능
	int A = 10;
	int B = 20; 
	
	int sum = A+B;
	
	out.print(A+"+"+B+"="+sum);
	%>

	<br></br>
	
	<h2>구구단</h2>
	<%
	for(int i=2; i<=9; i++){
		for(int j=1; j<=9; j++){
			out.print(i+"*"+j+"="+(i*j));
	%>
	<br></br>
	<%
		}
	}
	%>

	<a href="index.html">홈으로</a>
</body>
</html>
