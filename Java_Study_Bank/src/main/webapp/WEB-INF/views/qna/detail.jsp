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
				<th>글 번호</th><th>글 제목</th><th>작성자</th><th>글 작성일</th><th>조회수</th><th>그룹</th><th>순서</th><th>답글</th>
			</tr>
		</thead>
		<tbody>
				
			
				<tr>
					<td>${detail.num}</td>
					<td>${detail.title}</td>
					<td>${detail.writer}</td>
					<td>${detail.regDate}</td>
					<td>${detail.hit}</td>
					<td>${detail.ref}</td>
					<td>${detail.step}</td>
					<td>${detail.depth}</td>
				</tr>
			
			
		</tbody>
		
	</table>
	<c:if test="${sessionScope.check.userName == detail.writer}">
	<a href = "./update.esh?num=${detail.num}">글 수정하기</a><br>
	<a href = "./delete.esh?num=${detail.num}">글 삭제하기</a>
	</c:if>
</body>
</html>