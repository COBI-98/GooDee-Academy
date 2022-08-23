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
	<h1>List Page</h1>
	
	
	
	
	<table border="1">
		<thead>
			<tr>
				<th>QNANUM</th><th>TITLE</th><th>CONTENT</th><th>WRITER</th><th>BOARDDATE</th><th>HITS</th><th>REF</th><th>STEP</th><th>DEPTH</th>
			</tr>
		</thead>
		<tbody>
			
			<c:forEach items="${list}" var ="dto">
					<tr>
						<td><a href ="./detail.esh?qnaNum=${pageScope.dto.qnaNum}">${pageScope.dto.qnaNum}</a></td>
						<td>${dto.title}</td>
						<td>${dto.content}</td>
						<td>${dto.writer}</td>	
						<td>${dto.regDate}</td>
						<td>${dto.hits}</td>	
						<td>${dto.ref}</td>
						<td>${dto.step}</td>
						<td>${dto.depth}</td>			
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
	<c:if test="${not empty sessionScope.check}">
	<a href="./add.esh">글쓰기</a><br>
	</c:if>
	
	
</body>
</html>