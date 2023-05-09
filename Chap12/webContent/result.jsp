<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>로그인 결과</title>
	</head>
	<body>
		<%
			String id = request.getParameter("user_id");
			String pw = request.getParameter("user_pw");
		%>
		<h1>로그인 결과 출력</h1>
		<h2>아이디 :<%= id %></h2>
		<h2>비밀번호 :<%= pw %></h2>
	</body>
</html>