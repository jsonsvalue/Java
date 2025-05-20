package com.ssafy.back.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.back.jwt.JwtUtil;
import com.ssafy.back.model.dto.User;
import com.ssafy.back.model.service.UserService;

@RestController
@RequestMapping("/api-user")
@CrossOrigin("*")
public class UserRestController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private JwtUtil jwtutil;
	
	@PostMapping("/login")
	public ResponseEntity<Map<String, Object>> login(@RequestBody User user){
		
		// System.out.println(user);
		
		User temp = userService.login(user.getId(), user.getPassword());
		
		System.out.println(temp);	
		
		Map<String, Object> result = new HashMap<>();
		HttpStatus status = null;
		
		if(temp != null) {
			status = HttpStatus.ACCEPTED;
			result.put("message", "로그인 성공");
			result.put("access-token", jwtutil.createToken(temp.getName()));
			
		}else {
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		
		return new ResponseEntity<Map<String, Object>>(result, status);
	}
	
}
