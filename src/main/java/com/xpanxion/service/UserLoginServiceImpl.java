package com.xpanxion.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.xpanxion.DAO.UserLoginDao;
import com.xpanxion.model.UserLogin;

public class UserLoginServiceImpl implements UserLoginService {
	@Autowired
	UserLoginDao userLoginDao;
	
	public UserLoginDao getUserLoginDao() {
		return userLoginDao;
	}
	
	public void setUserLoginDao(UserLoginDao userLoginDao) {
		this.userLoginDao = userLoginDao;
	}
	public void addUser(UserLogin userLogin) {
		System.out.println("user service");this.userLoginDao.adduser(userLogin);
		
	}

	public UserLogin authenticate(UserLogin userLogin) {
		return this.userLoginDao.authenticate(userLogin);	}

}
