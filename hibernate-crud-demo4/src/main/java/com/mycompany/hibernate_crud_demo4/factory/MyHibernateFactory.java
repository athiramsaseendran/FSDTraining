package com.mycompany.hibernate_crud_demo4.factory;







import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernate_crud_demo4.model.Address;
import com.mycompany.hibernate_crud_demo4.model.Customer;

public class MyHibernateFactory {

	private static SessionFactory factory;

	public static SessionFactory getMySession() {
		factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class)
				.addAnnotatedClass(Address.class).buildSessionFactory();
		return factory;

	}

}
