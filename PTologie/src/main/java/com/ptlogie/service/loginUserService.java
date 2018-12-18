package com.ptlogie.service;

import java.util.List;
import java.util.Map;

import com.ptlogie.domain.Equipment;
import com.ptlogie.domain.Userinfo;

public interface loginUserService {

	
	public List<Userinfo> findUserByUserName(String username);

	public List<Userinfo> findUserList(Map map1);

	public void changePWD(String loginName, String passWord);
}
