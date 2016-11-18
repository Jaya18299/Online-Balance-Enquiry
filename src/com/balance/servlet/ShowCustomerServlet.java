package com.balance.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.balance.bean.Customer;
import com.balance.dao.ShowAllCustomerDAO;

@WebServlet("/ShowCustomerServlet")
public class ShowCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside View Servlet");
		response.setContentType("text/html");  
		PrintWriter out=response.getWriter();

		ShowAllCustomerDAO custdao = new ShowAllCustomerDAO();
		List<Customer> customer = custdao.showStudentDetails();  

		out.print("<table border='1' width='100%'");  
		out.print("<tr><th>Id</th><th>Name</th><th>Talk Time Balance</th><th>Phone</th><th>Data Balance</th><th>Message Balance</th></tr>");  
		for(Customer u:customer){  
			out.print("<tr>"
					+ "<td>"+u.getCust_id()+"</td>"
					+ "<td>"+u.getCust_name()+"</td>"
					+ "<td>"+u.getCust_ttb()+"</td>"
					+ "<td>"+u.getCust_phone()+"</td>"
					+ "<td>"+u.getCust_databal()+"</td>"
					+ "<td>"+u.getCust_messagebal()+"</td>"
					+ "</tr>");  
		}  
		out.print("</table>");  

		out.close();  
	}  
}  


