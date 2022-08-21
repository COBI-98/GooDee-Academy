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
 <form class="align-center" action="./add.esh" method="post">
 		<h1>Add Page</h1> <br>
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
<body>

</html>