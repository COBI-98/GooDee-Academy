<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
    .align-center {text-align: center;}
</style>
<body>
 <form class="align-center" action="join" method="post">
        ID<br>
        <input type="text" name="USERNAME" placeholder="id를 입력하세요"><br>
        PW<br>
        <input type="text" name="PASSWORD" placeholder="pw를 입력하세요"><br>
        이름<br>
        <input type="text" name="NAME" placeholder="이름을 입력하세요"><br>
        Email<br>
        <input type="text" name="EMAIL" placeholder="Email을 입력하세요"><br>
        Phone<br>
        <input type="text" name="PHONE" placeholder="Phone을 입력하세요"><br>
        <input type="submit" name="join" value="회원가입" >
        
     

</form>
</body>
</html>