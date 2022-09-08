<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<style>
    .align-center {text-align: center;}
    
}
</style>
<body>


	<c:import url="../template/header.jsp"></c:import>
	
	<section class="container-fluid col-lg-4 mt-5">
		<div class="row">
	<div>
	<h1>${board} List Page</h1>
	</div>
	
	<div class="row">
	<form action="./list.esh"  class="row row-cols-lg-auto g-3 align-items-center">
 		 <div class="col-12">
  		  <label class="visually-hidden" for="search">검색어</label>
  			  <div class="input-group">
  			    <input type="text" name="search" value="${param.search}" class="form-control" id="search" >
  			  </div>
 		</div>

 		<div class="col-12">
   			<label class="visually-hidden" for="kind">Kind</label>
  			<select name="kind" class="form-select" id="kind">
   		    <option class = "kinds" value="title">Title</option>
    		<option class = "kinds" value="writer">Writer</option>
   			<option class = "kinds" value="contents">Contents</option>
   			 </select>
  		</div>


 		 <div class="col-12">
  		  <button type="submit" class="btn btn-primary">Submit</button>
 		 </div>
	</form>
	</div>
	
	
	<table border="1" class="table">
		<thead class="table-dark">
			<tr>
				<th>NUM</th><th>TITLE</th><th>WRITER</th><th>REGDATE</th><th>HITS</th>
			</tr>
		</thead>
		<tbody>
			
			
			<c:forEach items="${list}" var ="dto">
					<tr>
						<td><a href ="./detail.esh?num=${pageScope.dto.num}">${pageScope.dto.num}</a></td>
						<td>
						<c:catch>
						<c:forEach begin="1" end="${dto.depth}">
						&ensp;
						</c:forEach>
						</c:catch>
						${dto.title}</td>
						<td>${dto.writer}</td>	
						<td>${dto.regDate}</td>
						<td>${dto.hit}</td>	
									
					</tr>
			</c:forEach>
			
			<c:if test="${board}=Notice">
			</c:if>
			
		</tbody>
		
	</table>
	
	
	<div>
		<a href="./add.esh">글쓰기</a><br>
	</div>
		
	
	
	
	<nav aria-label="Page navigation example">
  <ul class="pagination">
  
    <li class="page-item ${pager.pre?'':'disabled'}">	
      <a class="page-link" href="./list.esh?page=${pager.startNum-1}&search=${pager.search}&kind=${pager.kind}" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a> 
    </li>
    
	<c:forEach begin="${pager.startNum }" end="${pager.lastNum}" var ="i">
	<li class="page-item"><a class="page-link" href="./list.esh?page=${i}&search=${pager.search}&kind=${pager.kind}">${i }</a></li>
	</c:forEach>
	

	<%-- <c:choose>
		<c:when test="${pager.next}">
			<li class="page-item">		
		</c:when>
		<c:otherwise>
			<li class="page-item disabled">
		</c:otherwise>
	</c:choose> --%>
	
    	<li class="page-item ${pager.next?'':'disabled'}">	
     	 <a class="page-link" href="./list.esh?page=${pager.lastNum+1}&search=${pager.search}&kind=${pager.kind}" aria-label="Next">
       	 <span aria-hidden="true">&raquo;</span>
     	 </a>
    	</li>
  
	</ul>
</nav>
	</div>
	
	</section>
	
	<c:import url="../template/footer.jsp"></c:import>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
<script src="/resources/js/board.js">
</script>
<script>
	let k = '${param.kind}';

	const kinds = document.getElementsByClassName("kinds");

	for(let i =0; i<kinds.length; i++){
		console.log(kinds[i].value);
		if(k == kinds[i].value){
			kinds[i].selected=true;
		}
	}

	



</script>
</body>
</html>