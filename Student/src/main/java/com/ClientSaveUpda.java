package com;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClientSaveUpda {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Teacher.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Teacher teacher = new Teacher(4,  "Juber", "Pune","Councler");
		session.saveOrUpdate(teacher);
		
		transaction.commit();

	
	
	
	
	
	}
}
