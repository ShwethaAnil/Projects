package com.mphasis.training.pojos;

import org.springframework.stereotype.Component;

@Component
public class I7Processor implements Processor {

	public I7Processor() {
		System.out.println("I7Processor added");
	}
	
	public void process() {
		System.out.println("I7 processor is running");

	}

}
