<%@page import="java.util.ArrayList"%>
<%@page import="com.esh.start.member.BankMembersDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
    ArrayList<BankMembersDTO> ar = (ArrayList<BankMembersDTO>)request.getAttribute("list");
    %>
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
				
			<%for(BankMembersDTO bankMembersDTO:ar){ %>
				<tr>
					<td><%=bankMembersDTO.getUSERNAME()%></td>
					<td><%=bankMembersDTO.getPASSWORD()%></td>
					<td><%=bankMembersDTO.getNAME()%></td>
					<td><%=bankMembersDTO.getEMAIL()%></td>
					<td><%=bankMembersDTO.getPHONE()%></td>
				</tr>
			<%} %>
			
		</tbody>
		
	</table>
	
	
</body>
</html>