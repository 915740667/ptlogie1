package com.ptlogie.controller;

import java.io.IOException;
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
import org.springframework.web.bind.annotation.ResponseBody;

import com.ptlogie.constant.Constant;
import com.ptlogie.domain.Userinfo;
import com.ptlogie.service.loginUserService;
import com.ptlogie.util.MD5Utils;
@Controller
@RequestMapping("/loginUser")
public class UserLoginController {
	
	
	
	private final Log logger = LogFactory.getLog(UserLoginController.class);
	
	
	@Autowired
	loginUserService service;
	
	
	@RequestMapping("/toLogin")
	public String  toLogin(){
		return "/museum/login";
	}
	
	@ResponseBody
	@RequestMapping("/userLogin")
	public String  login( HttpSession session, HttpServletRequest request,Model model) throws ParseException, IOException{
	logger.debug("loging");
	String  userName =(String) request.getParameter("loginName");
	String  passWord =(String) request.getParameter("password");
	List<Userinfo>list=service.findUserByUserName(userName);
	if(list.size()>0&&list!=null){
		Userinfo user=list.get(0);
		String pwd=user.getPassword();
		if(user.getPassword().equals(MD5Utils.md5(passWord))){
			if(user.getUsertype()!=Constant.ADMIN){
			return "PERMISSIONDEND";
			}
			session.setAttribute("loginUser", user);
			return "OK";
		}
		return "ERROR";
	}
	return "ERROR";
	}
	
	
	@RequestMapping("/toMain")
	public String toMain(Model model) throws ParseException{
		return "/museum/home";
	}
	
	@ResponseBody
	@RequestMapping("/changePWD")
	public String changePWD(HttpSession session,String passWord,Model model) throws ParseException{
		Userinfo user=	(Userinfo) session.getAttribute("loginUser");
		String loginName=user.getLoginname();
		try {
			service.changePWD(loginName,MD5Utils.md5(passWord));
		} catch (Exception e) {
			// TODO: handle exception
			return "error";
		}
		return "ok";
	}
	
	 
	 
	 @RequestMapping("/logout")
	 public String logout(HttpSession session){
		 session.removeAttribute("loginUser");;
		 return "/museum/login";
	 }
}
