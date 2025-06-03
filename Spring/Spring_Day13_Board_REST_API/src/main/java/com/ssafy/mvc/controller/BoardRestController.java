package com.ssafy.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ssafy.mvc.model.dto.Board;
import com.ssafy.mvc.model.dto.SearchCondition;
import com.ssafy.mvc.model.service.BoardService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

//http://localhost:8080/swagger-ui/index.html
@RestController
@RequestMapping("/api")
@Tag(name="Board RESTful API", description = "게시판 CRUD기능 다 있음")
public class BoardRestController {
	
	@Autowired
	private BoardService boardService;
	
	// 게시글 전체 조회
//	@GetMapping("/board")
//	public ResponseEntity<List<Board>> getlist(){
//		List<Board> list = boardService.getBoardList();
//		
////		return new ResponseEntity<List<Board>>(list, HttpStatus.OK);
//		return ResponseEntity.ok(list);
//	}
	
	// 검색 키워드에 따른 결과값을 반환한다.
	@GetMapping("/board")
	@Operation(summary = "검색에 따른 게시글을 반환한다.", description="조건에 따른 검색을 하고 게시글을 반환한다.")
	public ResponseEntity<?> search(@ModelAttribute SearchCondition condition){
		System.out.println(condition);
		
		List<Board> list = boardService.search(condition);
		
		return new ResponseEntity<List<Board>>(list,HttpStatus.OK);
	}
	
	// 해당되는 id의 게시글 확인하기
	@GetMapping("/board/{id}")
	public ResponseEntity<Board> detail(@PathVariable("id") int id){
		Board board = boardService.readBoard(id);
		if(board != null) {
			return ResponseEntity.ok(board);
		}
		
		// url에 id를 입력해서, id가 null인 상황이다.
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		
	}
	
	// 게시글 등록(Form 데이터)
	// 해당되는 상세글로 넘어가기 위해서 id정보가 필요하다.
	// DB에서 id에 대해 generatedKeys를 이용해서 해당 id 정보를 이용한다.
	@PostMapping("/board")
	public ResponseEntity<Void> write(@ModelAttribute Board board){
		
		System.out.println(board);
		boardService.writeBoard(board);
		System.out.println(board);
		
		//board의 id를 가져왔으니, 그것을 Front로 넘기면 된다.
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	
	// 게시글 삭제
	@DeleteMapping("/board/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") int id){
		boolean isDeleted = boardService.removeBoard(id);
		
		if(isDeleted)
			return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제됐습니다.");
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("삭제에 실패했습니다.");
		
	}
	
	// 게시글 수정
	@PutMapping("/board/{id}")
	public ResponseEntity<Void> update(@PathVariable("id") int id, @RequestBody Board board){
		board.setId(id);
		boardService.modifyBoard(board);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
	
	// 파일 업로드
	// 파일과 게시판의 내용을 함께 Post요청에 담아서 보낸다.
	@PostMapping("/upload")
	public ResponseEntity<?> fileUpload(@RequestParam("file") MultipartFile file, @ModelAttribute Board board){
		// System.out.println(file.getOriginalFilename());
		// System.out.println(board);
		
		// 작업은 boardService에서 처리한다.
		// 게시글 정보 및 파일을 boardService에서 처리한다.
		boardService.writeBoard(board);
		boardService.fileUpload(file, board);
		
		return ResponseEntity.ok().build();
	}
	
	
}
