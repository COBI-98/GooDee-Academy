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
 <form class="align-center" action="./add.esh" method="post">
 		<h1>상품 추가 페이지</h1> <br>
 		<div>
        책 이름<br>
        <input type="text" name="bookName" placeholder="책 이름을 입력하세요"><br>
        </div>
        <div>
        할인율<br>
        <input type="text" name="bookRate" placeholder="할인율을 입력하세요"><br>
        </div>
        <input type="submit" name="add" value="책 추가" >
        
</form>

</div>
	
	</section>
	
	<c:import url="../template/footer.jsp"></c:import>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>

<body>

</html>