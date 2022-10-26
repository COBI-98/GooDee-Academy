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

</head>
<body>

<c:import url="../temp/header.jsp"></c:import>

<section class="container-fluid col-lg-4 mt-5">
		<div class="row"> 
		<div><h1>회원가입</h1></div>
		
	<div class="row align-items-center justify-content-between">
        
            </div>
            <form class="align-center" action="join" method="post">
                <div class="form-group">
               		<label for="id" class="form-label mt-4">아이디</label>
                    <input type="text" name="id" class="form-control" id="id" >
					<div></div>
				</div>
				<div class="form-group">
					<label class="form-label mt-4" for="pw">비밀번호</label>
					<input type="password" name="pw" class="form-control" id="pw">
					<div id ="check0"></div>
				</div>
				
				

				<!-- <div class="form-group has-danger">
					<label class="form-label mt-4" for="inputInvalid">비밀번호 재확인</label> 
					<input type="password" class="form-control is-invalid" id="inputInvalid">
					<div class="invalid-feedback">비밀번호가 일치하지 않습니다</div>
				</div> -->
                <div class="form-group">
               		<label for="name1" class="form-label mt-4">이름</label>
                    <input type="text" name="name" class="form-control" id="name1" >
					<div></div>
				</div>
                
			                 
                <div class="form-group">
               		<label for="email" class="form-label mt-4">본인 확인 이메일</label>
                    <input type="text" name ="email"class="form-control" id="email" aria-describedby="emailHelp" placeholder="선택입력">
					<div></div>
				</div>
				
				
				
				<!--  <div class="form-group">
					<label class="form-label mt-4" for="files">Photo</label>
					<input type="file" name="photo" class="form-control" id="files">
					
				</div>-->
				
				<div class="d-grid gap-2 mt-4">
                    <button class="btn btn-primary btn-lg" type="submit" id="join" name="join">가입하기</button>
                </div>

            </form>

   </div>
	</section>
    
<script src="js/join.js"></script>
</body>
</html>