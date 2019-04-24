package com.mphasis.training.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int st_id;
	private StudentName st_name;
	private double marks;
	//@OneToMany(mappedBy="student")
	@ManyToMany(mappedBy="student")
	private List<Laptop> laptops;
	
	public List<Laptop> getLaptops() {
		return laptops;
	}
	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}
	public int getSt_id() {
		return st_id;
	}
	public void setSt_id(int st_id) {
		this.st_id = st_id;
	}
	public StudentName getSt_name() {
		return st_name;
	}
	public void setSt_name(StudentName st_name) {
		this.st_name = st_name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	

}
