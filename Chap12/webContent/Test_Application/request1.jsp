<%@ page language="java" contentType="text/html; charset=utf-8"
	import="javax.servlet.RequestDispatcher"
    pageEncoding="utf-8"%>
<%
 	request.setAttribute("name","박정수");
	request.setAttribute("address","부산시 사상구");
%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="utf-8">
		<title>내장 객체 테스트</title>
	</head>
	<body>
		<%
		//request 객체를 다른 JSP 파일로 포워딩
		RequestDispatcher dispatch = request.getRequestDispatcher("request2.jsp");
		dispatch.forward(request, response);
		%>
	</body>
</html>