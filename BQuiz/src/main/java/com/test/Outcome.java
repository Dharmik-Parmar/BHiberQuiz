package com.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Outcome {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int Student_id;
	private String Student_name;
	private int Student_marks;
	private String Student_grade;
	
	
	public Outcome(int student_id, String student_name, int student_marks, String student_grade) {
		super();
		Student_id = student_id;
		Student_name = student_name;
		Student_marks = student_marks;
		Student_grade = student_grade;
	}
	public Outcome() {
		// TODO Auto-generated constructor stub
	}
	public int getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}
	public String getStudent_name() {
		return Student_name;
	}
	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}
	public int getStudent_marks() {
		return Student_marks;
	}
	public void setStudent_marks(int student_marks) {
		Student_marks = student_marks;
	}
	public String getStudent_grade() {
		return Student_grade;
	}
	public void setStudent_grade(String student_grade) {
		Student_grade = student_grade;
	}
	@Override
	public String toString() {
		return "Outcome [Student_id=" + Student_id + ", Student_name=" + Student_name + ", Student_marks="
				+ Student_marks + ", Student_grade=" + Student_grade + "]";
	}
	
	
	

}
