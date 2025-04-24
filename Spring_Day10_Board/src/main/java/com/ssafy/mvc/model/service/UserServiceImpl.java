package com.ssafy.mvc.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.mvc.model.dao.UserDao;
import com.ssafy.mvc.model.dto.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	//전체 사용자 목록 불러오기
	@Override
	public List<User> getUserList() {
		
		return userDao.selectAll();
	}
	
	//사용자 등록하기
	@Override
	public void signup(User user) {
		userDao.insertUser(user);
	}
	
	//로그인 하기
	@Override
	public User login(String id, String password) {
		Map<String, String> info = new HashMap<>();
		info.put("id", id);	
		info.put("password", password);
		
		// 비밀번호를 확인할 때, SQL을 이용해서 DB에서 맞는 값을 가져올 수 있지만, 
		// 일단 ID로 객체를 갖고 와서 Service에서 비밀번호 일치 여부를 확인할 수 있다.
		User user = userDao.selectOne(info);	
		//System.out.println(user);
		
		return user;
	}
	
	
	
	
	
	
	
	
}
