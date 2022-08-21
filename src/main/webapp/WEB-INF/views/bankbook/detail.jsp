<%@page import="com.esh.start.bankbook.BankBookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%--  <%
    	BankBookDTO bankBookDTO = (BankBookDTO)request.getAttribute("test");
    %> --%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>BANKBOOK DETAIL</h1>
	
	
	<table border="1">
		<thead>
			<tr>
				<th>NUM</th><th>NAME</th><th>RATE</th><th>SALE</th>
			</tr>
		</thead>
		<tbody>
				
			
				<tr>
					<td>${requestScope.test.bookNum}</td>
					<td>${requestScope.test.bookRate}</td>
					<td>${test.bookRate}</td>
					<td>
					</td>
					
				</tr>
			
			
		</tbody>
		
	</table>
	

	
	<a href="../member/login.esh">LOGIN 상대경로</a>
	<a href="/member/join.esh">JOIN 절대경로</a>
	<a href="./list.esh">리스트 보기</a> 
	
	<a href="./update.esh?bookNum=${requestScope.test.bookNum}">수정하기</a>
	<a href="./delete.esh?bookNum=${requestScope.test.bookNum}">삭제하기</a> <br>
	
	

	<c:if test="${not empty sessionScope.check}">
	<a href="../bankAccount/add.esh?bookNum=${requestScope.test.bookNum()}">상품 가입하기</a>
	</c:if>
	
</body>
</html>