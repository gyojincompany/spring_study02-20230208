package com.gyojincompany.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/board")
public class BoardController {
	
	@RequestMapping(value = "/list")
	public String list() {
		System.out.println("list요청 체크!!");
		
		return "list";
	}
	
	@RequestMapping(value = "/reply")
	public String reply() {
		return "reply";
	}
	
	@RequestMapping(value = "/file")
	public String file() {
		return "file";
	}

}
