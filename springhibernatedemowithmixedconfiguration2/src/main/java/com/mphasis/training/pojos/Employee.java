package com.mphasis.training.pojos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int empid;
	private String ename;
	private double salary;
	private String hiredate;
	@Autowired
	private Address address;
	
	public Employee(int empid, String ename, double salary, String hiredate, Address address) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.hiredate = hiredate;
		this.address = address;
	}

	public Employee() {
		System.out.println("employee called");
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	

}
