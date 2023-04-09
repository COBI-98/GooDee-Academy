<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- jquery -->
<script type="text/javascript" src="//code.jquery.com/jquery-3.6.0.min.js"></script>
<!-- bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">

<!-- include summernote css/js-->
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>
</head>
<style>
    .align-center {text-align: center;}
</style>
<body>


	<c:import url="../template/header.jsp"></c:import>
	
	<section class="container-fluid col-lg-4 mt-5">
		<div class="row">
 <form class="align-center" action="./add.esh" method="post" enctype="multipart/form-data">
 		<h1>${board} 작성 페이지</h1> <br>
        
        <div>
        글 제목<br>
        <input type="text" name="title" placeholder="글 제목을 입력하세요"><br>
        </div>
        <div>
        글 내용<br>
        <textarea id="contents" name="contents" rows="8" cols="55"></textarea>
        </div>
         <div>
        작성자<br>
        <input type="text" name="writer" readonly="readonly" value="${sessionScope.check.userName}"><br>
        </div>
        <div class="form-group">
					<label class="form-label mt-4" for="files1">Photo1</label>
					<input type="file" name="files" class="form-control is-valid" id="files1">
		</div>
		<div class="form-group">
					<label class="form-label mt-4" for="files2">Photo2</label>
					<input type="file" name="files" class="form-control is-valid" id="files2">
		</div>
		<div class="form-group">
					<label class="form-label mt-4" for="files3">Photo3</label>
					<input type="file" name="files" class="form-control is-valid" id="files3">
		</div>
				
        
        
        <input type="submit" name="add" value="책 추가" >
</form>
</div>
	
	</section>
	
	<c:import url="../template/footer.jsp"></c:import>
<!--  bootstrap -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
<script type="text/javascript">
	$("#contents").summernote();
</script>
<body>
</html>