package com.xpanxion.DAO;

import com.xpanxion.model.UserLogin;

public interface UserLoginDao {
	public void adduser(UserLogin userLogin);

	public UserLogin authenticate(UserLogin userLogin);

}
