package com.ptlogie.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	
	@RequestMapping("/ userList.do")
	   public String   userList(){
		   
		return "/museum/mgt-user";
	   }
	
	
	@RequestMapping("/ getData.do")
	   public void   getData(HttpServletRequest request){
		  
	   }
}
