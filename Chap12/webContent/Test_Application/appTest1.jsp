<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
 	String name=(String)session.getAttribute("name");
	application.setAttribute("address","부산시 사상구");
%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="utf-8">
		<title>내장 객체 테스트</title>
	</head>
	<body>
		<h1>이름과 주소를 저장합니다.</h1>
		이름은 <%= name %>입니다. <br>
		<a href=appTest2.jsp>두 번째 페이지로 이동</a>
	</body>
</html>