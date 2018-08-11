package com.scp.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class AutowiredDemo {
	public static void main(String[] args) {
		/*BeanFactory factory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
		
		Student s1=(Student) factory.getBean("stud");
		System.out.println(s1);*/
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Student s1=(Student) context.getBean("stud1");
		System.out.println(s1);
	}
}
