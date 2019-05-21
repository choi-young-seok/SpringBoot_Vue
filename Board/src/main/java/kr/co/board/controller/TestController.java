package kr.co.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class TestController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		log.info("controller index mapping TEST");
		return "index";
	}
}
