package com.ptlogie.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptlogie.domain.Userinfo;
import com.ptlogie.mapper.UserinfoMapper;
@Service
public class LoginUserServiceImpl implements loginUserService {
	

	/**
	 * 日志
	 */
	private final Log logger = LogFactory.getLog(LoginUserServiceImpl.class);
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
	
	@Override
	public Map<String,Object> save(Userinfo user) {
		Map<String,Object> dataMap = new HashMap<>();
		try {
			if(userMapper.insert(user) > 0) {
				dataMap.put("rc", 200);
				dataMap.put("rm", "新增成功");
				return dataMap;
			}
		} catch (Exception e) {
			logger.error("新增用户的时候出错了！出错的用户信息为： " + user.toString());
			logger.error("异常信息为： " + e.getMessage());
		}
		dataMap.put("rc", 500);
		dataMap.put("rm", "新增失败");
		return dataMap;
	}

	@Override
	public Map<String,Object> deleteById(Integer userid) {
		Map<String,Object> dataMap = new HashMap<>();
		int del = 0;
		try {
			del = userMapper.deleteByPrimaryKey(userid);
		} catch (Exception e) {
			del = -1;
			logger.error("删除用户信息的时候出错了！出错的用户id为： " + userid);
			logger.error("异常信息为： " + e.getMessage());
		}
		if(del == -1) {
			dataMap.put("rc", 500);
			dataMap.put("rm", "删除失败");
		} else if(del == 0){
			logger.error("要删除的用户不存在！出错的用户id为： " + userid);
			dataMap.put("rc", 200);
			dataMap.put("rm", "删除成功");
		} else {
			dataMap.put("rc", 200);
			dataMap.put("rm", "删除成功");
		}
		return dataMap;
	}

	@Override
	public Map<String, Object> update(Userinfo user) {
		Map<String,Object> dataMap = new HashMap<>();
		int update = 0;
		try {
			update = userMapper.updateByPrimaryKey(user);
		} catch (Exception e) {
			update = -1;
			logger.error("修改用户信息的时候出错了！出错的用户为： " + user.toString());
			logger.error("异常信息为： " + e.getMessage());
		}
		if(update < 1) {
			logger.error("要修改的用户不存在！出错的用户为： " + user.toString());
			dataMap.put("rc", 500);
			dataMap.put("rm", "修改失败");
		} else {
			dataMap.put("rc", 200);
			dataMap.put("rm", "修改成功");
		}
		return dataMap;
	}

}
