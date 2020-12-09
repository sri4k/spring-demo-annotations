package org.demo.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		//read the spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);

		//get the bean from spring container
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyInstruction());
		System.out.println(swimCoach.getEmail());
		System.out.println(swimCoach.getTeam());
		
		//close the context
		context.close();
	}
}
