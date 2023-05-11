<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="java.util.*"
    import="sec02.ex01.*"
    pageEncoding="UTF-8"
%>

<%
   request.setCharacterEncoding("utf-8");
   String _name = request.getParameter("name");// 전송된 이름을 가져옴
   MemberVO memberVO = new MemberVO();
   memberVO.setName(_name);
   MemberDAO dao=new MemberDAO();
   List membersList=dao.listMembers(memberVO); //memberVO를 listMember() 메서드로 전달하여 
   											   //조회 조건에 해당되는 회원 정보를 조회
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원 정보 출력창</title>
		
		<style>
			<!--<h1> 태그의 텍스트를 중앙에 정렬-->
			h1 { 
				text-align: center;
			}
			table {
				width: 80%;
				border:1px solid black;
				border-collapse:collapse;
				margin-left: auto;
				margin-right: auto;
				border-spacing: 0px;
			}
			td, th {
				border:1px solid gray;
				padding:10px;
				vertical-align: top;
				text-align: center;
			}
			thead, th {
				background:#eee;
			}
		</style>
	</head>
	
	<body>
		<h1>회원 정보 출력</h1>		
		 <table border='1' width='800' align='center'>
		 <thead>
		 	<tr> 
			     <th>아이디</th>
			     <th>비밀번호</th>
			     <th>이름</th>
			     <th>이메일</th>
			     <th>가입일자</th>
			</tr>
		</thead>
		<%	
			for (int i = 0; i < membersList.size(); i++) { //MemberDAO에서 조회한 회원 정보를
				MemberVO vo = (MemberVO)membersList.get(i); // for 반복문을 이용해 테이블의 행으로 출력
				String id = vo.getId();
				String pwd = vo.getPwd();
				String name = vo.getName();
				String email = vo.getEmail();
				Date joinDate = vo.getJoinDate();
		%>
				<tr>
					<td><%= id %></td>
					<td><%= pwd %></td>
					<td><%= name %></td>
					<td><%= email %></td>
					<td><%= joinDate %></td>
				</tr>		   
		<%		
			}
		%>	
		</table>
	</body>
</html>
