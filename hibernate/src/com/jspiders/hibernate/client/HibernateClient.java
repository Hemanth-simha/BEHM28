package com.jspiders.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspiders.hibernate.entity.Employee;
import com.jspiders.hibernate.util.HibernateUtil;

public class HibernateClient {

	public static void main(String[] args) {
		
		Session session = null;
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		
		Transaction tx = session.getTransaction();
		tx.begin();
		
		Employee emp = new Employee();
		emp.setEname("Ram");
		emp.setDeptno(20);
		emp.setCompanyName("Adobe");
		
		session.save(emp);
		tx.commit();
		
		if(session!=null) {
			session.close();
		}
		
	}

}
