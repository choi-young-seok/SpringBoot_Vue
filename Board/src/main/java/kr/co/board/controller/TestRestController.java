package kr.co.board.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestRestController {

	@RequestMapping(value = "/rest")
	public String restTest() {
		log.info("restContreoller Mapping Test");
		return "RestController Test";
	}
}
