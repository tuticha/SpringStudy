package com.bookstore.cha.plitche.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping(value = "/test1/test2")
	public String test(Model model) {
		System.out.println("test 성공");
		System.out.println("test1/test2 성공");
		
		
		model.addAttribute("result", "success");
		model.addAttribute("result1", "success1");
		model.addAttribute("test1", "test1/test2 페이지 도착");
				
		return "test2";
	}
	
	@RequestMapping(value = "/test1")
	public String test1(Model model) {
		System.out.println("test1 성공");
		
		model.addAttribute("yahoo", "test1 도착");
		model.addAttribute("yahoo1", 111);
		
		return "test1";
	}
	
}
