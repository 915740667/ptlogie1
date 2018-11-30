package com.ptlogie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptlogie.domain.LoginUser;
import com.ptlogie.mapper.LoginUserMapper;
@Service
public class LoginUserServiceImpl implements loginUserService {
	
	
		@Autowired
		LoginUserMapper userMapper;
	
	@Override
	public List<LoginUser> findUserByUserName(String username) {
		// TODO Auto-generated method stub
		List<LoginUser> user=	userMapper.findUserByUserName(username);
		return user;
	}

}
