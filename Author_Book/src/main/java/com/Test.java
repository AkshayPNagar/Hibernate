package com;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

//import org.hibernate.Criteria;
//import org.hibernate.criterion.Projection;
//import org.hibernate.criterion.Projections;


public class Test {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Author.class);
		cfg.addAnnotatedClass(Book.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Author a1 = new Author("Abhi Munde");
		
		Book b1 = new Book("Ram");
		Book b2 = new Book("Laxman");
		Book b3 = new Book("Movtivate");
		
		
		ArrayList<Book> bookss = new ArrayList<Book>();
		bookss.add(b1);
		bookss.add(b2);
		bookss.add(b3);
		
		a1.setBooks(bookss);
		
		session.save(a1);
		
		
//		VIMP NOTE : there is no need to create arraylist again and again only one list is sufficent.
		
		
		Author a2 = new Author("RabindraNath Tagore");
		
		Book b4= new Book("Gitanjali");
		Book b5= new Book("SONAR TORI");
		
		bookss.add(b4);
		bookss.add(b5);

		a2.setBooks(bookss);
		session.save(a2);
		tr.commit();
		
	}

}
