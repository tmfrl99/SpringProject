<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>상품 정보 수정</title>
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic&family=Rubik:wght@400;500&display=swap" rel="stylesheet">
	
	<link rel="stylesheet" href="../resources/base.css" type="text/css"></link>
</head>
<body>
	<div align=center>
		<div class="title">상품 정보 수정</div><br>
		<form name=form1 action="http://localhost:8080/myweb/shoes/modify/" method="post">
		<table>
			<tr><th>ProductID</th><td><input type="text" name="pid" readonly value="${shoes.pid}"></td></tr>
			<tr><th>ProductName</th><td><input type="text" name="pname" value="${shoes.pname}"></td></tr>
			<tr><th>ProductPrice</th><td><input type="text" name="price" value="${shoes.price}"></td></tr>
			<tr><th>Brand</th><td><input type="text" name="brand" value="${shoes.brand}"></td></tr>
			<tr><th>Color</th><td><input type="text" name="color" value="${shoes.color}"></td></tr>
			<tr><th>Inventory</th><td><input type="text" name="inven" value="${shoes.inven}"></td></tr>
			
			</table><br>
			<div class="center">
				<div class="a"><input id="btn" type="submit" name="submit" value="최종 수정"></div>
				<div class="a"><input id="btn" type="reset" name="reset" value="다시작성"></div>
			</div>
			</form>
	</div>
</body>
</html>