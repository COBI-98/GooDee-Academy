<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temp/boot.jsp"></c:import>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<style>
    .align-center {text-align: center;}
</style>
<body>

	<c:import url="../temp/header.jsp"></c:import>
	<section class="container-fluid col-lg-4 mt-5">
		<div class="row">
		<main class="form-signin w-100 m-auto">
		  <form action="./login" method="post" id ="frm">
  		  <img class="mb-4" src="../../../../resources/static/images/title1.jpg" alt="" width="100" height="100">
  		  <h1 class="h3 mb-3 fw-normal">아이디를 입력하세요</h1>

   		 	<div class="form-floating">
   		 
   	  		 <input type="text" name="id" id = "pw" class="form-control" placeholder="name@example.com">
    		 
   		</div>
   			 <div class="form-floating">
   			 <h1 class="h3 mb-3 fw-normal">비밀번호를 입력하세요</h1>
      		<input type="text" name="pw" id = "pw" class="form-control" placeholder="Password">
  		</div>

    		<div class="checkbox mb-3">
     			 <label>
     		   <input type="checkbox" value="remember-me"> Remember me
     		 </label>
   		 </div>
   		 <button class="w-100 btn btn-lg btn-primary" id="btn" type="submit" name="login">로그인</button>
    	<p class="mt-5 mb-3 text-muted">© 2017–2022</p>
  		</form>
		</main>
		</div>
	
	</section>

</body>
</html>