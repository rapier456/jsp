<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
 	String name=(String)session.getAttribute("name");
	String address=(String)session.getAttribute("address");
%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="utf-8">
		<title>내장 객체 테스트</title>
	</head>
	<body>
		이름은 <%= name %>입니다. <br>
		주소는 <%= address %>입니다. <br>
	</body>
</html>