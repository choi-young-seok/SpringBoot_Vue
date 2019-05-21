package kr.co.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class BoardController {

	
	@GetMapping(value = "/board/{board_no}")
	public String getBoardDetail(@PathVariable(name = "board_no", required = true) long board_no) {
		
		
		return "boardDetail";
	}
	
	@PostMapping(value = "/board")
	public String createBoard() {
		
		return "boardDetail";
	}
	
	@PutMapping(value = "/board/{board_no}")
	public String updateBoard() {
		
		return "boardDetail";
	}
	
	@DeleteMapping
	public String deleteBoard() {
	
		return "boardList";
	}
	
	@GetMapping(value = "/board/list")
	public String getBoardList() {
		return "boardList";
	}
	
}
