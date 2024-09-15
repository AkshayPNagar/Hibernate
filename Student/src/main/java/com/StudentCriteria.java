package com;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import java.util.List;



public class StudentCriteria {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Students.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Criteria criteria = session.createCriteria(Students.class);
		
		List<Students> info = criteria.list();
		
		for(Students all : info)
		{
			System.out.println(all);
		}
		
		
		System.out.println("--------------------------------------------------------------");
		
		
		
		Projection projection1 = Projections.property("Roll");
		
		criteria.setProjection(projection1);
		
		
		List<Integer> roll = criteria.list();
		
		for(Integer all : roll)
		{
			System.out.println(all);
		}
		
		
		System.out.println("Above o/p is just one column i need more than one column so we use ProjectionList for that");
		
		System.out.println("--------------------------------------------------------------");
		
		
// ProjetionList	If i want to print more than one column then we need to use ProjectionList


		Projection projection2 = Projections.property("Name");
		
																							//Now we need to create Projetion list
		
		ProjectionList projection = Projections.projectionList(); 
	
																							//	Now add projection in projectionlist
		
		projection.add(projection1);
		projection.add(projection2);
		
		criteria.setProjection(projection);
		
		List<Object[]> rn = criteria.list();
		
		for(Object[] infor : rn)
		{
			for(Object objects : infor)
			{
				System.out.println(objects.toString());
			}
		}
		
		
		System.out.println("--------------------------------------------------------------");

// if we direct print object then it will give address of the object i,e row 
		for(Object[] infor: rn)
		{
			System.out.println(infor);
		}
		
		
	}

}
