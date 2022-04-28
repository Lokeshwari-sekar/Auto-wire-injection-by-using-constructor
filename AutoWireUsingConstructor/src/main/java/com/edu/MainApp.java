package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		 
		ApplicationContext conob=new ClassPathXmlApplicationContext("spring.xml");
		OnlineClass onob=(OnlineClass) conob.getBean("ocob");
		onob.onlineClassFunction();

	}

}
