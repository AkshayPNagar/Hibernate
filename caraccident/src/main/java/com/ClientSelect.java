package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class ClientSelect {

	public static void main(String[] args) {

			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(car.class);
			
			SessionFactory factory = cfg.buildSessionFactory();
			
		
		Session session =factory.openSession();
			
			car ca = session.load(car.class, 1);
			
			System.out.println(ca);
	}

}
