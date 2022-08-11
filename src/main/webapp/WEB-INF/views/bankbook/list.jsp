<%@page import="com.esh.start.bankbook.BankBookDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%
	// 스크립틀릿 <% javacode 작성
	//표현식 <%= 자바변수 또는 값 % >
	//요청이 발생하면 생성, 응답이 나가면 소멸(이러한 생명주기) : RequestScope
	ArrayList<BankBookDTO> ar = (ArrayList<BankBookDTO>)request.getAttribute("list");
%> --%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>BANKBOOK LIST</h1><br>
	
	
	<table border="1">
		<thead>
			<tr>
				<th>BOOKNUM</th><th>BOOKNAME</th><th>BOOKRATE</th><th>BOOKSALE</th>
			</tr>
		</thead>
		<tbody>
			
			<c:forEach items="${list}" var ="dto">
					<tr>
						<td><a href="./detail?BOOKNUM=${pageScope.dto.BOOKNUM}">${pageScope.dto.BOOKNUM}</a></td>
						<td>${pageScope.dto.BOOKNAME}</td>
						<td>${pageScope.dto.BOOKRATE}</td>
						<td>${pageScope.dto.BOOKSALE}</td>					
					</tr>
			</c:forEach>
				
			<%-- <%for(BankBookDTO bankBookDTO:ar){ %>
				<tr>
					<td><a href="./detail?BOOKNUM=<%=bankBookDTO.getBOOKNUM()%>"> <%=bankBookDTO.getBOOKNUM() %></a></td>
					<td><%=bankBookDTO.getBOOKNAME() %></td>
					<td><%=bankBookDTO.getBOOKRATE() %></td>
					<td><%=bankBookDTO.getBOOKSALE() %></td>
				</tr>
			<%} %> --%>
			
		</tbody>
		
	</table>
	
	
	
	<!-- /bankook/detail jsp:detail.jsp-->
	<!--  link 주소는 상대경로 작성 -->
	<a href="./add">상품등록</a>
	
</body>
</html>