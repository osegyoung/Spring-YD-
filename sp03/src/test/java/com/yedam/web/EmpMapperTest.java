package com.yedam.web;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.web.mapper.EmpMapper;
import com.yedam.web.model.Employees;
import com.yedam.web.model.SearchVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/main/resources/spring/datasource-context.xml",
		"file:src/main/resources/spring/mybatis-context.xml" }) // test할때는 두줄 넣고 시작(무조건)
public class EmpMapperTest {
	@Autowired EmpMapper empMapper;
	
	@Test
	public void 전체조회() {
		SearchVO searchVO = new SearchVO();
		//searchVO.setDepartmentId("30");
		//searchVO.setSalary("2600");
		searchVO.setIds(Arrays.asList(100,101,102));
		empMapper.findAll(searchVO).forEach(emp->
		System.out.println(emp.getEmployeeId() + ":" + emp.getFirstName()+":"+emp.getDepartmentId()));
	}
	
	//@Test 
	public void findAlltoMap() {
	empMapper.findAlltoMap().forEach(emp -> System.out.println(emp.get("first_name"))); // 대문자인 이유 : 
	}
	
	//@Test
	public void getCount() {
	 List<Employees> result = empMapper.getCount();
	 result.forEach(emp -> System.out.println(emp.getCnt())); // 변수 -> 		
	}
	
	//@Test 
	public void insert() {
		Employees employee = Employees.builder()
				.employeeId("301")
				.lastName("박")
				.email("c@c.c")
				.jobId("IT_PROG")
				.hireDate("2020/01/01")
				.build();
		int result = empMapper.insert(employee);
		System.out.println(result);
	}
	
	//@Test
	public void update() {
		Employees employee = new Employees();
		employee.setEmployeeId("300");
		employee.setFirstName("길동");
		int result = empMapper.updateFirstName(employee);
		System.out.println(result);
	}
	
	//@Test 
	public void delete() {
		int result = empMapper.delete(300);
		System.out.println(result);
	}
}
