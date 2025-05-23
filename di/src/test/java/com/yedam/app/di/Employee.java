package com.yedam.app.di;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 캡슐화(private)
// 생성자
@Setter
@Getter
@ToString
@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor
public class Employee {
	
	private final String fname; // 상수값 변경 불가(final)
	private String lname; 
	private final int salary;
	
	
}
