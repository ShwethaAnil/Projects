package com.mphasis.training;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mphasis.training.entities.Laptop;
import com.mphasis.training.entities.Products;
import com.mphasis.training.entities.Shop;
import com.mphasis.training.entities.Student;

public class AppProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Configuration con=new Configuration().configure()
					.addAnnotatedClass(Shop.class);
					//.addAnnotatedClass(Products.class);
SessionFactory sessionFactory=con.buildSessionFactory();
Session session=sessionFactory.openSession();
Transaction tr=session.beginTransaction();
Shop shop1=new Shop();
//shop1.setShopid(1);
shop1.setShopname("mphstore");
shop1.setAddress("Mascot90");

session.save(shop1);


/*Shop shop1=new Shop();
//shop1.setShopid(1);
shop1.setShopname("MPh Store");
shop1.setAddress("Mascot90");

Products p1=new Products();
p1.setPid(121);
p1.setPname("Soap");
p1.setCost(44);
p1.setQunatity(234);
p1.setShop(shop1);

Products p2=new Products();
p2.setPid(111);
p2.setPname("FaceWash");
p2.setCost(440);
p2.setQunatity(234);
p2.setShop(shop1);

Products p3=new Products();
p3.setPid(113);
p3.setPname("Soap");
p3.setCost(44);
p3.setQunatity(234);
p3.setShop(shop1);
List<Products> pros=new ArrayList();
pros.add(p1);
pros.add(p2);
pros.add(p3);

shop1.setProducts(pros);
session.save(shop1);
session.save(p1);
session.save(p2);
session.save(p3);*/
tr.commit();
session.close();

	}

}
