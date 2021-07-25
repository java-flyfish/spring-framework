package org.springframework.debug.bean;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		AbstractXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Teacher bean = applicationContext.getBean(Teacher.class);
		bean.getBeanName();
		bean.getEnvironment();
	}
}
