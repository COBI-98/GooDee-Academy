<%@page import="com.esh.start.bankbook.BankBookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	BankBookDTO bankBookDTO = (BankBookDTO)request.getAttribute("test");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>BANKBOOK DETAIL</h1>
	
	<% if (bankBookDTO != null) { %>
	<table border="1">
		<thead>
			<tr>
				<th>NUM</th><th>NAME</th><th>RATE</th><th>SALE</th>
			</tr>
		</thead>
		<tbody>
				
			
				<tr>
					<td><%=bankBookDTO.getBOOKNUM() %></td>
					<td><%=bankBookDTO.getBOOKNAME() %></td>
					<td><%=bankBookDTO.getBOOKRATE() %></td>
					<td><% if(bankBookDTO.getBOOKSALE()==1){%>
							판매중
						<%}else{ %>
							판매금지
						<%} %>	
					</td>
					
				</tr>
			
			
		</tbody>
		
	</table>
	<% } else {%>
      <h3> no data</h3>
      <%} %>

	
	<a href="../member/login">LOGIN 상대경로</a>
	<a href="/member/join">JOIN 절대경로</a>
	
</body>
</html>