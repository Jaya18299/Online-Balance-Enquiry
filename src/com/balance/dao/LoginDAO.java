package com.balance.dao;

import javax.servlet.http.HttpServlet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.balance.bean.Login;

public class LoginDAO extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean checkLoginDetails(String username1, String password1) {


		Configuration configuration = new Configuration().configure();	// configuring hibernate

		SessionFactory sessionFactory = configuration.buildSessionFactory();	//create session-factory

		Session session = sessionFactory.openSession();		//Getting Session object

		Transaction transaction = session.beginTransaction();	//Starting Transaction

		// Without HQL Query
		Login login = (Login) session.get(Login.class, username1);

		//With HQL Query
		/*String query = "from Login_details where Login_username=? and Login_password=?";
		  Query queryObj = session.createQuery(query);
		  queryObj.setInteger(0, username1);
		  queryObj.setString(1, password1);
		  List<Login> records = queryObj.list(); */

		// Commiting Transaction

		transaction.commit();

		/*if(records.size()>0){
			  System.out.println("Right Credentials");
			  return true;
		  }

		  else
			{
			  System.out.println("Wrong Credentials");
				return false;

			}*/



		String user_Id = login.getUsername();
		String user_Password = login.getPassword();

		System.out.println(user_Id + "===" + user_Password);
		if(username1==user_Id && password1.equals(user_Password) )
		{
			System.out.println("Right Credentials");
			return true;
		}
		else
		{
			System.out.println("Wrong Credentials");
			return false;
		}
	}
}
