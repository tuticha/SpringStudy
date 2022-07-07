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
	
	public int sumNumber(int sumNumber) {
		int result = sumNumber + testDao.getNumber(); 
		return result;
	}
	
	public int sumNumber2(int sumNumber1, int sumNumber2) {
		int result = sumNumber1 + sumNumber2 + testDao.getNumber();
		return result;
	}
	
	public int sumNumber3(int sumNumber1, int sumNumber2, int sumNumber3) {
		int result = sumNumber1 +sumNumber2 + sumNumber3 + testDao.getNumber();
		return result;
	}
	
	public void dbTest1() {
		testDao.dbTest1();
	}
}
