package com.yedam.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.web.dao.TimeDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/main/resources/spring/datasourcDe-context.xml",
"file:src/main/resources/spring/mybatis-context.xml" })
public class TimeDAOTest {
	
	@Autowired TimeDAO timeDAO;
	
	@Test
	public void getTime() {
		System.out.println(timeDAO.getTime());
	}
}
