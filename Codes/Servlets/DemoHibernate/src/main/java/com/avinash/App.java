package com.avinash;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
//		System.out.println("Hello World");
		
		Alien telusko = new Alien();
		telusko.setAid(101);
		telusko.setAname("Avinash");
		telusko.setColor("Green");
		
		Configuration con = new Configuration();
		
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		session.persist(telusko);
	}
}
