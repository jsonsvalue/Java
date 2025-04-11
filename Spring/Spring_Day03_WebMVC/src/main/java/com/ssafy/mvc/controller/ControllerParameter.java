package com.ssafy.mvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class ControllerParameter {

	
	@GetMapping("test1")
	public String test1() {
		// String을 반환한다는 것은, Data를 View까지 반환할 일이 없을 때 유용하다.
		return "test1";	// test1.jsp파일을 보여준다.
	}
	
	// Data도 응답으로 같이 보내고 싶다면, ModelAndView 자료형으로 보낸다.
	@GetMapping("test2-1")
	public String test2_1(Model model) {
		// String을 반환한다는 것은, Data를 View까지 반환할 일이 없을 때 유용하다.
		// Model 객체를 생성해서 응답으로 데이터를 보낸다.
		model.addAttribute("msg", "ModelData");		
		
		return "test2";	// test2.jsp파일을 보여준다.
	}
	
	// Data도 응답으로 같이 보내고 싶다면, ModelAndView 자료형으로 보낸다.
	@GetMapping("test2-2")
	public String test2_2(Map<String, Object> model) {
		// String을 반환한다는 것은, Data를 View까지 반환할 일이 없을 때 유용하다.
		// Model 객체를 생성해서 응답으로 데이터를 보낸다.
		model.put("msg", "MapData");		
		
		return "test2";	// test2.jsp파일을 보여준다.
	}
	
	// 요청의 Parameter 값을 가져와서 응답으로 보낸다.
	@GetMapping("test3")
	public String test3(Model model, HttpServletRequest request, HttpSession session) {
		// Request에서 받아온 id를 변수로 받는다.
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		// model로 request에서 받아온 데이터를 넣어둔다.
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		
		return "test3";
	}
	
	
	@GetMapping("test3-1")
	public String test3_1(Model model, @RequestParam("id")String id, @RequestParam("pw")String pw) {
		// model로 request에서 받아온 데이터를 넣어둔다.
		// id(parameter) = id(value) 
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "test3";
	}
	
}
