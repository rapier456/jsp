<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<!--선언문 작성-->
<%!
	String name = "박정수";
	public String getName(){
		return name;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>선언문 연습 - 박정수</title>
</head>
<body>
	<!-- 표현식 -->
	<h1>안녕하세요, <%= name %>님!</h1>
</body>
</html>