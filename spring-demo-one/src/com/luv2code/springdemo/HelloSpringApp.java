package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String [] args) {
		//Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		//Retrieve bean from spring container
		Coach theCoach = context.getBean("BaseballCoach", Coach.class);
		Coach soccerCoach = context.getBean("soccerCoach", Coach.class);
		
		//Call methods on the bean
		System.out.println(theCoach.getDailyFortune());
		System.out.println(soccerCoach.getDailyFortune());
		
		//Close the context
		context.close();
	}
}
