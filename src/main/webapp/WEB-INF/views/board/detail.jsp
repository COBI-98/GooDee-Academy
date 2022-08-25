<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
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
	<H1>${board} 상세 보기</H1>
	<c:if test="${board == 'Notice'}">
	<table border="1" class="table">
		<thead class="table-dark">
		<thead>
			<tr>
				<th>글 번호</th><th>글 제목</th><th>글 내용</th><th>작성자</th><th>글 작성일</th><th>조회수</th>
			</tr>
		</thead>
		<tbody>
				
			
				<tr>
					<td>${detail.num}</td>
					<td>${detail.title}</td>
					<td>${detail.contents}</td>
					<td>${detail.writer}</td>
					<td>${detail.regDate}</td>
					<td>${detail.hit}</td>
					
				</tr>
			
			
		</tbody>
		
	</table>
	</c:if>
	
	<c:if test="${board == 'Qna'}">
	<table border="1" class="table">
		<thead class="table-dark">
		<thead>
			<tr>
				<th>글 번호</th><th>글 제목</th><th>글 내용</th><th>작성자</th><th>글 작성일</th><th>조회수</th>
				<th>질문글,그룹</th><th>질문글,답글</th><th>답글 깊이</th>
			</tr>
		</thead>
		<tbody>
				
			
				<tr>
					<td>${detail.num}</td>
					<td>${detail.title}</td>
					<td>${detail.contents}</td>
					<td>${detail.writer}</td>
					<td>${detail.regDate}</td>
					<td>${detail.hit}</td>
					<td>${detail.ref}</td>
					<td>${detail.step}</td>
					<td>${detail.depth}</td>
					
				</tr>
			
			
		</tbody>
		
	</table>
	</c:if>
	
	<c:if test="${sessionScope.check.userName == detail.writer}">
	<a href = "./update.esh?num=${detail.num}" class="btn btn-success">글 수정하기</a><br>
	<a href = "./delete.esh?num=${detail.num}" class="btn btn-danger">글 삭제하기</a>
	</c:if>
	
	<div class="row col-lg-4 mt-5">
		<a href="./reply.esh?num=${detail.num}" class="btn btn-danger">Reply</a>
	</div>
	
</div>
	
	</section>
	
	<c:import url="../template/footer.jsp"></c:import>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
		
</body>
</html>