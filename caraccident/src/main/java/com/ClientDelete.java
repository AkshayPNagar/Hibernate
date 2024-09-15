package com;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientDelete {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(car.class);
		
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transaction =  session.beginTransaction();
		
			car c = new car(1,"Maruti", "Sir", "Nira");
		session.update(c);
		
		transaction.commit();
	}

}
