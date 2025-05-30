package com.yedam.sample.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

	@GetMapping("/getSample")
	public SampleVO getSample() {
		return new SampleVO(10, "길동", "홍");
	}

	@GetMapping("/getList")
	public List<SampleVO> getList() {
	return IntStream.range(1,10).mapToObj(i -> new SampleVO(i,i+"First",i+"Last")).collect(Collectors.toList());
	}

	@GetMapping("/getMap")
	public Map<String,SampleVO> getMap() {
		Map<String, SampleVO> map = new HashMap<>();
		map.put("first",new SampleVO(10,"순신","이"));
		return map;
	}
}
