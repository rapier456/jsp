package ex201795042;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SignupServlet
 */
@WebServlet("/Signup")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doHandle(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doHandle(request, response);
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		String user_id = request.getParameter("user_id");
    	String user_pw = request.getParameter("user_pw");
    	String user_name = request.getParameter("user_name");
    	
    	String data="<h1>중간고사 2번 박정수 - 결과</h1><br><br>";
    	data+="<html><body>";
    	data+="User ID :" +user_id;
    	data+="<br>";
    	data+="Password :" +user_pw;	
    	data+="<br>";
    	data+="Name :" +user_name;
    	data+="<br>";
    	data+="</body></html>";
    	
    	out.print(data);
    	
    	if(session.isNew()) {
    		if(user_id != null) {
    			session.setAttribute("user_id", user_id);
    			out.println("<a href='Signup'>로그인 상태 확인</a>");
    		}else {
    		user_id = (String) session.getAttribute("user_id");
    		if(user_id != null && user_id.length() != 0) {
    			out.print("안녕하세요" + user_name + "님!!!");
    			session.setMaxInactiveInterval(3);
    		}
    	}
    	
	}

}
		
}


