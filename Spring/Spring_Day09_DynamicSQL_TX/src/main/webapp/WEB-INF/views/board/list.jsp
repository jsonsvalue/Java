<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체 목록</title>
</head>
<body>
	<%@ include file ="../common/bootstrap.jsp" %>	
	
	<div class = "container">
		<h2>게시글 목록</h2>
		<hr>
		<%@ include file = "../common/searchForm.jsp" %>
		<table class = "table">
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>조회수</th>
				<th>작성일</th>
			</tr>
			<c:forEach items="${boardList}" var="board" >
				<tr>
					<td>${board.id}</td>
					<td><a href="/detail?id=${board.id}">${board.title}</a></td>
					<td>${board.writer}</td>
					<td>${board.viewCnt}</td>
					<td>${board.regDate}</td>
				</tr>
			</c:forEach>
			
		</table>
		<a href="/writeform">글 등록</a>
		
		
	</div>	
	
</body>
</html>