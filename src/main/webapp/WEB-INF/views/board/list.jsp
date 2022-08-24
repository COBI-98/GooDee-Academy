<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
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
	<div>
	<h1>${board} List Page</h1>
	</div>
	<table border="1" class="table">
		<thead class="table-dark">
			<tr>
				<th>NUM</th><th>TITLE</th><th>WRITER</th><th>REGDATE</th><th>HITS</th>
			</tr>
		</thead>
		<tbody>
			
			
			<c:forEach items="${list}" var ="dto">
					<tr>
						<td><a href ="./detail.esh?num=${pageScope.dto.num}">${pageScope.dto.num}</a></td>
						<td>${dto.title}</td>
						<td>${dto.writer}</td>	
						<td>${dto.regDate}</td>
						<td>${dto.hit}</td>	
									
					</tr>
			</c:forEach>
			
			<c:if test="${board}=Notice">
			</c:if>
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
	
	<nav aria-label="Page navigation example">
  <ul class="pagination">
    <li class="page-item">
      <a class="page-link" href="#" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a>
    </li>
    
	<c:forEach begin="${pager.startNum }" end="${pager.lastNum}" var ="i">
	<li class="page-item"><a class="page-link" href="?page=${i}">${i }</a></li>
	</c:forEach>
	
	
	<li class="page-item">
      <a class="page-link" href="#" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
    </li>
	</ul>
</nav>
	</div>
	
	</section>
	
	<c:import url="../template/footer.jsp"></c:import>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
	
</body>
</html>