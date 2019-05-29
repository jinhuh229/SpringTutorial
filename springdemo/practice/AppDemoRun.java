package com.luv2code.springdemo.practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppDemoRun {

	public static void main(String[] args) {
		
		
		// load 
		ClassPathXmlApplicationContext  context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person thePerson = context.getBean("myPerson", Person.class);
		Student theStudent = context.getBean("myPerson", Student.class);
		
		System.out.println(thePerson.identify());
		System.out.println("Student: "+thePerson.description());
		System.out.println("The Taking Class: "+thePerson.getClassDescription());
		
		System.out.println("Student Name: "+theStudent.getStudentName());
		System.out.println("Student ID #: "+theStudent.getStudentID());
		
		context.close();
	}

}
