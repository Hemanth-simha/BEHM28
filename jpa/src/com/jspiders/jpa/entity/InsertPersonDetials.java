package com.jspiders.jpa.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertPersonDetials {

	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		entityManager = emf.createEntityManager();
		
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		
		Person person = new Person();
		person.setName("King");
		
		entityManager.persist(person);
		tx.commit();
		if (entityManager != null) {
			entityManager.close();
		}
	}

}
