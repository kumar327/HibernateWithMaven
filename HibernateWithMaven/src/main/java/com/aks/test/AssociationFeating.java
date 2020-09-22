package com.aks.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aks.pojo.College;

public class AssociationFeating {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		College college = session.get(College.class, 1);
		System.out.println(
				college.getCollegeId() + " " + college.getCollegeName() + college.getAddress().getAddressName());
		session.close();

		Session session1 = sessionFactory.openSession();
		College college1 = session1.get(College.class, 1);
		System.out.println(
				college1.getCollegeId() + " " + college1.getCollegeName() + college1.getAddress().getAddressName());

		sessionFactory.close();
	}
}
