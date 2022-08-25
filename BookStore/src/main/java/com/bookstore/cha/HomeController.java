package com.bookstore.cha;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bookstore.cha.homeLogic.homeService.HomeService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@Autowired
	private HomeService homeService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate);
		
		return "home";
	}
	
	@RequestMapping(value = "/login")
	public String login() {
		System.out.println("로그인 페이지로 이동");
		return "/login/login";
	}
	
	@RequestMapping(value = "/goLogin")
	public String goLogin(@RequestParam String id, @RequestParam String pw,
						  Model model) {
		System.out.println("로그인 시도");
		System.out.println("controller id : " + id);
		System.out.println("controller pw : " + pw);		
		
		homeService.goLogin(id, pw);
		
		model.addAttribute("loginResult", "success");
		// session : 서버에 저장
		
		// cookie : 로컬 pc 브라우저에 저장
		return "home";
	}
}

