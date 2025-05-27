package com.yedam.web;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/emp")
@Controller //@Component 컨트롤러화, 빈으로 등록
public class EmpController {

	@GetMapping("/empList")
	public String empList(Model model) {
		model.addAttribute("servertime",new Date());
		return "empList"; // forward
	}
	
	
	
}
