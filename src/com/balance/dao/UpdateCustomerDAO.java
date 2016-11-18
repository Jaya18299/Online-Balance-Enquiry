package com.balance.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.balance.bean.Customer;

public class UpdateCustomerDAO 
{
	public void updateCustomerDetails(int cust_id, String cust_name, int cust_phone, int cust_ttb, String cust_databal, String cust_messagebal) 
	{
		try {
			Configuration configuration = new Configuration().configure(); 	//configuring hibernate

			SessionFactory sessionFactory = configuration.buildSessionFactory();	//create sessionfactory

			Session session = sessionFactory.openSession();		//Get Session object

			Transaction transaction = session.beginTransaction();	//Starting Transaction

			Customer cust = new Customer();
			cust.setCust_id(cust_id);
			cust.setCust_name(cust_name);
			cust.setCust_phone(cust_phone);
			cust.setCust_ttb(cust_ttb);
			cust.setCust_databal(cust_databal);
			cust.setCust_messagebal(cust_messagebal);

			// Updating Customer Details
			session.saveOrUpdate(cust);

			
/*			
			String query="update customer_details set customer_name=?, customer_phone=?, customer_ttb=?, customer_databal=?, customer_messagebal=? where id=?";
			
			Query queryObj=session.createQuery(query);
			queryObj.setString(0, cust_name);
			queryObj.setInteger(1, cust_phone);
			queryObj.setInteger(2, cust_ttb);
			queryObj.setString(3, cust_databal);
			queryObj.setString(4, cust_messagebal);
			queryObj.setInteger(5, cust_id);
			
			int result=queryObj.executeUpdate(); 
		    
		    System.out.println("Rows Affected ::"+result);
*/			
			//Commiting Transaction
			
			transaction.commit();

		}catch (HibernateException e) {
			System.out.println(e.getMessage());
			System.out.println("error");
		}

	}
}
