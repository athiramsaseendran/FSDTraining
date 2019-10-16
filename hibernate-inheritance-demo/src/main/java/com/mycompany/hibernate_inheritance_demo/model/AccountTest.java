package com.mycompany.hibernate_inheritance_demo.model;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AccountTest {
	public static void main(String[] args) {
		try {
			SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Account.class)
					.addAnnotatedClass(CurrentAccount.class)
					.addAnnotatedClass(SavingsAccount.class).buildSessionFactory();
			Session session = factory.openSession();
			
			Account cd = new Account(333,"athi","kannur","athi@gmail.com");
			CurrentAccount secd = new CurrentAccount(333,"athi","kannur","athi@gmail.com",50000);
			SavingsAccount icd = new SavingsAccount(333,"athi","kannur","athi@gmail.com",60000,6.2,70000);
		session.getTransaction().begin();
			session.save(cd);
			session.save(secd);
			session.save(icd);
			session.getTransaction().commit();
			System.out.println("ok..");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}