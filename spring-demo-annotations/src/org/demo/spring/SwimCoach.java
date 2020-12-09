package org.demo.spring;

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
