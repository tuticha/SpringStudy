package com.bookstore.cha.homeLogic.homeService.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.cha.homeLogic.homeDao.HomeDao;
import com.bookstore.cha.homeLogic.homeService.HomeService;


@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	private HomeDao homeDao;
	
	public String goLogin(String id, String pw) {
		System.out.println("service id : " + id);
		System.out.println("service pw : " + pw);
		
		String memberId = homeDao.goLogin(id, pw);
		return memberId;
	}
	
	
}
