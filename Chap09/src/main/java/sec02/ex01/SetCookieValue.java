package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetCookieValue
 */
@WebServlet("/Set2")
public class SetCookieValue extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		Date d = new Date();
		// Cookie 객체를 생성 후 cookietest 이름으로 인코딩 후 쿠키에 저장.
		Cookie c = new Cookie("cookieTest", URLEncoder.encode("JSP Programming","UTF-8"));
		
		c.setMaxAge(-1); // 유효 기간 설정
		response.addCookie(c); // 생성된 쿠키를 브라우저로 전송
		
		out.println("현재시간 : " + d);
		out.println("<br>문자열을 Cookie에 저장합니다.");
	}

}
