package com.ssafy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ssafy.mvc.model.dto.User;

@Controller
public class UserController {
	
	@GetMapping("/regist")
	public String registForm() {
		return "regist";
	}
	
//	@PostMapping("/regist")
//	public String regist(@RequestParam("id") String id, @RequestParam("pw") String pw ) {
//		// id, pw값을 DTO에 담는다.
//		User user = new User(id, pw);
//		
//		System.out.println(user);
//		
//		return "result";
//		
//	}
	
	
	@PostMapping("/regist")
	public String regist(@ModelAttribute User user) {
		System.out.println(user);
		
		return "result";
		
	}
	
	
	
}
