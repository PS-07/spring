package com.ps.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach coach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// results will be different for scope="singleton" and scope="prototype"
		boolean result = (coach == alphaCoach);
		System.out.println("Pointing to same object: " + result);
		System.out.println("Memory location for coach: " + coach);
		System.out.println("Memory location for alphaCoach: " + alphaCoach);
		
		context.close();
	}

}
