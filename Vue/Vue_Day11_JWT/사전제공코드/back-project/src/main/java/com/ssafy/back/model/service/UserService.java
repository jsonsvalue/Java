package com.ssafy.back.model.service;

import com.ssafy.back.model.dto.User;

public interface UserService {
	
	User login(String id, String password);
	

}

