package com.ptlogie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptlogie.domain.LoginUser;
import com.ptlogie.domain.Userinfo;
import com.ptlogie.mapper.LoginUserMapper;
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

}
