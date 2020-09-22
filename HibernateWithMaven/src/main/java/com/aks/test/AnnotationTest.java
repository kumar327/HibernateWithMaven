package com.aks.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.aks.pojo.OrderStatus;
import com.aks.pojo.Orders;

public class AnnotationTest {

	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Orders orders = new Orders();
		orders.setOrderId(4);
		orders.setOrderName("MI Max pro");
		orders.setOrderCost(14000);
		OrderStatus os = new OrderStatus();
		os.setOrderStatus("Deliverd");
		orders.setOrderStatus(os);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		int results = (Integer) session.save(orders);
		tx.commit();
		System.out.println("Inserted Successfully");

	}
}
