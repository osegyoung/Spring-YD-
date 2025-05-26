package com.yedam.web;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/spring/datasource-context.xml") //파일을 불러온다.
//@RequiredArgsConstructor // test에서는 빼준다.
public class DataSourceTest {
	
	@Setter(onMethod_ = {@Autowired}) // pom에 lombok을 넣어줘야함.
	//@Autowired// 필드 주입
	 DataSource dataSources; // Connection Pool
	
	@Test
	public void testMybatis() {
			Connection conn = null;
			try {
				conn = dataSources.getConnection();
				System.out.println(conn);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
	}
}
