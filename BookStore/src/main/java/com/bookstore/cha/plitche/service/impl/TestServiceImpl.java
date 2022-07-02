package com.bookstore.cha.plitche.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.cha.plitche.dao.TestDao;
import com.bookstore.cha.plitche.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDao testDao;
	
	public int getNumber() {
		return testDao.getNumber();
	}
}
