package com.aks.test;

import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.aks.pojo.Student;

public class HQLTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
//		Transaction tx = session.beginTransaction();
//
//		Random r = new Random();
//		for (int i = 1; i < 50; i++) {
//			Student s = new Student();
//			s.setsId(i);
//			s.setsName("Name " + i);
//			s.setMarks(r.nextInt(100));
//			session.save(s);
//			
//		}
//		tx.commit();

		Query<Object[]> q = session.createQuery("select sId from Student where marks>90");

		List<Object[]> list = q.list();
//		for (Integer student : student) {
		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));
		}
//		}

		sessionFactory.close();
	}
}
