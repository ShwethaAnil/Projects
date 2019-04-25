package com.mphasis.training.pojos;

import org.springframework.stereotype.Component;

@Component("hd")
public class Type3 implements HardDisk {
public Type3() {
	System.out.println("type3 hdd added");
}
	
	public void memory() {
		System.out.println("Hard disk of Type 3");

	}

}
