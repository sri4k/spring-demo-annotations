package org.demo.spring;

import org.springframework.stereotype.Component;

@Component
public class DatabaseInstruction implements InstructionService {

	@Override
	public String getInstruction() {
		return "Database instruction";
	}

}
