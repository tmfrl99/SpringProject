<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>상품 정보</title>
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic&family=Rubik:wght@400;500&display=swap" rel="stylesheet">
	
	<link rel="stylesheet" href="../resources/base.css" type="text/css"></link>
</head>
<body>
	<div align=center>
		<div class="title">상품 정보</div><br>
		<table>
			<tr><th>ProductID</th><td><c:out value="${shoes.pid}"/></td></tr>
			<tr><th>ProductName</th><td><c:out value="${shoes.pname}"/></td></tr>
			<tr><th>ProductPrice</th><td><c:out value="${shoes.price}"/></td></tr>
			<tr><th>Brand</th><td><c:out value="${shoes.brand}"/></td></tr>
			<tr><th>Color</th><td><c:out value="${shoes.color}"/></td></tr>
			<tr><th>Inventory</th><td><c:out value="${shoes.inven}"/></td></tr>
		</table>
		<c:url value="/shoes/list" var="url"/><button type ="button" onclick="location.href='${url}' ">상품 목록 보기</button>
	</div>
</body>
</html>