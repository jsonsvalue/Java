package com.ssafy.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssafy.mvc.model.dto.Board;
import com.ssafy.mvc.model.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
//	private final BoardService boardService;
//	
//	@Autowired
//	public BoardController(BoardService boardService) {
//		this.boardService=boardService;
//	}
	
	@GetMapping("/writeform")
	public String writeform() {
		return "board/writeform";
	}
	
	@PostMapping("/write")
	public String write(@ModelAttribute Board board) {
		boardService.writeBoard(board);
		
		return "redirect:list";
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		
		List<Board> list = boardService.getBoardList();
		
		model.addAttribute("boardList", list);
		
		return "/board/list";
	}
	
	// id 정보를 detail의 parameter로 전달하고, 필요한 기능을 수행한다.
	@GetMapping("/detail")
	public String detail(@RequestParam("id")int id, Model model ) {
		Board board = boardService.readBoard(id);
		model.addAttribute("board", board);
		
		return "/board/detail";
	}
	
	
	@PostMapping("/delete")
	public String delete(@RequestParam("id")int id, Model model) {
		boardService.removeBoard(id);
		
		// 현재 정보를 갖고 가지 않도록, redirect시켜준다.
		return "redirect:list";
		
	}
	
	@GetMapping("/updateform")
	public String updateForm(@RequestParam("id")int id, Model model) {
		// 해당 아이디의 게시글을 가져온다.
		model.addAttribute("board", boardService.getBoard(id));
		
		return "/board/updateform";
	}
	
	// 업데이트하고 게시글로 갈지, 아니면 전체 목록으로 갈지를 결정해야 한다.
	@PostMapping("/update")
	public String update(@ModelAttribute Board board) {
		boardService.modifyBoard(board);
		// 해당되는 url의 페이지로 이동한다.
		return "redirect:detail?id="+board.getId();
		
	}
	
	
}
