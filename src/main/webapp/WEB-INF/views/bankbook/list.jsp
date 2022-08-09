<%@page import="com.esh.start.bankbook.BankBookDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 스크립틀릿 <% javacode 작성
	//표현식 <%= 자바변수 또는 값 % >
	ArrayList<BankBookDTO> ar = (ArrayList<BankBookDTO>)request.getAttribute("list");
%>

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
				
			<%for(BankBookDTO bankBookDTO:ar){ %>
				<tr>
					<td><a href="./detail?bookNum=<%=bankBookDTO.getBOOKNUM()%>"> <%=bankBookDTO.getBOOKNAME() %></a></td>
					<td><%=bankBookDTO.getBOOKNAME() %></td>
					<td><%=bankBookDTO.getBOOKRATE() %></td>
					<td><%=bankBookDTO.getBOOKSALE() %></td>
				</tr>
			<%} %>
			
		</tbody>
		
	</table>
	
	
	
	<!-- /bankook/detail jsp:detail.jsp-->
	<!--  link 주소는 상대경로 작성 -->
	<a href="./detail">detail 상대경로</a> 
	
</body>
</html>