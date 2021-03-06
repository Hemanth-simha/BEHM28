package com.jspiders.hibernate2.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataBuilder;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.SessionFactoryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory()
	{
		StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
		serviceRegistryBuilder.configure("hibernate.cfg.xml");
		StandardServiceRegistry build = serviceRegistryBuilder.build();
		
		MetadataSources metadataSources= new MetadataSources(build);
		MetadataBuilder metadataBuilder = metadataSources.getMetadataBuilder();
		Metadata metadata = metadataBuilder.build();
		
		SessionFactoryBuilder sessionFactoryBuilder = metadata.getSessionFactoryBuilder();
		SessionFactory sessionFactory = sessionFactoryBuilder.build();
		return sessionFactory;
	}
	public static SessionFactory getSessionFactroy() {
		return sessionFactory;
	}
	
}
