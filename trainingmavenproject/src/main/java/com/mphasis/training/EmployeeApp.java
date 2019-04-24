package com.mphasis.training;

import java.util.ArrayList;
import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.mphasis.training.entities.Department;
import com.mphasis.training.entities.Employee;
import com.mphasis.training.entities.Products;
import com.mphasis.training.entities.Shop;

public class EmployeeApp {

	public static void main(String[] args) {
		 Configuration con=new Configuration().configure()
					.addAnnotatedClass(Employee.class)
					.addAnnotatedClass(Department.class);
SessionFactory sessionFactory=con.buildSessionFactory();
Session session=sessionFactory.openSession();
Transaction tr=session.beginTransaction();
//retival with methods
Criteria cr = session.createCriteria(Employee.class);
cr.add(Restrictions.gt("salary", 30000.00));
List<Employee> results = cr.list();
results.forEach(e->System.out.println(e.getEname()));

//with HQL
System.out.println();
Query q=(Query) session.createQuery("from Employee where empid=20");
//single record
Employee e=(Employee) q.uniqueResult();//for only one record
System.out.println(e.getEname());

Query q1=(Query) session.createQuery("from Employee where salary >30000");
//multiple records
List<Employee> elist=q1.list();
elist.forEach(e1->System.out.println(e1.getEname()));
System.out.println();


//Sql
SQLQuery q2=(SQLQuery)session.createSQLQuery
("select * from mphemployee where salary>30000");
q2.addEntity(Employee.class);
List<Employee> ellist=q2.list();
ellist.forEach(e3->System.out.println(e3.getEname()));


tr.commit();
session.close();

/*Department d1=new Department();
d1.setDeptname("analyst");

Employee e1=new Employee();
e1.setEname("Nishanth");
e1.setSalary(31450);
e1.setHireDate("10-Mar-2019");
e1.setDepartment(d1);

Employee e2=new Employee();
e2.setEname("Varun");
e2.setSalary(30450);
e2.setHireDate("30-Mar-2019");
e2.setDepartment(d1);

Employee e3=new Employee();
e3.setEname("Naresh");
e3.setSalary(30450);
e3.setHireDate("10-Mar-2019");
e3.setDepartment(d1);

List<Employee> employees=new ArrayList<Employee>();
employees.add(e1);
employees.add(e2);
employees.add(e3);
d1.setEmployees(employees);
session.save(d1);session.save(e1);session.save(e2);session.save(e3);
*/

	}

}
