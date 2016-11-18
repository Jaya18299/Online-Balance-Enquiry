package com.balance.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.balance.dao.DeleteCustomerDAO;

/**
 * Servlet implementation class CustomerDeleteServlet
 */
//@WebServlet("/CustomerDeleteServlet")
public class CustomerDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int cust_id = Integer.parseInt(request.getParameter("cust_id"));
		
		System.out.println("Customer ID"+cust_id);

		try {
			System.out.println("IN Customer Delete Servlet");
			
			DeleteCustomerDAO delcust=new DeleteCustomerDAO();
			delcust.delCustomerDetails(cust_id);
			response.sendRedirect("home.jsp");

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
