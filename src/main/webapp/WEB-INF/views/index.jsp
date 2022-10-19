<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/css/test.css" rel="stylesheet">
	<c:if test="./temp/boot.jsp"></c:if>
</head>
<body>
	<h1>Index page</h1>
	<img src="/images/title1.jpg">
	<a href="./qna/list">qna리스트</a>
</body>
</html>