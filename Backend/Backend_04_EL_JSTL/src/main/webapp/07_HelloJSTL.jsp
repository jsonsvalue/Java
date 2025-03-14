<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="jakarta.tags.core" %>	

	 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL</title>
</head>
<body>
	<c:out value ="Hello there ~"></c:out><br>
	
	<c:set var ="msg1" value = "Hello1"/>
	<c:set var ="msg1">Hello2</c:set>
	
	${msg1} <br>
	${msg2} <br>
	
	<c:set var = "p" value = "<%= new com.ssafy.dto.Person() %>"/>
	<c:set target = "${p}" property = "name" value = "JS"/>
	${p}
	
</body>
</html>