package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
   public static Session getsession() {
	   int count=0;
	   Configuration cfg= new Configuration();
	   cfg=cfg.configure("hibernate.cfg.xml");
	   SessionFactory factory=cfg.buildSessionFactory();
	   Session session=factory.openSession();
	   
	return session;
	   
   }
}
