package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//社員情報管理コントローラー

public class EmployeeController extends HttpServlet {
	 public void doPost(HttpServletRequest request, HttpServletResponse response)
	 throws ServletException, IOException {

		 try {
			 String id = request.getParameter("id");
			 String password = request.getParameter("pass");


		 } catch (Exception e) {
			 e.printStackTrace();
		 } finally {
			 ServletContext context = this.getServletContext();
			 RequestDispatcher dispatcher = context.getRequestDispatcher("/index.jsp");
			 dispatcher.forward(request, response);
		 }
	 }
}
