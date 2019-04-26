package com.mphasis.training.view;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mphasis.training.configuration.AppConfig;
import com.mphasis.training.entities.Car;
import com.mphasis.training.service.CarService;
import com.mphasis.training.serviceimpl.CarServiceImpl;

public class CarApp {

	public static void main(String[] args) {
		
		ApplicationContext context=
				new AnnotationConfigApplicationContext(AppConfig.class); 
				//new ClassPathXmlApplicationContext("beans.xml");
	Scanner sc=new Scanner(System.in);
	do {
	System.out.println("enter the Choice values 1. Insert\n"
				+ "2.Update \n3. Delete\n 4. GetById \n 5.GetAll"
				+ "\n 6.GetBy model");
		CarService carService=
				(CarService)context.getBean("carServiceImpl");
		int choice=sc.nextInt();
		switch(choice) {
		case 1: System.out.println("Enter the car details"
				+ "1. Model 2.Engine 3.tyre 4. gear");
		Car c=new Car();
		c.setModel(sc.next());
		c.setEngine(sc.next());
		c.setTyre(sc.next());
		c.setGear(sc.next());
		carService.addCar(c);
		System.out.println("added");
		break;
		case 2:System.out.println("enter the id to update the engine and gear");
				int id=sc.nextInt();
				Car car=carService.getById(id);
				car.setEngine(sc.next());
				car.setGear(sc.next());
				carService.editCar(car);
				break;
		case 3: System.out.println("enter the id to delete");
				carService.removeCar(sc.nextInt());
				System.out.println("deleted");
				break;
		case 4: System.out.println("enter the id to retrive");
			Car car1=carService.getById(sc.nextInt());
			System.out.println(car1);
			break;
		case 5: System.out.println("list of cars");
		List<Car> cars=carService.getAll();
		cars.forEach(cr->System.out.println(cr));
		break;
		case 6: System.out.println("list of cars based on model");
		List<Car> cars1=carService.getCarByModel(sc.next());
		cars1.forEach(cr->System.out.println(cr));
		break;
		default: System.exit(0);
		}
	}while(true);		
	}
}