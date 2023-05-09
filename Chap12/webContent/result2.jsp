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
		<%
			if(id == null || id.length()==0){
		%>
			아이디를 입력하세요.<br>
			<a href="/Chap12/login.html">로그인하기</a>
		<%
			}else{
		%>
		<h2><%= id %>님. 환영합니다.</h2>
		<%
		}
		%>
	</body>
</html>