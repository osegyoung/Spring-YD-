package com.company.user.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.company.user.service.MemberVO;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/resources/spring/*-context.xml")
public class UserMapperTest {
	@Autowired MemberMapper memberMapper;
	
	@Test
	public void read() {
		MemberVO member = memberMapper.read("admin");
		System.out.println(member);
		assertEquals(member.getUserid(), "admin");
	}
}
