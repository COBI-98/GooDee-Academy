<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<c:if test="${empty sessionScope.check}">
<a href="./member/login.esh">Login</a><br>
<a href="./member/join.esh">join</a><br>
</c:if>

<c:if test="${not empty sessionScope.check}">
<h3>${sessionScope.check.userName} 님 환영합니다.</h3>
<a href="./member/logout.esh">Logout</a><br>
<a href="#">MyPage</a><br>
</c:if>

<a href="./bankbook/list.esh">list</a><br>
<a href="./bankbook/detail.esh?booknum=1">detail</a><br>
<a href="./bankbook/add.esh">add book</a><br>
<a href="./member/search.esh">search ID</a><br>
<p> <img src="resources/img/GOOD.png" height="200"></p>
</body>
</html>
