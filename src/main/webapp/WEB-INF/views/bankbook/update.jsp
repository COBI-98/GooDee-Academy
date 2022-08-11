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
 <form class="align-center" action="./update" method="post">
 		<h1>BOOK UPDATE</h1> <br>
 		<div>
        책번호<br>
        <input type="text" name="BOOKNUM" readonly="readonly" value = "${requestScope.update.getBOOKNUM()}"><br>
        </div>
 		<div>
        책이름<br>
        <input type="text" name="BOOKNAME" value = "${requestScope.update.getBOOKNAME()}"><br>
        </div>
        <div>
        할인율<br>
        <input type="text" name="BOOKRATE" value = "${requestScope.update.getBOOKRATE()}"><br>
        </div>
      
        <input type="submit" name="update" value="책 업데이트" >
        <a href="./detail?BOOKNUM=${requestScope.update.getBOOKNUM()}">리스트 보기</a> 
</form>
<body>
</html>