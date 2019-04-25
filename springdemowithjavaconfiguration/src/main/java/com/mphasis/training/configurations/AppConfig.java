package com.mphasis.training.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mphasis.training.pojos.Address;
import com.mphasis.training.pojos.Employee;

@Configuration
@ComponentScan(basePackages="com.mphasis.training.pojos")
public class AppConfig {
	
	
	/*@Bean
	public Address getAddress() {
		Address e1=new Address();
		return e1;
	}
	
	@Bean
	public Employee getEmployee() {
		Employee e1=new Employee();
		e1.setAddress(getAddress());
		return e1;
	}*/
	
	

}
