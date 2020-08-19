package com.jspiders.hibernate3.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspiders.hibernate3.entity.Student;
import com.jspiders.hibernate3.entity.Trainer;
import com.jspiders.hibernate3.util.HibernateUtil;

public class HibernateClient {

	public static void main(String[] args) {
		
		Session session = null;
		SessionFactory factroy = HibernateUtil.getSessionFactroy();
		session = factroy.openSession();
		
		Transaction tx = session.getTransaction();
		tx.begin();
		
		Trainer tr = new Trainer();
		tr.setName("Blake");
		tr.setEmail("blake@jspiders.com");
	
		Student std = new Student();
		std.setName("smith");
		std.setEmail("smith@jspiders.com");
		std.setTrainer(tr);
		
		session.persist(std);
		
		tx.commit();
		
		if(session!=null) {
			session.close();
		}
		
	}

}
