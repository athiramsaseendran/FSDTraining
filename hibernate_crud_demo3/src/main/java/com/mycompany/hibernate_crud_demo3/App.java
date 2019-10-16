package com.mycompany.hibernate_crud_demo3;

/**
 * Hello world!
 *
 */







import static java.lang.System.in;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mycompany.hibernate_crud_demo3.model.Instructor;
import com.mycompany.hibernate_crud_demo3.model.Instructor_detail;
import com.mycompany.hibernate_crud_demo3.factory.MyHibernateFactory;





/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	
    	try {
    		SessionFactory sessionFactory = MyHibernateFactory.getMySession();
    		Session session = null;
    		
    		
    		
    		session = sessionFactory.openSession();

    		Instructor_detail id = new Instructor_detail();
    		id.setHobby("Cricket");
    		id.setYoutubechannel("www.youtube.com");
    		
    		
    		Instructor i = new Instructor();   
    		i.setFirstName("Athira");
    		i.setLastName("meera");
    		i.setEmail("athi@i.com");
    		
    		
    		
    		session.getTransaction().begin();
    		session.persist(id);
    		session.persist(i);
  			session.getTransaction().commit();	
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
		   
    }
}