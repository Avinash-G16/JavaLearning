package com.avinash.JpaDemo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");//by pu we connect persistence.xml where db connection is configured
    	EntityManager em = emf.createEntityManager();
//    	Alien a = em.find(Alien.class, 4); //for saving
    	//em.getTransaction().begin();
    	//em.persist(obj);
    	//em.getTransaction().commit();
    	
        //System.out.println( "Hello World!" );
    }
}