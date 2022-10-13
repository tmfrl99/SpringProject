<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원 리스트</title>
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic&family=Rubik:wght@400;500&display=swap" rel="stylesheet">
	
	<link rel="stylesheet" href="../resources/base.css" type="text/css"></link>
</head>
<body>
	<div align=center>
		<div class="title">회원 목록</div><br>
		<div class="center">
			<c:url value="/shoes/list" var="url"/><button type ="button" class="a"onclick="location.href='${url}' "> 상품 목록</button>	
			<c:url value="/member/register" var="url"/><button type ="button" class="a" onclick="location.href='${url}' "> 회원 등록</button><br><br>
 		</div>
 		<table>
		  <tr>
		    <th>ID</th><th>PWD</th><th>NAME</th><th>NUM</th><th>ADDRESS</th><th></th>
		  </tr>
		  <c:forEach var="member" items="${members}" >
			  <tr>
			    <td><c:out value="${member.id}"/></td>
			    <td><c:out value="${member.passwd}"/></td>
			    <td><c:out value="${member.name}"/></td>
			    <td><c:out value="${member.num}"/></td>
			    <td><c:out value="${member.address}"/></td>
			    <td>
			  	<div class="parent">
				  <c:url value="/member/read?id=${member.id}" var="url"/><button type ="button" class="first" onclick="location.href='${url}' "> 회원 정보 보기</button>
				  <c:url value="/member/modify?id=${member.id}" var="url"/><button type ="button" class="second" onclick="location.href='${url}' "> 회원 정보 수정</button>
				  <c:url value="/member/delete?id=${member.id}" var="url"/><button type ="button" class="third" onclick="location.href='${url}' "> 회원 정보 삭제</button>
			  	</div>    
			    </td>
			  </tr>
		  </c:forEach>
		</table>
	</div>
</body>
</html>