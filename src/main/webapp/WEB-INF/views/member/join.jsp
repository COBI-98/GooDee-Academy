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
                    <input type="text" name="id" class="form-control" id="ipId" >
					<div id="inputIdResult" ></div>
				</div>
				<div class="form-group">
					<label class="form-label mt-4" for="pw">비밀번호</label>
					<input type="password" name="pw" class="form-control" id="ipPw">
					<div id="inputPwResult" ></div>
				</div>
				
				

				<div class="form-group has-danger">
					<label class="form-label mt-4" for="inputInvalid">비밀번호 재확인</label> 
					<input type="password" class="form-control is-invalid" id="inputPwCheck">
					<div id="inputPwCheckResult" ></div>
				</div>
                <div class="form-group">
               		<label for="name1" class="form-label mt-4">이름</label>
                    <input type="text" name="name" class="form-control" id="name"  >
					<div id="inputNameResult" ></div>
				</div>
                
			                 
                <div class="form-group">
               		<label for="email" class="form-label mt-4">본인 확인 이메일</label>
                    <input type="text" required name ="email"class="form-control" id="email" aria-describedby="emailHelp" placeholder="선택입력">
					<div id="inputEmailResult" ></div>
				</div>
				
				
				
				 <div class="form-group">
					<label class="form-label mt-4" for="files">Photo</label>
					<input type="file" name="photo" class="form-control" id="files">
					
				</div>
				
				<div class="d-grid gap-2 mt-4">
                    <button class="btn btn-primary btn-lg" type="button" id="joinButton" >가입하기</button>
                </div>

            </form>

   </div>
	<div>
		<div>
			ALL	<input type="checkbox" id="all">
		</div>

		<div>
			동의1 <input type="checkbox" class="check" name="" id="">
			<div>
				약관1
			</div>
		</div>
		<div>
			동의2 <input type="checkbox" class="check" name="" id="">
			<div>
				약관2
			</div>
		</div>
		<div>
			동의3 <input type="checkbox" class="check" name="" id="">
			<div>
				약관3
			</div>
		</div>

	</div>
	<div>
		
		<button type="button" id="test">post test</button>
		<button type="button" id="test2">ajax get test</button>
		<button type="button" id="test3">ajax post test</button>
	</div>
	<div>

		<select id= "s1">
			<option>1</option>
			<option>2</option>

		</select>
		<button type="button" id="s1Add">Add</button>
	</div>
	</section>
    
<script src="/js/join.js"></script>
<script src="/js/util.js"></script>
</body>
</html>