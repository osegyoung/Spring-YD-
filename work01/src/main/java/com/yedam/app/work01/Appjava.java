package com.yedam.app.work01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Appjava 
{
    public static void main( String[] args )
    {
    	ApplicationContext  ctx = new AnnotationConfigApplicationContext(applicationConfigure.class);
		
		MyController app = ctx.getBean("myApplication", MyController.class);
		app.processMessage("Hi~ douzone 2기!!", "happy@kosa.or.kr");
		
		
//		  MyController app2 = ctx.getBean("myApplication", MyController.class);
//		  System.out.println("app == app2 : " +( app == app2));
//		 
//	
//		MyController twitter = ctx.getBean("myApplication2", MyController.class);
//		twitter.processMessage("Twitter", "https://www.facebook.com/doyeon.lee.58760");
//		
//		System.out.println("app == twitter : " + (app == twitter) );
		
   }
}
