package com.test;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Answers {
	
	public static void addrecord(int student_id, String student_name, int student_marks, String student_grade) {
		
		Session session = App.getsession();
		Transaction trans = session.beginTransaction();
		
		Outcome o = new Outcome();
	
		o.setStudent_id(student_id);
		o.setStudent_name(student_name);
		o.setStudent_marks(student_marks);

		o.setStudent_grade(student_grade);
		session.save(o);
		System.out.println("Record added");
	
	//session.save(o);
	trans.commit();
	}
	
	public static void getresult() {
		
		Session session = App.getsession();
		Transaction trans = session.beginTransaction();
		Query query = session.createQuery("from Outcome");
		List <Object> list = query.list();
		for(Object o : list) {
			
			System.out.println(o);
			
		}
		trans.commit();
		
	}
	
	public static void getIndividualResult() {
		
		Session session = App.getsession();
		Transaction trans = session.beginTransaction();
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter student_id");
	    int id=sc.nextInt();
		//Query query = session.createQuery("from Outcome where id=?");
		Object obj = session.get(Outcome.class, id);
		//obj
		System.out.println(obj);
		
		//session.save(obj);
		trans.commit();
	}


}
