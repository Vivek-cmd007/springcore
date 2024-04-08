package com.abc.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 class Main {

	public static void main(String[] args) {
	
		ApplicationContext context =new ClassPathXmlApplicationContext("appcontext.xml");
		HelloBean helloBean =(HelloBean) context.getBean("msgBean");
		
		helloBean.display();
	}

}