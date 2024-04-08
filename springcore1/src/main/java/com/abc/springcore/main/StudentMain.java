package com.abc.springcore.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.springcore.bean.Student;

public class StudentMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("springcore.xml");
        Student student1 =(Student) context.getBean("stud");

        System.out.println("Id: "+student1.getStudentId());
        System.out.println("Name: "+student1.getStudentName());
        System.out.println("Age: "+student1.getAge());

        context.close();


    }

}