package org.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatTennisCoach")
@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	//Field injection using Java Reflections
	
	@Autowired
	@Qualifier("randomInstruction")
	private InstructionService instructionService;
	
	public TennisCoach() {
		System.out.println("TennisCoach default constructor");
	}
	
	
	//constructor injection
	/*
	@Autowired
	public TennisCoach(@Qualifier("randomInstruction") InstructionService instructionService) {
		this.instructionService = instructionService;
	}
	*/

	//setter injection
	/*
	@Autowired
	public void setInstructionService(InstructionService instructionService) {
		this.instructionService = instructionService;
	}
	*/
	
	//method injection
	/*
	@Autowired
	public void someMethod(InstructionService instructionService) {
		this.instructionService = instructionService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Tennis Coach";
	}

	@Override
	public String getDailyInstruction() {
		return instructionService.getInstruction();
	}

}
