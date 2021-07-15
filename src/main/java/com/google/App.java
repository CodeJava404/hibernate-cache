package com.google;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.google.pojo.Passanger;

public class App {
	public static void main(String[] args) {

		Passanger passanger1 = new Passanger(101, "John", "Delhi");

		Passanger passanger2 = new Passanger(102, "Elizabeth", "Banglore");
		Passanger passanger3 = new Passanger(104, "Amar", "Patna");

		SessionFactory sessionFactory = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tn = session.beginTransaction();
		session.save(passanger3);
		session.save(passanger2);
		session.save(passanger1);
		session.flush();
		Passanger emp = session.get(Passanger.class, 102);
		System.out.println(emp);
		session.close();

		Session session2 = sessionFactory.openSession();

		session2.beginTransaction().commit();
		Passanger emp11 = session2.get(Passanger.class, 102);
		System.out.println(emp11);
		session2.close();

	}
}
