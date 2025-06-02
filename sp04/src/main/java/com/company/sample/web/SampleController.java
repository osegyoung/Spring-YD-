package com.company.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.company.sample.mapper.TimeMapper;
import com.company.sample.service.SampleService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Controller
public class SampleController {

	private final SampleService sampleService;
	private final TimeMapper timeMapper;

	@GetMapping("/")
	public String main() {
		sampleService.sample("");
		timeMapper.getTime2();
		return "home";
	}
	
	@GetMapping({"/all","/member","/admin","/accessError", "/login"})
	public void all(HttpServletRequest request) {;
	System.out.println(request.getRequestURI());
	}
}
