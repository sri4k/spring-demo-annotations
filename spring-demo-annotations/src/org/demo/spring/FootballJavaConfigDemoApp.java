package org.demo.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FootballJavaConfigDemoApp {

	public static void main(String[] args) {

		//read the spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);

		//get the bean from spring container
		FootballCoach coach = context.getBean("footballCoach", FootballCoach.class);

		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyInstruction());
		System.out.println(coach.getEmail());
		System.out.println(coach.getTeam());
		
		//close the context
		context.close();
	}
}
