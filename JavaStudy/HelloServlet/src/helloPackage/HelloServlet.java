package helloPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	//HttpServletクラスを継承し、doXXX()メソッドをオーバーライドして利用

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	//extendsしているHttpServletクラスのdoGet()メソッドをオーバーライド

		throws IOException, ServletException {

		response.setContentType("text/html; charset=Windows-31J");	//MIMEタイプの指定→Content-Typeの値へ
		PrintWriter out = response.getWriter();
		out.println("<body>HelloServlet</body>");
	}

}
