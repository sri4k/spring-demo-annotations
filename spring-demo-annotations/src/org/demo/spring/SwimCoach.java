package org.demo.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	private InstructionService instructionService;
	
	//constructor injection
	@Autowired
	public SwimCoach(@Qualifier("RESTInstruction") InstructionService instructionService) {
		this.instructionService = instructionService;
		System.out.println("SwimCoach default constructor");
	}
	
	//define init method
	@PostConstruct
	public void initBean() {
		System.out.println("SwimCoach init");
	}
	
	//define destroy method
	@PreDestroy
	public void destroyBean() {
		System.out.println("SwimCoach destroy");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim Coach";
	}

	@Override
	public String getDailyInstruction() {
		return instructionService.getInstruction();
	}

}
