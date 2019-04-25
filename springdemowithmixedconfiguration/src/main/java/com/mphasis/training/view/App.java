package com.mphasis.training.view;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.mphasis.training.pojos.Address;
import com.mphasis.training.pojos.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        
    	
    	//BeanFactory context=new XmlBeanFactory(new ClassPathResource("beans.xml"));
    	Address a1=(Address)context.getBean("address");
    	a1.setDorno("12");
    	a1.setStreet("RR Nagar");
    	a1.setCity("BAn");
    	a1.setState("KA");
    	a1.setPincode("345789");
    	Employee e1=(Employee)context.getBean("employee");
    	e1.setEmpid(123);
    	e1.setEname("Mahesh");
    	e1.setSalary(5467890);
    	e1.setHiredate("12-1-12");
    	e1.setAddress(a1);
    
    	System.out.println(e1.getEname());
    	
    	Employee e2=(Employee)context.getBean("employee");
    	
    	System.out.println(e2.getEname());
    }
}
