package com.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Quiz {
	@Id
	//@GeneratedValue(strategy= GenerationType.AUTO)
	
	private String Questions;
	private String Answers;
	
	public String getQuestions() {
		return Questions;
	}
	public void setQuestions(String questions) {
		Questions = questions;
	}
	public String getAnswers() {
		return Answers;
	}
	public void setAnswers(String answers) {
		Answers = answers;
	}
	@Override
	public String toString() {
		return "Quiz [Questions=" + Questions + ", Answers=" + Answers + "]";
	}
	
	

}
