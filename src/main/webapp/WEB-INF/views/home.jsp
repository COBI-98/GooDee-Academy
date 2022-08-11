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
<c:if test="${empty check}">
<a href="./member/login">Login</a><br>
<a href="./member/join">join</a><br>
</c:if>

<c:if test="${not empty check}">
<a href="#">Logout</a>
<a href="#">MyPage</a>
</c:if>

<a href="./bankbook/list">list</a><br>
<a href="./bankbook/detail?booknum=1">detail</a><br>
<a href="./bankbook/add">add book</a><br>
<a href="./member/search">search ID</a><br>
<p> <img src="resources/img/GOOD.png" height="200"></p>
</body>
</html>
