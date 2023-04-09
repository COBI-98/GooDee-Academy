<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table border="1" class="table table-warning table-striped">
   <tr>
    <th>댓글</th>
    <th>작성자</th>
    <th>작성날짜</th>
  </tr>
	<c:forEach items="${commentList}" var="dto">
		<tr>
   			 <td>${dto.contents}</td>
  			 <td>${dto.writer}</td>
  			 <td>${dto.regDate}</td>
 		 </tr>
	</c:forEach>	
  
</table>