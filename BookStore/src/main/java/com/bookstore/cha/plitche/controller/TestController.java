package com.bookstore.cha.plitche.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bookstore.cha.plitche.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping(value = "/test1")
	public String test1(Model model) {
		System.out.println("test1 성공");
		
		model.addAttribute("yahoo", "test1 도착");
		model.addAttribute("yahoo1", 111);
		
		return "test1";
	}
	
	@RequestMapping(value = "/serviceTest")
	public String serviceTest(Model model) {
		int a = testService.getNumber();
		System.out.println(a);
		
		model.addAttribute("getNumber", a);
		
		return "serviceTest";
	}
	
	@RequestMapping(value = "/serviceTest2", method = RequestMethod.GET)
	public String serviceTest2(Model model) {
		int sumNumber = 10;
		int result = testService.sumNumber(sumNumber);
		
		model.addAttribute("getNumber", result);
		
		return "serviceTest";
	}
	
	@RequestMapping(value = "/serviceTest3", method = RequestMethod.GET)
	public String serviceTest3(@RequestParam("plitche") int number, Model model) {
		System.out.println(number);
		return "";
	}
	
	@RequestMapping(value = "/serviceTest4/{number}", method = RequestMethod.GET)
	public String serviceTest4(@PathVariable("number") int number2, Model model) {
		System.out.println(number2);
		return "home";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(@RequestParam String id, 
						@RequestParam String pw, 
						Model model) {
		
		if (id.equals("plitche") && pw.equals("1111")) {
			model.addAttribute("loginResult", "success");
		} else {
			model.addAttribute("loginResult", "fail");
		}
		
		return "loginResult";
	}
	
	@RequestMapping(value = "/login2/{id}/{pw}", method = RequestMethod.GET)
	public String login2(@PathVariable String id, 
						 @PathVariable String pw, 
						 Model model) {
		
		if (id.equals("plitche") && pw.equals("1111")) {
			model.addAttribute("loginResult", "success");
		} else {
			model.addAttribute("loginResult", "fail");
		}
		
		return "loginResult";
	}
	
	
	
	
	
	
	
}
