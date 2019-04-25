package com.mphasis.training.pojos;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Type4 implements HardDisk {
	
	public Type4() {
		System.out.println("type4 hdd added");
	}
	
	public void memory() {
		System.out.println("Hard disk of Type 4");
	}
}
