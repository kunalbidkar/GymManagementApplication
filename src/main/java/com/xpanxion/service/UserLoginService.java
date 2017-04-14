package com.xpanxion.service;

import com.xpanxion.model.UserLogin;

public interface UserLoginService {

	public void addUser(UserLogin userLogin);
	public UserLogin authenticate(UserLogin userLogin);
}
