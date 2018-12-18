package com.ptlogie.controller;

import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ptlogie.constant.Constant;
import com.ptlogie.domain.Userinfo;
import com.ptlogie.service.LoginUserServiceImpl;
import com.ptlogie.util.MD5Utils;
@Controller
@RequestMapping("/loginUser")
public class UserLoginController {
	
	
	
	private final Log logger = LogFactory.getLog(UserLoginController.class);
	
	
	@Autowired
	LoginUserServiceImpl service;
	
	
	@RequestMapping("/toLogin")
	public String  toLogin(){
	
		return "/museum/login";
	}
	
	
	@RequestMapping("/userLogin")
	public String  login( HttpSession session, HttpServletRequest request,Model model) throws ParseException{
	logger.debug("loging");
	String  userName =(String) request.getParameter("login_id");
	String  passWord =(String) request.getParameter("password");
	List<Userinfo>list=service.findUserByUserName(userName);
	if(list.size()>0&&list!=null){
		Userinfo user=list.get(0);
		String pwd=user.getPassword();
		if(user.getIsadmin()!=Constant.ADMIN){
			return "/museum/login";
		}
		if(user.getPassword().equals(MD5Utils.md5(passWord))){
			session.setAttribute("loginUser", user);
			return "/museum/home";
		}
	}
	return "/museum/login";
	}
	
	
	@RequestMapping("/toMain")
	public String toMain(Model model) throws ParseException{
		return "/museum/home";
	}
	
	
	 
	 
	 @RequestMapping("/logout")
	 public String logout(HttpSession session){
		 session.removeAttribute("loginUser");;
		 return "/museum/login";
	 }
}
