package com.balance.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.balance.bean.Customer;

import com.balance.dao.CustomerDAO;;

public class CustomerAddServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		int cust_id = Integer.parseInt(request.getParameter("cust_id"));
		String cust_name = request.getParameter("cust_name");
		int cust_phone =Integer.parseInt(request.getParameter("cust_phone"));
		int cust_ttb =Integer.parseInt(request.getParameter("cust_ttb"));	
		String cust_databal = request.getParameter("cust_databal");
		String cust_messagebal = request.getParameter("cust_messagebal");

		try {
			CustomerDAO custDAO = new CustomerDAO();
			custDAO.addCustomerDetails(cust_id, cust_name, cust_phone, cust_ttb, cust_databal,cust_messagebal);
			response.sendRedirect("home.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}