<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<H1>글 상세 보기</H1>
	<table border="1">
		<thead>
			<tr>
				<th>글 번호</th><th>글 제목</th><th>글 내용</th><th>작성자</th><th>글 작성일</th><th>조회수</th>
			</tr>
		</thead>
		<tbody>
				
			
				<tr>
					<td>${detail.boardNum}</td>
					<td>${detail.title}</td>
					<td>${detail.content}</td>
					<td>${detail.writer}</td>
					<td>${detail.boardDate}</td>
					<td>${detail.hits}</td>
					
				</tr>
			
			
		</tbody>
		
	</table>
	<c:if test="${sessionScope.check.userName == detail.writer}">
	<a href = "./update.esh?boardNum=${detail.boardNum}">글 수정하기</a><br>
	<a href = "./delete.esh?boardNum=${detail.boardNum}">글 삭제하기</a>
	</c:if>
</body>
</html>