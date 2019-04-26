package com.mphasis.training.pojos;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee {//implements InitializingBean,DisposableBean {
	private int empid;
	private String ename;
	private double salary;
	private String hiredate;
	private List<Address> address;
	
	public void init() {
		System.out.println("initializing");
	}
	
	public void clean() {
		System.out.println("destroy method");
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

	/*public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}*/
	

}
