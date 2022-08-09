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
 <form class="align-center" action="add" method="post">
        책 이름<br>
        <input type="text" name="BOOKNAME" placeholder="책 이름을 입력하세요"><br>
        할인율<br>
        <input type="text" name="BOOKRATE" placeholder="할인율을 입력하세요"><br>
        
        <input type="submit" name="add" value="책 추가" >
</form>
<body>

</html>