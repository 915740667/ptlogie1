package com.ptlogie.service;

import java.util.List;
import java.util.Map;

import com.ptlogie.domain.Equipment;
import com.ptlogie.domain.Userinfo;

public interface loginUserService {

	
	public List<Userinfo> findUserByUserName(String username);

	public List<Userinfo> findUserList(Map map1);

	public void changePWD(String loginName, String passWord);
	
	/**
	 * @Title: save   
	 * @Description: 新增用户信息  
	 * @param user
	 * @return Map<String,Object>
	 */
	public Map<String,Object> save(Userinfo user);

	/**
	 * @Title: deleteById   
	 * @Description: 根据用户id删除用户信息     
	 * @param userid
	 * @return Map<String,Object>
	 */
	public Map<String,Object> deleteById(Integer userid);

	/**
	 * @Title: update   
	 * @Description: 根据用户id更新用户信息    
	 * @param user
	 * @return
	 */
	public Map<String, Object> update(Userinfo user);
}
