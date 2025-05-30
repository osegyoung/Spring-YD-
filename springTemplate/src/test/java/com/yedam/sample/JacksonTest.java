package com.yedam.sample;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yedam.sample.web.SampleVO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2

public class JacksonTest {
	@Test
	public void toStr() throws JsonProcessingException {
		SampleVO sample = new SampleVO(10, "랑이", "범");

		ObjectMapper om = new ObjectMapper();
		String str = om.writeValueAsString(sample);
		log.info(str);

		String param = "{\"mno\":10,\"firstName\":\"랑이\",\"lastName\":\"범\"}";
		SampleVO result = om.readValue(param, SampleVO.class);
		log.info(result.getFirstName());

	}
}
