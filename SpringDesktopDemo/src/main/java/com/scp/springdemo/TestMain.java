package com.scp.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class TestMain {
	public static void main(String[] args) {
		//ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Resource rs=new ClassPathResource("beans.xml");
		BeanFactory context=new XmlBeanFactory(rs);
		Student obj1=(Student) context.getBean("stud");
		System.out.println(obj1);
		/*obj1.setStudFName("yyy");
		System.out.println(obj1);*/
		Student obj2=(Student) context.getBean("stud");
		obj2.setStudFName("yyy");
		System.out.println(obj2);
		
		//System.out.println(obj1);
		System.out.println("== : "+(obj1==obj2));
		System.out.println("equals : "+(obj1.equals(obj2)));	
	}
}
