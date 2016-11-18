package com.balance.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.balance.bean.Customer;

public class DeleteCustomerDAO 
{
	public void delCustomerDetails(int cust_id) 
	{
		try {
			Configuration configuration = new Configuration().configure(); 	//configuring hibernate

			SessionFactory sessionFactory = configuration.buildSessionFactory();	//create sessionfactory

			Session session = sessionFactory.openSession();		//Get Session object

			Transaction transaction = session.beginTransaction();	//Starting Transaction

																																																																																					

				Customer cust = new Customer();

			cust.setCust_id(cust_id);

			// Deleting Customer Details

			session.delete(cust);

			
			/*//	Using HQL
			 
			String query="delete from customer_details where customer_id=?";  
			Query queryObj=session.createQuery(query);
			queryObj.setInteger(0, cust_id);
		    
		//	System.out.println("Customer ID ::"+cust.getCust_id());
			
		    int result=queryObj.executeUpdate(); 
		    
		    System.out.println("Rows Affected ::"+result);
		     
			*/
			
			// Commiting Transaction

			transaction.commit();

		}catch (HibernateException e) {
			System.out.println(e.getMessage());
			System.out.println("error");
		}

	}
}
