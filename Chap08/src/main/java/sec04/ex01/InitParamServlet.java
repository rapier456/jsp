package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitParamServlet
 */
@WebServlet(
		urlPatterns = { 
				"/sinit", 
				"/sinit2"
		}, 
		initParams = { 
				@WebInitParam(name = "email", value = "admin@web.com"), 
				@WebInitParam(name = "tel", value = "010-1234-5678")
		})
public class InitParamServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//설정한 매개변수의 name로 값을 가져옴.
		String email = getInitParameter("email");
		String tel = getInitParameter("tel");
		
		out.print("<html><body>");
	    out.print("<table><tr>");
	    out.print("<td>email :</td><td>" + email + "</td></tr>");
	    out.print("<tr><td>휴대전화 :</td><td>" + tel + "</td>");
	    out.print("</tr></table></body></html>");
	}

}
