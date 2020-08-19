package com.jspiders.hibernate1.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspiders.hibernate1.entity.Person;
import com.jspiders.hibernate1.util.HibernateUtil;

public class HibernateClient {

	public static void main(String[] args) {
		
		Session session = null;
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		
		Transaction tx = session.getTransaction();
		tx.begin();
		
		Person person = new Person();
		person.setName("king");
		person.setEmail("king@gmail.com");
		person.setPassword("king8055");
		
		session.save(person);
		
		tx.commit();
		if(session!=null) {
			session.close();
		}
	}

}
