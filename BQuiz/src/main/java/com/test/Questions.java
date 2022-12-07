package com.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;

public class Questions {
	
	/*private static int Student_id;
	private static String Student_name;*/
	/*static String Student_name;
	static int Student_id;*/
	int count=0;
	String grade;
	
	public static void getquest() {
		
		Scanner sc =new Scanner(System.in);
		 System.out.println("Please Enter your Id");
		 int Student_id =sc.nextInt();
		 System.out.println("Please Enter your Name");
		 String Student_name=sc.next();
		
		int count = 0;
		Session session = App.getsession();
		Query questions = session.createQuery("Select Questions from Quiz");
		Query answers = session.createQuery("Select Answers from Quiz");
		List qst = questions.list();
		List ans = answers.list();
		
		System.out.println(ans);
		
		HashMap<Object, Object> map= new HashMap();
		for(int i=0;i<qst.size();i++) {
			map.put(qst.get(i), ans.get(i));
		}
		
		Set<Object> set = map.keySet();
		Iterator<Object> itr = set.iterator();
		System.out.println();
		
		//Scanner sc =new Scanner(System.in);
		
		while(itr.hasNext()) {
			Object i = itr.next();
			System.out.println(i);
			
			System.out.println("Select your option");
			String a = sc.next();
			
			if(a.equals(map.get(i))) {
				
				count++;
			}
			System.out.println("");
		
		}
		
		String Student_grade;
		if(count>=8) {
			Student_grade="A";
		}else if (count>5 && count<8) {
			Student_grade="B";
		}else if (count ==5) {
			Student_grade="C";
		}else {
			Student_grade="Fail";
		}
		 int student_marks=count;
		
		 System.out.println("marks="+count);
		 System.out.println("Grade="+Student_grade);
		 System.out.println("Student_id="+Student_id);
		 System.out.println("Student_name="+Student_name);
		 Answers.addrecord(Student_id, Student_name, count, Student_grade);
		 
	}

}
