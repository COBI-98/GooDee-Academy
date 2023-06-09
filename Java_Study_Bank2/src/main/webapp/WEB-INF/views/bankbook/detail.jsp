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
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">

</head>
<style>
    .align-center {text-align: center;}
</style>
<body>


	<c:import url="../template/header.jsp"></c:import>
	
	<section class="container-fluid col-lg-4 mt-5">
		<div class="row">
	<h1>BANKBOOK DETAIL</h1>
	
	
	<table border="1"  class="table table-success table-striped">
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
	
	<button type="button" class="btn btn-primary" onclick="location.href='./list.esh'">리스트보기</button>
	<button type="button" class="btn btn-success" onclick="location.href='./update.esh?bookNum=${requestScope.test.bookNum}'">수정하기</button>
	<button type="button" class="btn btn-danger" onclick="location.href='./delete.esh?bookNum=${requestScope.test.bookNum}'">삭제하기</button>
	
	
	
	
	

	<c:if test="${not empty sessionScope.check}">
	<button type="button" class="btn btn-primary container-fluid col-lg-4 mt-5" onclick="location.href='../bankAccount/add.esh?bookNum=${test.bookNum}'">상품 가입하기</button>
	
	</c:if>
	</div>
	
	</section>
	
	<c:import url="../template/footer.jsp"></c:import>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
	
</body>
</html>