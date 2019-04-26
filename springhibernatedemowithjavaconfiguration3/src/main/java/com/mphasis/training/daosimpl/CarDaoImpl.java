package com.mphasis.training.daosimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mphasis.training.daos.CarDao;
import com.mphasis.training.entities.Car;

@Repository
public class CarDaoImpl implements CarDao {
	
	@Autowired
	SessionFactory sessionFactory;

	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void insertCar(Car car) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		System.out.println(car.getEngine()+"car values in dao");
		session.save(car);
		tr.commit();
		session.close();
	}

	public void deleteCar(int id) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Car c=(Car)session.get(Car.class,id);
		session.delete(c);
		tr.commit();
		session.close();
	}

	public void updateCar(Car car) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.update(car);
		tr.commit();
		session.close();
	}

	public Car getById(int id) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Car c=(Car)session.get(Car.class,id);
		tr.commit();
session.close();
		return c;
	}

	public List<Car> getAll() {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		List<Car> cars=session.createCriteria(Car.class).list();
		tr.commit();
		session.close();
		return cars;
	}
	public List<Car> getCarByModel(String model) {
			Session session=sessionFactory.openSession();
			Transaction tr=session.beginTransaction();
			Criteria cri=session.createCriteria(Car.class);
			cri.add(Restrictions.eq("model", model));
			List<Car> cars = cri.list();
			tr.commit();
			session.close();
			return cars;
		}
	

}
