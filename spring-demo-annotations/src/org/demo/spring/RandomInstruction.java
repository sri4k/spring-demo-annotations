package org.demo.spring;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomInstruction implements InstructionService {

	private String[] data = {
			"RandomInstruction 1",
			"RandomInstruction 2",
			"RandomInstruction 3" };
	
	private Random random = new Random();
	
	
	@Override
	public String getInstruction() {
		int index = random.nextInt(data.length);
		return data[index];
	}

}
