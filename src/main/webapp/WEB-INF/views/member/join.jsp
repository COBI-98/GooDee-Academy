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
    
    .bg-light{
		height: 1053px;
		padding-top:55px;
		padding-bottom:75px;
	}
	.flex-fill.mx-xl-5.mb-2{
		margin: 0 auto;
		width : 700px;
		padding-right: 7rem;
		padding-left: 7rem;
	}
    <!-- 입력창 -->
	.container.py-4{
		margin: 0 auto;
		width : 503px;
	}
    <!-- 가입하기 -->
	.d-grid.gap-2{
		padding-top: 30px;
	}
    
    <!-- 생년월일 -->
	.bir_yy,.bir_mm,.bir_dd{
		width:160px;
		display:table-cell;
	}
	.bir_mm+.bir_dd, .bir_yy+.bir_mm{
		padding-left:10px;
	}
	
</style>
<body>

<c:import url="../template/header.jsp"></c:import>

<section class="container-fluid col-lg-4 mt-5">
		<div class="row"> 
		<div><h1>회원가입</h1></div>
		
<div class="row align-items-center justify-content-between">
        
            </div>
            <form class="align-center" action="join.esh" method="post">
                <div class="form-group">
               		<label for="exampleInputEmail1" class="form-label mt-4">아이디</label>
                    <input type="text" name="userName" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                </div>
				<div class="form-group has-success">
					<label class="form-label mt-4" for="inputValid">비밀번호</label>
					<input type="password" name="password" class="form-control is-valid" id="inputValid">
					<div class="valid-feedback"></div>
				</div>
				

				<!-- <div class="form-group has-danger">
					<label class="form-label mt-4" for="inputInvalid">비밀번호 재확인</label> 
					<input type="password" class="form-control is-invalid" id="inputInvalid">
					<div class="invalid-feedback">비밀번호가 일치하지 않습니다</div>
				</div> -->
                <div class="form-group">
               		<label for="exampleInputEmail1" class="form-label mt-4">이름</label>
                    <input type="text" name="name" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                </div>
                
			    <div class="form-group">
			      <label for="exampleSelect1" class="form-label mt-4">성별</label>
			      <select class="form-select" id="exampleSelect1">
			        <option>남자</option>
			        <option>여자</option>
			      </select>
			    </div>                
                <div class="form-group">
               		<label for="exampleInputEmail1" class="form-label mt-4">본인 확인 이메일</label>
                    <input type="text" name ="email"class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="선택입력">
                </div>
				
				<div class="form-group has-success">
					<label class="form-label mt-4" for="inputValid">폰 번호</label>
					<input type="text" name="phone" class="form-control is-valid" id="inputValid1">
					<div class="valid-feedback1"></div>
				</div>
				
				<div class="d-grid gap-2 mt-4">
                    <button class="btn btn-primary btn-lg" type="submit" name="join">가입하기</button>
                </div>

            </form>

   </div>
	</section>
	
	<c:import url="../template/footer.jsp"></c:import>
    
	

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
     

</body>
</html>