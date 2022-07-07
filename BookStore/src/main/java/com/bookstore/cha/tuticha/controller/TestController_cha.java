/*package com.bookstore.cha.tuticha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookstore.cha.tuticha.service.TestService_cha;

@Controller
public class TestController_cha {
	
	@Autowired
	private TestService_cha testService_cha;
	
	@RequestMapping(value = "/test1")
	public String test1(Model model) {
		System.out.println("test1 성공");
		
		model.addAttribute("yahoo", "test1도착");
		model.addAttribute("yahoo1", 111);
		
		return "test1";
	}

}
*/