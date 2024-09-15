package com;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class ClientUpdate {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Students.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
				
			Students std = new Students(6, "Shubham","A.Nagar",82);	
				session.update(std);
				
				transaction.commit();
		
		
	}

}
