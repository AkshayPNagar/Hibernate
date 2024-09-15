package Infosys.src.main.java.com;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

import org.hibernate.Query;

public class ClientQuery {

	

		public static void main(String[] args) {
			
			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(Author.class);
			
			SessionFactory sf = cfg.buildSessionFactory();
			
			Session session = sf.openSession();
			
			Query query = session.createQuery("select author_name from Author");
			
			List <String> name = query.list();
			
			for(String names : name)
			{
				System.out.println(names);
			}
			
			session.save(name);
			
			
		}

	}
	

}
