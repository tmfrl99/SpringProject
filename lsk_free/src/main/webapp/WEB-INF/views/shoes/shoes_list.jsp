<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>상품 리스트</title>
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic&family=Rubik:wght@400;500&display=swap" rel="stylesheet">
	
	<link rel="stylesheet" href="../resources/base.css" type="text/css"></link>	
</head>
<body>
	<div align=center class="list">
<!-- 		<p class="a"></p>
 -->	<div class="title">상품 목록</div><br>
 		<div class="center">
	 		<c:url value="/member/list" var="url"/><button type ="button" class="a" onclick="location.href='${url}' ">회원 목록</button>
			<c:url value="/shoes/register" var="url"/><button type ="button" class="a" onclick="location.href='${url}' ">상품 등록</button><br><br>
		</div>
		<table>
		  <tr>
		    <th>PID</th><th>PNAME</th><th>PRICE</th><th>BRAND</th><th>COLOR</th><th>INVENTORY</th><th></th>
		  </tr>
		  <c:forEach var="shoes" items="${shoess}" >
			  <tr>
			    <td><c:out value="${shoes.pid}"/></td>
			    <td><c:out value="${shoes.pname}"/></td>
			    <td><c:out value="${shoes.price}"/></td>
			    <td><c:out value="${shoes.brand}"/></td>
			    <td><c:out value="${shoes.color}"/></td>
			    <td><c:out value="${shoes.inven}"/></td>
			    <td>
			    <div class="parent">
			    	<c:url value="/shoes/read?pid=${shoes.pid}" var="url"/><button type ="button" class ="first" onclick="location.href='${url}' ">상품 정보 보기</button>
			      	<c:url value="/shoes/modify?pid=${shoes.pid}" var="url"/><button type ="button" class ="second" onclick="location.href='${url}' ">상품 정보 수정</button>
			      	<c:url value="/shoes/delete?pid=${shoes.pid}" var="url"/><button type ="button" class ="third" onclick="location.href='${url}' ">상품 정보 삭제</button>
			    </div>
			    </td>
			  </tr>
		  </c:forEach>
		</table>
	</div>
</body>
</html>