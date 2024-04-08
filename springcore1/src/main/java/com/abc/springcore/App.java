package com.abc.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	Square s = new Square();
//    	s.setSide(4);
//    	
//    	Triangle t =new Triangle();
//    	t.setBase(2);
//    	t.setHeight(3);
//    	
//    	Shape shape = new Circle();// creating dependency object
//    	
//    	
//        ShapeService service = new ShapeService();
//        service.setShape(t);//injecting dependency object, setter injection
        
    	ApplicationContext context =new ClassPathXmlApplicationContext("appcontext.xml");
    	ShapeService service = (ShapeService) context.getBean("sService");
        double area =service.findArea();
        System.out.println(area);
        
    }
}
