package com.mphasis.training.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	private int modelno;
	private String company;
	@ManyToMany
	private List<Student> student;
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public int getModelno() {
		return modelno;
	}
	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	

}
