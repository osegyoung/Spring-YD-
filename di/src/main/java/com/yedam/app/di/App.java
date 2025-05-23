package com.yedam.app.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfigure.class); // 
    	//ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");	//xml기반
    	// 성속과 다형성(같은 코드지만 참조하는 대상에 따라서 실행결과가 다르다.) => 자바를 사용하는 핵심 이유
        //TV tv = new LgTV(); //  인스턴스를 참조하는 변수 = 인스턴스, 부모 = 자식 
    	
        TV tv = (TV)context.getBean("tv"); // getBean 메소드를 이용해서 쓴다.
        tv.powerOn(); // 참조의 대상의 자식의 메소드를 부른다.
        tv.volumeUp();
    }
}
