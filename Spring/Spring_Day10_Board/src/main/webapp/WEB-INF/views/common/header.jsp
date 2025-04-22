<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "jakarta.tags.core" %>    
<div>
	
	<!-- if 문에서 test는 조건문을 적는 곳이다.  -->
	<!-- 로그인 안한 경우 -->
	<c:if test="${empty loginUser}">
		<a href="/login" class="btn btn-outline-warning">로그인</a>
		<a href="/signup" class="btn btn-outline-warning">회원가입</a>		
	</c:if>
	
	<!-- 로그인 한 경우 -->
	<c:if test="${not empty loginUser}">
		<a href = "/logout" class = "btn btn-outline-danger">로그아웃</a>
	</c:if>
	
</div>    
