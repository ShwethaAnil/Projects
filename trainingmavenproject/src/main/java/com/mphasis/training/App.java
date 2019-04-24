package com.mphasis.training;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mphasis.training.entities.Laptop;
import com.mphasis.training.entities.Student;
import com.mphasis.training.entities.StudentName;

public class App 
{
    public static void main( String[] args )
    {
    	/*StudentName stname=new StudentName();
    	stname.setFirstName("Megha");
    	stname.setMiddleName("Katta");
    	stname.setLastName("S");
    	Student st=new Student();
    	st.setSt_id(16);
    	st.setSt_name(stname);
    	st.setMarks(36);*/
    	
   /* Configuration con=new Configuration().configure()
    					.addAnnotatedClass(Student.class);
    SessionFactory sessionFactory=con.buildSessionFactory();
    Session session=sessionFactory.openSession();
    Transaction tr=session.beginTransaction();*/
   /* Student st=new Student();
    st=(Student) session.get(Student.class, 12);//retrival
    session.delete(st);//delete
*/   // session.save(st);//insert
   
   // System.out.println(st.getSt_name());
 /*List<Student> students=session.createCriteria(Student.class).list();
    for(Student st:students) {
    	System.out.println(st.getSt_id()+" "+st.getSt_name()+" "+st.getMarks());
    }*/
    
   /* Student st=new Student();
    st=(Student)session.get(Student.class, 15);
    st.setMarks(86);
    StudentName stname=st.getSt_name();
    stname.setLastName("S");
    session.update(st);//update
*/    
    
    
   /* Student st=(Student)session.load(Student.class, 988);
    System.out.println(st);*/
    
    	 Configuration con=new Configuration().configure()
					.addAnnotatedClass(Student.class)
					.addAnnotatedClass(Laptop.class);
SessionFactory sessionFactory=con.buildSessionFactory();
Session session=sessionFactory.openSession();
Transaction tr=session.beginTransaction();
	//creating laptop objects
	Laptop lp=new Laptop();
	lp.setModelno(123);
	lp.setCompany("hp");
	Laptop lp1=new Laptop();
	lp1.setModelno(124);
	lp1.setCompany("lenovo");
	//add objects to list
	List<Laptop> laptops=new ArrayList<Laptop>();
	laptops.add(lp);
	laptops.add(lp1);
	
	// Student name and create student objects
		StudentName stname=new StudentName();
		stname.setFirstName("ss");
		stname.setMiddleName("yy");
		stname.setLastName("gfgh");

		Student st=new Student();
		st.setSt_id(123);
		st.setSt_name(stname);
		st.setMarks(90);
		st.setLaptops(laptops);

		StudentName stname1=new StudentName();
		stname1.setFirstName("sdds");
		stname1.setMiddleName("yy");
		stname1.setLastName("gfgh");

		Student st2=new Student();
		st2.setSt_id(125);
		st2.setSt_name(stname1);
		st2.setMarks(90);
		st2.setLaptops(laptops);

    //add the students to list
	List<Student> sts=new ArrayList();
		sts.add(st);
		sts.add(st2);
	//set student list to laptop object
		lp.setStudent(sts);
		lp1.setStudent(sts);
		
		//save to db
		session.save(lp);
		session.save(lp1);
		session.save(st);
		session.save(st2);
    
    tr.commit();
    session.close();
   
    	
    	
    	
    	
    	
    	
       
    }
}
