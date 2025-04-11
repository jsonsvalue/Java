package com.ssafy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ssafyController {
	
	@GetMapping("/greetings")
	public String getGreetings(Model model) {
		
		model.addAttribute("msg","Hi there Fellow developer");
		
		// View 이름이 String이다.
		return "greetings"; // WEB-INF/view/greetings.jsp 경로는 application properties에서 설정해준다.
	}
	
	
}
