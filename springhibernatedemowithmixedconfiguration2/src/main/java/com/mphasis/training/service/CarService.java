package com.mphasis.training.service;

import java.util.List;

import com.mphasis.training.entities.Car;

public interface CarService {
	public void addCar(Car car);
	public void removeCar(int id);
	public void editCar(Car car);
	public Car getById(int id);
	public List<Car> getAll();
	public List<Car> getCarByModel(String model);
}
