package org.demo.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

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
	
	public FootballCoach(InstructionService instructionService) {
		this.instructionService = instructionService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Football Coach";
	}

	@Override
	public String getDailyInstruction() {
		return instructionService.getInstruction();
	}

}
