package com.mphasis.training.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.training.daos.CarDao;
import com.mphasis.training.entities.Car;
import com.mphasis.training.service.CarService;

@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	CarDao carDao;

	public void setCarDao(CarDao carDao) {
		this.carDao = carDao;
	}

	public void addCar(Car car) {
		System.out.println("Car values in service"+car.getEngine());
		carDao.insertCar(car);
	}

	public void removeCar(int id) {
		carDao.deleteCar(id);
	}

	public void editCar(Car car) {
		carDao.updateCar(car);
	}

	public Car getById(int id) {
		return carDao.getById(id);
	}

	public List<Car> getAll() {
		return carDao.getAll();
	}

	public List<Car> getCarByModel(String model) {
		return carDao.getCarByModel(model);
	}

}
