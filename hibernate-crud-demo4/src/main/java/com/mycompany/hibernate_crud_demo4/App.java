package com.mycompany.hibernate_crud_demo4;

/**
 * Hello world!
 *
 */





import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.mycompany.hibernate_crud_demo4.factory.MyHibernateFactory;
import com.mycompany.hibernate_crud_demo4.model.Address;
import com.mycompany.hibernate_crud_demo4.model.Customer;

import static java.lang.System.in;
/**
 * Hello world!
 *
 */
public class App 
{/*
	private static Scanner scanner=new Scanner(in);
    public static void main( String[] args )
    {
    	
		/*
		 * try { int choice=0; do { System.out.println("1.create employee.");
		 * System.out.println("2.display all available employee.");
		 * System.out.println("3.find employee by id.");
		 * System.out.println("4.find employee by custom id.");
		 * System.out.println("5.remove by id."); System.out.println("0.exit");
		 * System.out.print("your choice: "); choice=scanner.nextInt(); switch (choice)
		 * { case 1:
		 * 
		 * System.out.print("First Name: "); String fName=scanner.next();
		 * System.out.print("Last Name: "); String lName=scanner.next();
		 * System.out.print("Email: "); String email=scanner.next();
		 * dao.createEmployee(new SharedEmployee(fName,lName,email));
		 * System.out.println("inserted");
		 * 
		 * break; case 2: List<SharedEmployee> se=dao.getAllEmployee();
		 * for(SharedEmployee see:se) { System.out.println(see); }
		 * 
		 * break; case 3: System.out.print("enter employee id: "); int
		 * id=scanner.nextInt(); SharedEmployee sEmployee=dao.findById(id);
		 * if(sEmployee==null) { System.out.println("no such record found."); } else {
		 * System.out.println(sEmployee); }
		 * 
		 * break; case 4: System.out.println("custom id: "); String cid=scanner.next();
		 * dao.findByCustomId(cid); break; case 5:
		 * System.out.print("enter employee id: "); id=scanner.nextInt();
		 * dao.deleteEmployee(id); break; default: break; }
		 * 
		 * } while (choice!=0);
		 * 
		 * 
		 * 
		 * 
		 * } catch (Exception e) { // TODO: handle exception e.printStackTrace(); }
		 */
    	
    	
    	/*
    	try {
    	SessionFactory factory=MyHibernateFactory.getMySession();
    	Session session=factory.openSession();
			/*
			 * Address address1=new Address(); address1.setAddressLine1("India");
			 * address1.setAddressLine2("Hydrabad"); address1.setZipCode("4009");
			 * address1.setPhoneNumber("1234"); Customer customer=new Customer();
			 * customer.setCustomerName("Shane"); customer.setCustomerAddress(address1);
			 * session.getTransaction().begin(); session.persist(address1);
			 * session.persist(customer); session.getTransaction().commit();
			 * System.out.println("ok.");
			 */
    	/*
    	session.getTransaction().begin();
    	Customer customer=session.get(Customer.class, 1);
    	if(customer!=null)
    	{
    		session.remove(customer);
    		session.getTransaction().commit();
    		System.out.println("removed.");
    	}
    	else
    	{
    		System.out.println("no such id.");
    	
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}	
    }*/
}