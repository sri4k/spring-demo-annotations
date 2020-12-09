package org.demo.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("tennisCoach", Coach.class);
		Coach coach2 = context.getBean("tennisCoach", Coach.class);
		
		//test the scope of the objects
		boolean result = (coach == coach2);
		System.out.println("Pointing to the same object " + result);
		System.out.println("Memory location for coach " + coach);
		System.out.println("Memory location for coach2 " + coach2);
		
		//read values from property file
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		System.out.println(swimCoach.getEmail());
		System.out.println(swimCoach.getTeam());
		
		context.close();
	}

}
