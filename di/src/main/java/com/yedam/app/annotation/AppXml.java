package com.yedam.app.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppXml {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("contextAnnotation.xml");
		TV tv = context.getBean("tv", TV.class);
		tv.powerOn();
		tv.volumeUp();
	}
}
