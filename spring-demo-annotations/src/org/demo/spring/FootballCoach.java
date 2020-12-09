package org.demo.spring;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

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
