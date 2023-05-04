<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<!--선언문 작성-->
<%!
	String name = "박정수";
	public String getName(){
		return name;
	} 
%>
<!-- 스크립트겟 작성 -->
<% String age = request.getParameter("age"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>표현식 연습 - 박정수</title>
</head>
<body>
	<!-- 표현식 -->
	<h1>안녕하세요, <%= name %>님!</h1>
	<h1>나이는 <%= age %>입니다.</h1>
	<h1>키는 <%= 170 %>입니다.</h1>
	<h1>나이 + 10은 <%= Integer.parseInt(age) + 10 %>살입니다.</h1>
</body>
</html>