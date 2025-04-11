package com.ssafy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	// 작성한 해당 경로로 메서드 관계 없이 요청이 들어온다.
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	// 요청의 종류를 GET으로 설정한다.
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView homeHandle1() {
		// 요청을 처리하기 위해 응답에 필요한 객체를 생성한다.
		ModelAndView mav = new ModelAndView();
		
		// 데이터를 msg 변수에 담아서 응답으로 보낸다.
		mav.addObject("msg", "Welcome to Spring MVC(GET)");
		
		// 데이터를 보여줄 page를 설정한다.
		mav.setViewName("home");
		
		return mav;
	}
	
	// 요청의 종류를 POST로 설정한다.
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public ModelAndView homeHandle2() {
		// 요청을 처리하기 위해 필요한 객체를 생성한다.
		ModelAndView mav = new ModelAndView();
		
		// 데이터를 msg 변수에 담아서 응답으로 보낸다.
		// key, value 방식으로 데이터를 응답으로 보낸다.
		// msg, data
		mav.addObject("msg", "Welcome to Spring MVC(POST)");
		
		// 보여줄 데이터를 Forwarding하고, 해당 데이터를 보여줄 page를 설정한다.
		mav.setViewName("home");
		
		return mav;
	}
	
	

}
