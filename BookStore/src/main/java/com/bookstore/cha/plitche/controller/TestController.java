package com.bookstore.cha.plitche.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	@RequestMapping(value = "/serviceTest2")
	public String serviceTest2(Model model) {
		int sumNumber = 10;
		int result = testService.sumNumber(sumNumber);
		
		model.addAttribute("getNumber", result);
		
		return "serviceTest";
	}
	
	
}
