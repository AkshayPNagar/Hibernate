package com;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ClientInsert {

	public static void main(String[] args) {

			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(Students.class);
			
			
			SessionFactory factory = cfg.buildSessionFactory();
			
			
			Session session = factory.openSession();
			
			Transaction transaction = session.beginTransaction();
			
			Students std= new Students(6, "Shubham","Gaikwad",82);
			
			session.save(std);
			transaction.commit();
			
	}

}
