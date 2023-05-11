<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
 	String name=(String)request.getAttribute("name");
	String address = (String)request.getAttribute("address");
%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="utf-8">
		<title>내장 객체 테스트</title> 
	</head>
	<body>
		<h1>이름은 <%= name %>입니다.</h1> <br>
		<h1>주소는 <%= address %>입니다.</h1> <br>
	</body>
</html>