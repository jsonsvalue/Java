package com.ssafy.mvc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.mvc.model.dto.User;

@RestController
@RequestMapping("/rest5")
public class RestController5 {
	
	// form 형식으로 데이터가 넘어왔을 때, 데이터를 처리하는 방법이다.
	@PostMapping("/board1")
	public String test1(@ModelAttribute User user) {
		// 입력 받은 데이터를 이용해서, 서비스를 호출한다.
		return user.toString();
	}
	
	// JSON 형식으로 데이터가 넘어왔을 때, 데이터를 처리하는 방법이다.
	@PostMapping("/board2")
	public String test2(@RequestBody User user) {
		return user.toString();
	}
	
//	@PostMapping("/board3")
//	public ResponseEntity<T> test3(@RequestBody User user) {
//		return user.toString();
//	}
	
}
