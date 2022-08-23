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
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<style>
    .align-center {text-align: center;}
</style>
<body>


	<c:import url="../template/header.jsp"></c:import>
	
	<section class="container-fluid col-lg-4 mt-5">
		<div class="row">
		<h1>BANKBOOK LIST</h1><br>
	
	
	<table border="1" class="table">
		<thead class="table-dark">
			<tr>
				<th>BOOKNUM</th><th>BOOKNAME</th><th>BOOKRATE</th><th>BOOKSALE</th>
			</tr>
		</thead>
		<tbody>
			
			<c:forEach items="${list}" var ="dto">
					<tr>
						<td><a href="./detail.esh?bookNum=${pageScope.dto.bookNum}">${pageScope.dto.bookNum}</a></td>
						<td>${pageScope.dto.bookName}</td>
						<td>${pageScope.dto.bookRate}</td>
						<td>${pageScope.dto.bookSale}</td>					
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
	
	<button type="button" class="btn btn-primary container-fluid col-lg-4 mt-5" onclick="location.href='./add.esh'">상품등록</button>
	
	<!-- /bankook/detail jsp:detail.jsp-->
	<!--  link 주소는 상대경로 작성 -->
	
	</div>
	
	</section>
	
	<c:import url="../template/footer.jsp"></c:import>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>

</body>
</html>