package com.ptlogie.service;

import java.util.List;

import com.ptlogie.domain.Userinfo;

public interface loginUserService {

	
	public List<Userinfo> findUserByUserName(String username);
}
