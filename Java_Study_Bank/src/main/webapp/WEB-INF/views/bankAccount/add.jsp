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
        사용자 이름<br>
        <input type="text" name="userName" readonly="readonly" value="${sessionScope.check.USERNAME}"><br>
        </div>
        <div>
        책 번호<br>
        <input type="text" name="bookNum" readonly="readonly" value="${requestScope.update.BOOKNUM}"><br>
        </div>
        <input type="submit" name="add" value="상품 추가" >
</form>
<body>
</html>