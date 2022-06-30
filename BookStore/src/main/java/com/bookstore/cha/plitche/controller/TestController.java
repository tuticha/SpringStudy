package com.bookstore.cha.plitche.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping(value = "/test.plitche")
	public String test(Model model) {
		System.out.println("test 성공");
		
		model.addAttribute("result", "success");
		model.addAttribute("result1", "success1");
				
		return "test";
	}
	
}
