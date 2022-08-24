<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
 <form class="align-center" action="./update.esh" method="post">
 		<h1>${board} 글 수정하기</h1> <br>
 		<div>
        글 번호<br>
        <input type="text" name="num" readonly="readonly" value = "${update.num}"><br>
        </div>
 		<div>
        글 제목<br>
        <input type="text" name="title" value = "${update.title}"><br>
        </div>
        <div>
        내용<br>
        <input type="text" name="contents" value = "${update.contents}"><br>
        </div>
      	
        <input type="submit" name="update" value="글 업데이트" >
        <a href="./detail.esh?num=${update.num}">리스트 보기</a>  
</form>

</div>
	
	</section>
	
	<c:import url="../template/footer.jsp"></c:import>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
	
</body>
</html>