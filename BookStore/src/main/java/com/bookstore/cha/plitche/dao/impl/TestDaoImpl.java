package com.bookstore.cha.plitche.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.cha.plitche.dao.TestDao;

@Service
public class TestDaoImpl implements TestDao {
	
	@Autowired
	SqlSession sqlSession;
	
	public int getNumber() {
		int a = sqlSession.selectOne("dbTest.getNumber");
		return a;
	}
}
