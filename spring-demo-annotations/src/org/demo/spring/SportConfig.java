package org.demo.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("org.demo.spring")
public class SportConfig {

	//define bean for instruction service
	@Bean
	public InstructionService footballService() {
		return new FootballInstruction();
	}
	
	//define bean for our swim coach and inject dependency
	@Bean
	public Coach footballCoach() {
		return new FootballCoach(footballService());
	}
	
}
