package com.mycompany.hibernate_inheritance_table_demo.table_per_subclass;







import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AccountTest {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Account.class)
				.addAnnotatedClass(SavingsAccount.class).addAnnotatedClass(CurrentAccount.class)
				.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Account e1 = new Account();
		e1.setAcc_hldr_name("athi");
		e1.setAcc_number(333);
		e1.setAddress("kannur");
		e1.setEmail("a@gmail.com");
		
		SavingsAccount e2 = new SavingsAccount();
		e2.setAcc_hldr_name("akhi");
		e2.setAcc_number(222);
		e2.setAddress("kannur");
		e2.setEmail("aki@gmail.com");	
		e2.setAnnualInterestrate(6.2);
		e2.setBalance(60000);
		e2.setTotaldeposits(700000);

		CurrentAccount e3 = new CurrentAccount();
		e3.setAcc_hldr_name("ammu");
		e3.setAcc_number(999);
		e3.setAddress("kannur");
		e3.setEmail("abn@gmail.com");
		e3.setTotalwithdraws(40000);

		session.persist(e1);
		session.persist(e2);
		session.persist(e3);

		t.commit();
		session.close();
		System.out.println("success");
	}
}