package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTest
 */
@WebServlet("/session01")
public class SessionTest extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		//Session 객체 가져오기
		HttpSession session = request.getSession();
		//Session 객체에 name 바인딩
		session.setAttribute("name", "박정수");
		
		pw.println("<html><body>");
		pw.println("<h1>세션에 이름을 바인딩합니다.</h1>");
		pw.println("<a href='/Chap12/session/session1.jsp'>첫번째 페이지로 이동하기</a>");
		pw.println("</body></html>");
	}

}
