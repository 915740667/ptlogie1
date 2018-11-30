package com.ptlogie.service;

import java.util.List;

import com.ptlogie.domain.LoginUser;

public interface loginUserService {

	
	public List<LoginUser> findUserByUserName(String username);
}
