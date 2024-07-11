package com.avinash.HibernateDemo;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	Laptop laptop = new Laptop();
//    	laptop.setLid(101);
//    	laptop.setLname("lenovo");
    	
    	
//    	Student s = new Student();
//    	s.setMarks(50);
//    	s.setName("avinash");
//    	s.setRollno(1);
//    	s.setLaptop(laptop);
//    	s.getLaptop().add(laptop);
//    	
//    	laptop.getStudents().add(s);
    	
//    	Alien telusko = new Alien();
//    	telusko.setAid(103);
//    	telusko.setColor("white");
//    	telusko.setAname("avinash3");
//    	AlienName an = new AlienName();
//    	an.setFname("Avinash");
//    	an.setMname("kumar");
//    	an.setLname("gautam");
//    	telusko.setAname(an);
//    	telusko.setAid(103);
//    	telusko.setAname("kumar");
//    	telusko.setColor("yellow");
    	
//    	Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    	Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Alien.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session session1 = sf.openSession();
    	
    	Transaction tx1 = session1.beginTransaction();
    	
    	@SuppressWarnings("deprecation")
		Query q1 = session1.createQuery("from Alien where aid=101");
    	
    	q1.setCacheable(true);
    	Alien a2 = (Alien)q1.uniqueResult(); 
    	
    	Alien a = (Alien)session1.get(Alien.class,101);
    	System.out.println(a);
    	a = (Alien)session1.get(Alien.class,101);
    	System.out.println(a); //here the query will not be fired again because of default hibernate first level cache
//    	session.persist(telusko);
//    	Alien a1 = session.get(Alien.class, 1);
//    	System.out.println(a1.getAname());
//    	Collection<Laptop> laps = a1.getLaps();//if we dont write this line, code will not fetch the list of laptops, that means for laptops it is LAZY Fetch here.
//    	for(Laptop l: laps)
//    	{
//    		System.out.println(l);
//    	}
//    	telusko = (Alien)session.get(Alien.class, 101);
//    	session.persist(laptop);
//    	session.persist(s);
//    	session.persist(telusko);
    	
//    	System.out.println("Hi");
    	tx1.commit();
    	session1.close();
    	Session session2 = sf.openSession();
    	Transaction tx2 = session2.beginTransaction();
    	
    	a = (Alien)session2.get(Alien.class,101);
    	System.out.println(a);
    	
    	tx2.commit();
//    	System.out.println(telusko);
    	 
        //System.out.println( "Hello World!" );
    }
}