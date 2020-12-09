package org.demo.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		//read the spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//get the bean from spring container
		Coach coach = context.getBean("tennisCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyInstruction());
		
		Coach coach2 = context.getBean("swimCoach", Coach.class);
		System.out.println(coach2.getDailyWorkout());
		System.out.println(coach2.getDailyInstruction());
		
		//close the context
		context.close();
	}
}
