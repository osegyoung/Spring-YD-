package com.yedam.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;



public class MapTest {

	@Test
	public void test1() {
		List<Map<String,String>> list = new ArrayList<>();
		//제네릭 타입
		Map<String,String> map = new HashMap<>(); // key,value 값의 type을 처음부터 정해준다.<String, String>
		map.put("first_name", "scott");
		map.put("last_name", "king");
		
		list.add(map);
		map = new HashMap<>(); 
		map.put("first_name", "길동");
		map.put("last_name", "홍");
		list.add(map);
		
		//forEach문 사용 -> firstName만 출력
		list.forEach(System.out::println); // 더블콜론
//		list.forEach((emp -> System.out.println(emp.get("first_name"))));
//		list.forEach((emp -> System.out.println(emp.get("last_name"))));
	}
}
