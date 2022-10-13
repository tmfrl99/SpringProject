<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원 정보</title>
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic&family=Rubik:wght@400;500&display=swap" rel="stylesheet">
	
	<link rel="stylesheet" href="../resources/base.css" type="text/css"></link>
</head>
<body>
	<div align=center>
		<div class="title">회원 정보</div><br>
		<table>
		    <tr><th> LoginID </th><td><c:out value="${member.id}"/></td></tr>
			<tr><th> LoginPWD </th><td><c:out value="${member.passwd}"/></td></tr>
			<tr><th> YourName </th><td><c:out value="${member.name}"/></td></tr>
			<tr><th> PhoneNumber </th><td><c:out value="${member.num}"/></td></tr>
			<tr><th> Address </th><td><c:out value="${member.address}"/></td></tr>
		</table>
		<c:url value="/member/list" var="url"/><button type ="button" onclick="location.href='${url}' ">회원 목록 보기</button>
	</div>
</body>
</html>