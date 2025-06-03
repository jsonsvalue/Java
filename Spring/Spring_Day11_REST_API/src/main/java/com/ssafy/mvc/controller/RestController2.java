package com.ssafy.mvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.mvc.model.dto.User;

@RestController
@RequestMapping("/rest2")
public class RestController2 {
	
	@GetMapping("/test1")
	public String test1() {
		return "hello";
	}
	
	@GetMapping("/test2")
	@ResponseBody
	public String test2() {
		return "Hi there";
	}
	
	@GetMapping("/test3")
	@ResponseBody
	public Map<String, String> test3() {
		Map<String, String> data = new HashMap<>();
		data.put("id", "ssafy");
		data.put("password", "1234");
		
		
		return data;
	}
	
	@GetMapping("/test4")
	@ResponseBody
	public User test4() {
		User user = new User("ssafy", "1234", "이재석");
		
		return user;
	}
	
	@GetMapping("/test5")
	@ResponseBody
	public List<User> test5() {
		List<User> list = new ArrayList<>();
		list.add(new User("ssafy1", "1234", "이재석"));
		list.add(new User("ssafy2", "1234", "이솔빈"));
		list.add(new User("ssafy3", "1234", "김도현"));
		list.add(new User("ssafy4", "1234", "김유정"));
		list.add(new User("ssafy5", "1234", "이재빈"));
		
		return list;
	}
	
}
