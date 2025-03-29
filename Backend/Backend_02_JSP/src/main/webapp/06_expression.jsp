<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%!
	int A = 30;
	int B = -10;
	
	String name = "JS";
	
	public int add(int A, int B){
		return A+B;
	}
	
	public int abs(int A){
		return A > 0 ? A: -A;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현식</title>
</head>
<body>
	<% out.print(name);%></br>
	<%= name %>			</br>
	<%= A+B %>			</br>
	<%= abs(B) %>		</br>
		


	<a href="index.html">홈으로</a>
</body>
</html>