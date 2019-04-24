package com.mphasis.training.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.mphasis.training.entities.Player;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		
		Configuration con=new Configuration();
		Properties properties=new Properties();
		properties.put(Environment.DRIVER, "oracle.jdbc.driver.OracleDriver");
		properties.put(Environment.URL, "jdbc:oracle:thin:@localhost:1521:xe");
		properties.put(Environment.USER, "shwe");
		properties.put(Environment.PASS,"123");
		properties.put(Environment.DIALECT, "org.hiberante.dialect.OracleDialect");
		properties.put(Environment.HBM2DDL_AUTO, "update");
		properties.put(Environment.SHOW_SQL, "true");
		
		con.setProperties(properties);
		con.addAnnotatedClass(Player.class);
		
		sessionFactory=con.buildSessionFactory();
		
		return sessionFactory;
	}

}
