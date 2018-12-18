package com.ptlogie.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptlogie.domain.Equipment;
import com.ptlogie.domain.Userinfo;
import com.ptlogie.mapper.UserinfoMapper;
@Service
public class LoginUserServiceImpl implements loginUserService {
	
	
		@Autowired
		UserinfoMapper userMapper;
	
	@Override
	public List<Userinfo> findUserByUserName(String username) {
		// TODO Auto-generated method stub
		List<Userinfo> user=	userMapper.findUserByUserName(username);
		return user;
	}

	@Override
	public List<Userinfo> findUserList(Map map1) {
		// TODO Auto-generated method stub
		return userMapper.findUserList(map1);
	}

	@Override
	public void changePWD(String loginName, String passWord) {
		// TODO Auto-generated method stub
		userMapper.changePWD(loginName,passWord);
	}

}
