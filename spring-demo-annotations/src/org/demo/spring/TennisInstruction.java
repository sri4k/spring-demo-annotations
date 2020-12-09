package org.demo.spring;

import org.springframework.stereotype.Component;

@Component
public class TennisInstruction implements InstructionService {

	@Override
	public String getInstruction() {
		return "Tennis instruction";
	}

}
