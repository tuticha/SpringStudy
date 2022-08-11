package com.bookstore.cha.tuticha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bookstore.cha.tuticha.service.TestService;


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
	
	@RequestMapping(value = "/serviceTest3", method = RequestMethod.GET) //get방식으로 받겠다.
	public String serviceTest3(@RequestParam("plitche") int number, Model model) {
		System.out.println(number);
		return "home";
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
	
	
	@RequestMapping(value = "/homework1", method = RequestMethod.GET)
	public String homework1(@RequestParam("cha1") int number01,
							@RequestParam("cha2") int number02,
			Model model) {
		int result = testService.sumNumber2(number01, number02);
		
		System.out.println(number01);
		System.out.println(number02);
		System.out.println(result);
		return "";
	}
	
	@RequestMapping(value = "/homework2", method = RequestMethod.GET)
	public String homework2(@RequestParam("cha3") int number03, Model model) {
		int result = testService.sumNumber(number03);
		return "";
	}
	
	@RequestMapping(value = "/homework3", method = RequestMethod.GET)
	public String homework3(@RequestParam("cha1") int number01,
							@RequestParam("cha2") int number02,
							@RequestParam("cha3") int number03,
							Model model) {
		int result = testService.sumNumber3(number01, number02, number03);
		
		System.out.println(result);
		return "";
	}
	
	@RequestMapping(value = "/dbTest", method = RequestMethod.GET)
	public String dbTest1() {
		testService.dbTest1();
		
		return "";
	}
	
}
