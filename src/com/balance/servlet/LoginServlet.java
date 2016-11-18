package com.balance.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.balance.dao.LoginDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(description = "Login Controller Servlet", urlPatterns = { "/LoginServlet" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username=request.getParameter("user_Id");
		String password=request.getParameter("user_Password");

		try {
			LoginDAO login = new LoginDAO();

			boolean check=login.checkLoginDetails(username, password);

			if(check==true)
			{
				System.out.println("correct Credential");
				response.sendRedirect("home.jsp");
			}else{
				System.out.println("User Not Found");
				response.sendRedirect("error.jsp");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
