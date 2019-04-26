package com.mphasis.training.configuration;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import com.mphasis.training.entities.Car;

@Configuration
@ComponentScan(basePackages="com.mphasis.training")
public class AppConfig {

	@Bean
	public DriverManagerDataSource getDatSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("shwe");
		ds.setPassword("123");
		return ds;
	}
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean sessionFactory =
				new LocalSessionFactoryBean();
		sessionFactory.setDataSource(getDatSource());
		sessionFactory.setPackagesToScan("com.mphasis.training.entities");
		//sessionFactory.setAnnotatedClasses(Car.class);
		Properties properties=new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		sessionFactory.setHibernateProperties(properties);
		return sessionFactory;
	}
}
