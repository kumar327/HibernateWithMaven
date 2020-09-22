package com.aks.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.aks.pojo.Address;
import com.aks.pojo.College;

public class AssociationTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		College c = new College();
		c.setCollegeId(1);
		c.setCollegeName("VBIT");
		Address a = new Address();
		a.setAddressId(1);
		a.setAddressName("Ght");
		a.setCity("HYD");
		a.setState("TS");
		a.setPincode(500001);
		c.setAddress(a);
		session.save(c);
		System.out.println("Saved");
		tx.commit();

		session.close();
		sessionFactory.close();
	}
}
