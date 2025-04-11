package com.ssafy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ssafy.mvc.model.dto.User;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	//정석 코딩
	// 의존성 주입 -> 필드 / 설정자 / 생성자 주입
	
	// login 페이지로 넘어간다.
	@GetMapping("/login")
	public String loginForm() {
		return "/user/loginForm";// 절대 경로를 이용하는 것이 더 정확할 것이다.
	}
	
	// login에 대한 Post 처리를 해준다.
	// 해당 key를 가진 value를 model 객체로 넘겨준다.
//	@PostMapping("/login")
//	public String login(@RequestParam("id") String id, @RequestParam("pw") String pw) {
//			
//		
//	}
	
	// User 객체를 만들어서 정보를 넘긴다.
	// id, pw 입력할 때 pw는 암호화해서 넘기는 것이 좋다.
	// 로그인 정보는 -> Session에 저장해야, 로그인 상태가 풀리지 않는다.
	@PostMapping("/login")
	public String login(@ModelAttribute User user, HttpSession session) {
		System.out.println(user);
		
		// 필요한 데이터만 session에 저장한다.
		session.setAttribute("loginUser", user.getId());
		
		// 데이터를 Forwarding 방식으로 넘겨주기 때문에, redirect로 페이지를 넘어가야 한다.
		return "redirect:greetings";
	}
	
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		//로그아웃 하는 방법
		
		// 1.Session에서 해당 로그인 정보만 삭제한다.
		session.removeAttribute("loginUser");
		
		// 2.Session 자체를 초기화한다.
		session.invalidate();
		
		// logout 하면 다시 홈페이지로 돌아간다.
		return "redirect:/";
		
	}
	

	
	
}
