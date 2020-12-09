package org.demo.spring;

import org.springframework.stereotype.Component;

@Component
public class RESTInstruction implements InstructionService {

	@Override
	public String getInstruction() {
		return "REST instruction";
	}

}
