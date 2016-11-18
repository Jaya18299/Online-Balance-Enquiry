package com.balance.dao;


import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServlet;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.balance.bean.Customer;


public class ShowAllCustomerDAO extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public List<Customer> showStudentDetails() {

		Configuration configuration = new Configuration().configure();		//configuring hibernate

		SessionFactory sessionFactory = configuration.buildSessionFactory();	//create sessionfactory

		Session session = sessionFactory.openSession();	//Get Session object

		Transaction transaction = session.beginTransaction();	//Starting Transaction

		List<Customer> custList = session.createQuery("FROM customer_details").list(); 
		for (Iterator iterator = 
				custList.iterator(); iterator.hasNext();)
		{
			Customer cust = (Customer) iterator.next(); 
			System.out.print("Customer ID: " + cust.getCust_id()); 
			System.out.print("Customer Name: " + cust.getCust_name()); 
			System.out.println("Customer Talk TIme Balance :" + cust.getCust_ttb());
			System.out.println("Customer Phone:" + cust.getCust_phone());
			System.out.println("Customer Data Balance:" + cust.getCust_databal());
			System.out.println("Customer Message Balance:" + cust.getCust_messagebal());
		}
		return custList;
	}

}