package com.abc.springcore.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import com.abc.springcore.bean.Product;

public class ProductMain {

	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("springcore.xml");
		Product product1 =(Product)context.getBean("p1");
		
		System.out.println("ProductId:"+product1.getProductId());
		System.out.println("ProductName:"+product1.getProductName());
		System.out.println("ProductPrice:"+product1.getProductPrice());
		
		Product product2 = (Product) context.getBean("p1");
		
		if(product1==product2) {
			System.out.println("both are refer to same object");
		}
		else {
			System.out.println("both are refer to different object");
		}
		
	}

}
