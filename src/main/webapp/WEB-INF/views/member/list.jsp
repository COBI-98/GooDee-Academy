<%@page import="java.util.ArrayList"%>
<%@page import="com.esh.start.member.BankMembersDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>list post</h1>
	
	<table border="1">
		<thead>
			<tr>
				<th>USERNAME</th><th>PASSWORD</th><th>NAME</th><th>EMAIL</th><th>PHONE</th>
			</tr>
		</thead>
		<tbody>
		<!-- core tag for문 -->
			<c:forEach begin="0" end="10" var="i" step="2">
				<h3>${i}</h3>
			</c:forEach>
			
			<c:forEach items="${list}" var="dto">
				<tr>
					<td>${pageScope.dto.USERNAME}</td>
					<td>${pageScope.dto.PASSWORD}</td>
					<td>${pageScope.dto.NAME}</td>
					<td>${pageScope.dto.EMAIL}</td>
					<td>${pageScope.dto.PHONE}</td>
				</tr>
			</c:forEach>
			
			
	
			
			<%-- <%for(BankMembersDTO bankMembersDTO:ar){ %>
				<tr>
					<td><%=bankMembersDTO.getUSERNAME()%></td>
					<td><%=bankMembersDTO.getPASSWORD()%></td>
					<td><%=bankMembersDTO.getNAME()%></td>
					<td><%=bankMembersDTO.getEMAIL()%></td>
					<td><%=bankMembersDTO.getPHONE()%></td>
				</tr>
			<%} %> --%>
			
		</tbody>
		
	</table>
	
	
</body>
</html>