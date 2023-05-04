package sec01.ex03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String user_name = request.getParameter("user_name");
    	String user_pw = request.getParameter("user_pw");
    	
    	String data="안녕하세요" + user_name + "님. 로그인하셨습니다.<br><br>";
    	data+="<html><body>";
    	data+="아이디 :" +user_name;
    	data+="<br>";
    	data+="비밀번호 :" +user_pw;
    	data+="<br>";
    	data+="</body></html>";
    	
    	out.print(data);
    	
	}
	public void destroy() {
		System.out.println("destroy 메소드 호출");
	}

}
