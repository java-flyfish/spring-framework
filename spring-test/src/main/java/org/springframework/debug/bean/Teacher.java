package org.springframework.debug.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class Teacher implements BeanNameAware, EnvironmentAware {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	private String beanName;

	private Environment environment;

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}

	@Override
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	public String getBeanName(){
		return beanName;
	}

	public Environment getEnvironment(){
		return environment;
	}


}
