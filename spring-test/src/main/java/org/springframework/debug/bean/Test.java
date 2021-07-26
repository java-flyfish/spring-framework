package org.springframework.debug.bean;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

public class Test {
	public static void main(String[] args) {

		AbstractXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Teacher bean = applicationContext.getBean(Teacher.class);
		A a = applicationContext.getBean(A.class);
		B b = applicationContext.getBean(B.class);
		System.out.println("A:" + a);
		System.out.println("B:"+ b);
	}
}
