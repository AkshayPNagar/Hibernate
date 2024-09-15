package com;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import java.util.List;


public class ClientCriteria {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Teacher.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		
//Criteria		 in core CRUD operation of hibernate i cannot get all table data ie SELECT * FROM TABLE_Name
//			so overcome this problem Criteria is used.
		
		
		Criteria criteria = session.createCriteria(Teacher.class);
		
		List<Teacher> teacher =criteria.list();
		
		for(Teacher info : teacher)
		{
			System.out.println(info);
		}
		
		
//Projection	in CRUD operation in hibernate we can get only specific data we can not able to apply condition so we use PROJECTIOn for apply condition in hibernate
		
		Projection projection = Projections.property("t_name");
		
// TO link with Criteria
		
		criteria.setProjection(projection);
		
		List<String> name = criteria.list();
		
		for(String names :
			name)
		{
			System.out.println(names);
		}
	}

}
