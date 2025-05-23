package com.scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yedam.app.di.ContextConfigure;

public class App {
	public static void main(String[] args) {
		//ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("contextAnnotation.xml");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfigure.class);
		BoardController controller = ctx.getBean(BoardController.class);
		controller.insert();
	}
}
