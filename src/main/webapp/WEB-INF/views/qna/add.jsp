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
 		<h1>글 작성 페이지</h1> <br>
        <div>
        글 제목<br>
        <input type="text" name="title" placeholder="글 제목을 입력하세요"><br>
        </div>
        <div>
        글 내용<br>
        <input type="text" name="content" placeholder="내용을 입력하세요"><br>
        </div>
         <div>
        작성자<br>
        <input type="text" name="writer" readonly="readonly" value="${sessionScope.check.userName}"><br>
        </div>
        
        
        
        <input type="submit" name="add" value="책 추가" >
</form>
<body>
</html>