<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <title>과일 상세</title>
</head>
<body>
    <h2>과일 상세 정보</h2>
    <c:if test="${empty fruit}">
        <p>해당 과일 정보가 없습니다.</p>
    </c:if>

    <c:if test="${not empty fruit}">
        <table border="1">
            <tr>
                <th>번호</th>
                <td>${fruit.fruitId}</td>
            </tr>
            <tr>
                <th>이름</th>
                 <td>${fruit.fruitName}</td>
            </tr>
            <tr>
                <th>맛</th>
                <td>${fruit.taste}</td>
            </tr>
            <tr>
                <th>가격</th>
                <td>${fruit.price}</td>
            </tr>
            <tr>
                <th>수량</th>
                <td>${fruit.quantity}</td>
            </tr>
        </table>

        <!-- 수정 버튼 -->
         <!-- Id값을 전달해야 해당 과일을 수정할 수 있다. -->
        <form action="${pageContext.request.contextPath}/fruit/updateform?fruitId=${fruit.fruitId}" method="POST">
            <input type="submit" value="수정">
        </form>

        <!-- 삭제 버튼 -->
        <!-- Id값을 전달해야 해당 과일을 삭제할 수 있다. -->
        <form action="${pageContext.request.contextPath}/fruit/delete?fruitId=${fruit.fruitId}" method="POST">
            <input type="submit" value="삭제">
        </form>
    </c:if>

    <p><a href="${pageContext.request.contextPath}/fruit/list">목록으로</a></p>
</body>
</html>
