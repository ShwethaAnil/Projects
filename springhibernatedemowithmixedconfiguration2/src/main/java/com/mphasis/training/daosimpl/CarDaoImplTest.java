package com.mphasis.training.daosimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mphasis.training.entities.Car;

@Repository
@Transactional
public class CarDaoImplTest  {
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public CarDaoImplTest(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	
	public void insertCar(Car car) {
		System.out.println(car.getEngine()+"car values in dao");
		hibernateTemplate.saveOrUpdate(car);
	}
	
	public Car getById(int id){  
	    Car e=(Car)hibernateTemplate.get(Car.class,id);  
	    return e;  
	}  
}
