package com.ssafy.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ssafy.mvc.model.dto.User;
import com.ssafy.mvc.model.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	//서비스 객체에 대한 의존성을 주입한다.
	@Autowired
	private UserService userService;
	
	//회원 가입 페이지로 이동한다.
	@GetMapping("/signup")
	public String signupForm() {
		
		
		return "/user/signupform";
	}
	
	// 회원 가입을 진행한다.
	@PostMapping("/signup")
	public String signup(@ModelAttribute User user) {
		userService.signup(user);
		
		return "redirect:login";
	}
	
	// 로그인 페이지로 이동한다.
	@GetMapping("/login")
	public String loginForm() {
		
		return "/user/loginform";
	}
	
	// 로그인을 진행한다.
	// Form에서 넘겨 받은 정보를 이용해서, 로그인을 한다.
	// 로그인을 하고 나서 session에 필요한 정보를 담는다.
	@PostMapping("/login")
	public String login(@ModelAttribute User user, HttpSession session) {
		// System.out.println(user + "넘겨받은 폼입니다");
		User loggedInUser = userService.login(user.getId(), user.getPassword());
		// System.out.println("로그인 한뒤 넘겨받은 객체: " + loggedInUser);
		
		//로그인 실패
		if(loggedInUser==null) {
			return "redirect:login";
		}
		// 로그인 성공
		// 세션에 loginUser라는 Key값에 User의 이름을 Value로 저장하고, list 화면으로 넘어간다.
		session.setAttribute("loginUser", loggedInUser.getName());
		
//		String sessionStoreName = (String)session.getAttribute("loginUser");
//		System.out.println("세션에 저장되었니? " + sessionStoreName);
		return "redirect:/list";
	}
	
	//로그아웃을 진행한다.
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:login"; 
	}
	
	//Admin 페이지로 간다.
	@GetMapping("/users")
	public String userList(Model model) {
		model.addAttribute("userList", userService.getUserList());
		
		return "/user/adminPage";
	}
	
	
}
