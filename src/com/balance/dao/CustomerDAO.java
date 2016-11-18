package com.balance.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.balance.bean.Customer;

public class CustomerDAO 
{
	public void addCustomerDetails(int cust_id, String cust_name, int cust_phone, int cust_ttb, String cust_databal, String cust_messagebal) 
	{
		try {
			Configuration configuration = new Configuration().configure(); 	//configuring hibernate

			SessionFactory sessionFactory = configuration.buildSessionFactory();	//create session-factory

			Session session = sessionFactory.openSession();		//Get Session object

			Transaction transaction = session.beginTransaction();	//Starting Transaction


			Customer cust = new Customer();
			cust.setCust_id(cust_id);
			cust.setCust_name(cust_name);
			cust.setCust_phone(cust_phone);
			cust.setCust_ttb(cust_ttb);
			cust.setCust_databal(cust_databal);
			cust.setCust_messagebal(cust_messagebal);

			// Saving Customer Details

			session.save(cust);

			// Commiting Transaction			

			transaction.commit();

		}catch (HibernateException e) {
			System.out.println(e.getMessage());
			System.out.println("error");
		}

	}
}
