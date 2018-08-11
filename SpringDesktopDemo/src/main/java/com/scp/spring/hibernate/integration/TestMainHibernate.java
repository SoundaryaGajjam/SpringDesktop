package com.scp.spring.hibernate.integration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMainHibernate {
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("hibernate_beans.xml");
		Product p1=(Product) context.getBean("pid");
		System.out.println(p1);
		
		SessionFactory sFactory=(SessionFactory) context.getBean("hbmSessioNFactory");
		Session s1=sFactory.openSession();
		Transaction tr1=s1.beginTransaction();
		s1.save(p1);
		s1.flush();
		tr1.commit();
		
	}
}
