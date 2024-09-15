package com;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
public class ClientSelect {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Students.class);
		
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		//Transaction trasaction = session.beginTransaction();
		Students a = session.load(Students.class,4);
		
		//System.out.println(session.load(Students.class,4));
		System.out.println(a);
		
		
	}

}
