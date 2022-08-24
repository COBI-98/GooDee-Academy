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
 <form class="align-center" action="./update.esh" method="post">
 		<h1>글 수정하기</h1> <br>
 		<div>
        글 번호<br>
        <input type="text" name="qnaNum" readonly="readonly" value = "${update.num}"><br>
        </div>
 		<div>
        글 제목<br>
        <input type="text" name="title" value = "${update.title}"><br>
        </div>
        <div>
        내용<br>
        <input type="text" name="contents" value = "${update.contents}"><br>
        </div>
      	
        <input type="submit" name="update" value="글 업데이트" >
        <a href="./detail.esh?num=${update.num}">리스트 보기</a>  
</form>
</html>