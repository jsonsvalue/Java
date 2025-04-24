package com.ssafy.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest4")
public class RestController4 {
	
	// http://localhost:8080/rest4/board/1
	// boardId, reviewId를 똑같은 위치에 넣으면, 요청을 보낼 때 구분하지 못한다.
	
//	@GetMapping("/board/{reviewId}")
//	public String test1(@PathVariable int reviewId) {
//		
//		// Board에서 id에 해당하는 게시글을 가져온다.
//		return reviewId + ":Board";
//		
//	}
	
	@GetMapping("/board/{id}")
	public String test2(@PathVariable("id") int boardId) {
		
		// Board에서 id에 해당하는 게시글을 가져온다.
		return boardId + ":Board";
		
	}
	
	
	
	
}
