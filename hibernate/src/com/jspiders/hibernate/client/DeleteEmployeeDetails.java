package com.jspiders.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspiders.hibernate.entity.Employee;
import com.jspiders.hibernate.util.HibernateUtil;

public class DeleteEmployeeDetails {

	public static void main(String[] args) {
		
		Session session = null;
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		
		Transaction tx = session.getTransaction();
		tx.begin();
		Employee emp = session.get(Employee.class,2);
		session.delete(emp);
		tx.commit();
		
		if(session!=null)
		{
			session.close();
		}
	}

}
