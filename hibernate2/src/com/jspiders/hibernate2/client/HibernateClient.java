package com.jspiders.hibernate2.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspiders.hibernate2.entity.Address;
import com.jspiders.hibernate2.entity.Empolyee;
import com.jspiders.hibernate2.util.HibernateUtil;

public class HibernateClient {

	public static void main(String[] args) {
		
		Session session = null;
		SessionFactory sessionFactroy = HibernateUtil.getSessionFactroy();
		session = sessionFactroy.openSession();
		
		Transaction tx = session.getTransaction();
		tx.begin();
		
		
		Address address = new Address();
		address.setCity("Bangalore");
		address.setStreet("BTR");
		address.setPincode(5600006);
		
		Empolyee emp = new Empolyee();
		emp.setEname("Smith");
		emp.setAddress(address);
		
		session.save(emp);
		
		tx.commit();
		
		if(session!=null) {
			session.close();
		}
		
	}

}
