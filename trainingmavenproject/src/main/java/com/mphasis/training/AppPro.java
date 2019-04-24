package com.mphasis.training;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mphasis.training.entities.Products;
import com.mphasis.training.entities.Shop;

public class AppPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Configuration con=new Configuration().configure()
					.addAnnotatedClass(Shop.class)
					.addAnnotatedClass(Products.class);
SessionFactory sessionFactory=con.buildSessionFactory();
//session1
Session session=sessionFactory.openSession();
Transaction tr=session.beginTransaction();
	Shop s=(Shop)session.get(Shop.class, 10);
tr.commit();
session.close();
//session2
Session session1=sessionFactory.openSession();
Transaction tr1=session1.beginTransaction();
	Shop s2=(Shop)session1.get(Shop.class, 10);
tr1.commit();
session1.close();
	}

}
