package org.demo.spring;

import org.springframework.stereotype.Component;

@Component
public class FootballInstruction implements InstructionService {

	@Override
	public String getInstruction() {
		return "Kick the football";
	}

}
