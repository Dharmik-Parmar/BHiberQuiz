package com.test;

import java.util.Scanner;

import org.hibernate.Session;

public class Main {
	
 public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Please Select from following");
	 System.out.println("1) To Proceed for Quiz");
	 System.out.println("2) To Proceed for Getting Indidividual Result");
	 System.out.println("3) To Proceed for Merit List ");
	 System.out.println("4) To Exit ");
	 
	 int i = sc.nextInt();
	 if(i==1) {
		 
		
		 Questions.getquest();
		 
		 
	 }else if(i==3) {
		 
		 Answers.getresult();
	 }else if (i==2) {
		 Answers.getIndividualResult();
	 }else if (i==4) {
		 
		 System.out.println("Exit");
	 }else {
		 System.out.println("Invalid Input");
	 }
	 

}

}
