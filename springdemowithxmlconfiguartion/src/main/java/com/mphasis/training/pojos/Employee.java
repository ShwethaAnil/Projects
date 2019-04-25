package com.mphasis.training.pojos;

import java.util.List;

public class Employee {
	private int empid;
	private String ename;
	private double salary;
	private String hiredate;
	private List<Address> address;
	
	
	
	

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
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + ", hiredate=" + hiredate
				+ ", address=" + address + "]";
	}
	

}
