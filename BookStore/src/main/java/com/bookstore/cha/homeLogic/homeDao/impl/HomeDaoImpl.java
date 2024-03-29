package com.bookstore.cha.homeLogic.homeDao.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.cha.homeLogic.homeDao.HomeDao;

@Service
public class HomeDaoImpl implements HomeDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public String goLogin(String id, String pw) {
		System.out.println("dao id : " + id);
		System.out.println("dao pw : " + pw);
		
		Map<String, Object> map = new HashMap<>();
		map.put("id", id);
		map.put("pw", pw);
		
		String memberId = sqlSession.selectOne("home.goLogin", map);
		System.out.println(memberId);
		
		return memberId;
	}
	
}

