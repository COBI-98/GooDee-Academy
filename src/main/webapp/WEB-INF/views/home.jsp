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
<a href="./member/login">Login</a><br>
<a href="./member/join">join</a><br>
<a href="./bankbook/list">list</a><br>
<a href="./bankbook/detail?booknum=1">detail</a><br>
<a href="./bankbook/add">add book</a><br>
<a href="./member/search">search ID</a>
</body>
</html>
