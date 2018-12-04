package com.ptlogie.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ptlogie.listener.SessionListener;

@Controller
@RequestMapping("/user")
public class UserController {

	private final Log logger = LogFactory.getLog(UserController.class);
	@RequestMapping("/ userList")
	   public String   userList(){
		   
		return "/museum/mgt-user";
	   }
	
	
	@RequestMapping("/ getData")
	   public void   getData(HttpServletRequest request){
		  
	   }
}
