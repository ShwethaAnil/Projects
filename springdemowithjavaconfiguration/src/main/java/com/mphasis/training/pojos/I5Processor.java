package com.mphasis.training.pojos;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class I5Processor implements Processor {
	
	public I5Processor() {
		System.out.println("I5 Processor added");
	}
	
	public void process() {
		System.out.println("I5 Processor running");	
	}
}
