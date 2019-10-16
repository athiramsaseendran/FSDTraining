package com.mycompany.hibernate_crud_demo4;






import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernate_crud_demo4.one_one_uni.Instructor;
import com.mycompany.hibernate_crud_demo4.one_one_uni.InstructorDetail;

public class DeleteDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();

			int theId = 2;
			InstructorDetail tempInstructor = session.get(InstructorDetail.class, theId);

			System.out.println("Found instructor: " + tempInstructor);

			if (tempInstructor != null) {

				System.out.println("Deleting: " + tempInstructor);

				session.delete(tempInstructor);
			}

			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}

}
