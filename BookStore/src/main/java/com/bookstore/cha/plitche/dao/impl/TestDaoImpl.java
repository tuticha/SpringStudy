package com.bookstore.cha.plitche.dao.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
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
	
	public void dbTest1() {
		// 정보를 가지고 올때 select
		// 1개만 가지고 올때 selectOne
		String result = sqlSession.selectOne("dbTest.getString");
		
		// 2개 이상 가지고 올때 selectList
		List<Integer> resultList = sqlSession.selectList("dbTest.getList");
		System.out.println(resultList);
		
		int number = 10;
		int noResult1 = sqlSession.selectOne("dbTest.sumNumbers", number);
		System.out.println(noResult1);
		
//		sqlSession.delete
//		sqlSession.insert
//		sqlSession.update
//		
//		우리 회원 100명 (주소가 전부 한국 ~~~~)
//		update( 모든 회원 주소를 '한국' => '대한민국')
//		
//		100명 모두 잘 update 되었다.
//		
//		result = 100;
		
	}
}
