<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원 정보 수정</title>
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic&family=Rubik:wght@400;500&display=swap" rel="stylesheet">
	
	<link rel="stylesheet" href="../resources/base.css" type="text/css"></link>
</head>
<body>
	<div align=center>
		<div class="title">회원 정보 수정</div><br>
		<form name=form1 action="http://localhost:8080/myweb/member/modify/" method="post">
		<table>
			<tr><th>LoginID</th><td><input type="text" name="id" readonly value="${member.id}"></td></tr>
			<tr><th>LoginPWD</th><td><input type="text" name="passwd" value="${member.passwd}"></td></tr>
			<tr><th>YourName</th><td><input type="text" name="name" value="${member.name}"></td></tr>
			<tr><th>PhoneNumber</th><td><input type="text" name="num" value="${member.num}"></td></tr>
			<tr><th>Address</th><td><input type="text" name="address" value="${member.address}"></td></tr>
		</table><br>
			<div class="center">
				<div class="a"><input id="btn" type="submit" name="submit" value="최종 수정"></div>
				<div class="a"><input id="btn" type="reset" name="reset" value="다시작성"></div>
			</div>
			</form>
	</div>
</body>
</html>