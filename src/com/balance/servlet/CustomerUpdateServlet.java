package com.balance.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.balance.dao.CustomerDAO;
import com.balance.dao.UpdateCustomerDAO;

/**
 * Servlet implementation class CustomerUpdateServlet
 */
@WebServlet(description = "Update Customer Servlet", urlPatterns = { "/CustomerUpdateServlet" })
public class CustomerUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int cust_id = Integer.parseInt(request.getParameter("cust_id"));
		String cust_name = request.getParameter("cust_name");
		int cust_phone =Integer.parseInt(request.getParameter("cust_phone"));
		int cust_ttb =Integer.parseInt(request.getParameter("cust_ttb"));	
		String cust_databal = request.getParameter("cust_databal");
		String cust_messagebal = request.getParameter("cust_messagebal");

		try {
			UpdateCustomerDAO updatecust = new UpdateCustomerDAO();
			updatecust.updateCustomerDetails(cust_id, cust_name, cust_phone, cust_ttb, cust_databal, cust_messagebal);

			System.out.println("Updated Customer Details");

			response.sendRedirect("home.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
