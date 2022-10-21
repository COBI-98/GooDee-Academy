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
	<div>
		<img alt="" src="/file/qna/03a54640-0289-4dd8-9a42-6e8917150c84_title1.jpg">
		<a href="/fileDown/qna?fileName=03a54640-0289-4dd8-9a42-6e8917150c84_title1.jpg">down</a>
	</div>
	<div>
		<img alt="" src="/file/notice/title6.jpg">
		<a href="/fileDown/notice?fileName=title6.jpg">down</a>
	</div>
	
</body>
</html>