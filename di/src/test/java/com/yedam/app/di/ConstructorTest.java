package com.yedam.app.di;

import org.junit.Test;

public class ConstructorTest {

	@Test 
	public void 기본생성자() {
		Employee emp = new Employee("왕","여",8000);// 생성자
		//emp.setLname("Kim");
		
		System.out.println(emp);
	}
}
