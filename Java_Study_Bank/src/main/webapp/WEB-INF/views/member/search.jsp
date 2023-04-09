<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">

</head>
<style>
			div { text-align: center; }
	</style>
<body>
	
	<c:import url="../template/header.jsp"></c:import>
	
	
	<section class="container-fluid col-lg-4 mt-5">
	<div class="main-search-input-wrap">
	<form class="align-center" action="./search.esh" method = "post">   
       
     
    <div class="main-search-input fl-wrap">
      <div class="main-search-input-item">
      검색할 ID를 입력하세요<br>
        <input type="text" name="search" value="" placeholder="id를 입력하세요">
            </div>
                                        
        <button class="main-search-button" type="submit" value="찾기">Search</button>
        </div>
       </form>                  
	</div>
	</section>
	
	<c:import url="../template/footer.jsp"></c:import>
	

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
	
</body>
</html>