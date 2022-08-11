<%@page import="com.esh.start.bankbook.BankBookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%--  <%
    	BankBookDTO bankBookDTO = (BankBookDTO)request.getAttribute("test");
    %> --%>
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
					<td>${requestScope.test.getBOOKNUM()}</td>
					<td>${requestScope.test.getBOOKNAME()}</td>
					<td>${test.BOOKRATE}</td>
					<td>
					</td>
					
				</tr>
			
			
		</tbody>
		
	</table>
	

	
	<a href="../member/login">LOGIN 상대경로</a>
	<a href="/member/join">JOIN 절대경로</a>
	<a href="./list">리스트 보기</a> 
	
	<a href="./update?BOOKNUM=${requestScope.test.getBOOKNUM()}">수정하기</a>
	<a href="./delete?BOOKNUM=${requestScope.test.getBOOKNUM()}">삭제하기</a> 
	
</body>
</html>