package com.mphasis.training.daos;

import java.util.List;

import com.mphasis.training.entities.Car;

public interface CarDao {
	public void insertCar(Car car);
	public void deleteCar(int id);
	public void updateCar(Car car);
	public Car getById(int id);
	public List<Car> getAll();
	public List<Car> getCarByModel(String model);
}
