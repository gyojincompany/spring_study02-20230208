package com.gyojincompany.home;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/free")
	public String free() {
		
		return "test";
	}
	
	@RequestMapping(value = "/board/write")
	public String write() {
		
		return "free/write";
	}
	
	@RequestMapping(value = "/board/content")
	public String content(Model model) {
		//model객체 : 데이터를 담아서 view(jsp)로 전달하는 객체
		String id = "tiger"; 
		String name = "홍길동";
		
		model.addAttribute("memberId", id);
		model.addAttribute("memberName", name);
		
		return "free/content";
	}
	
	
}
