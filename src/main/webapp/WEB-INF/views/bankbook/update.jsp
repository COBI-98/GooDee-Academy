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
 <form class="align-center" action="./update.esh" method="post">
 		<h1>상품 업데이트</h1> <br>
 		<div>
        책번호<br>
        <input type="text" name="bookNum" readonly="readonly" value = "${requestScope.update.bookNum}"><br>
        </div>
 		<div>
        책이름<br>
        <input type="text" name="bookName" value = "${requestScope.update.bookName}"><br>
        </div>
        <div>
        할인율<br>
        <input type="text" name="bookRate" value = "${requestScope.update.bookRate}"><br>
        </div>
      
        <input type="submit" name="update" value="책 업데이트" >
        <a href="./detail.esh?bookNum=${requestScope.update.bookNum}">리스트 보기</a> 


</form>

</div>
	
	</section>
	
	<c:import url="../template/footer.jsp"></c:import>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>

<body>
</html>