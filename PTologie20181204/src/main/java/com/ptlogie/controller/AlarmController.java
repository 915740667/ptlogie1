package com.ptlogie.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alarm")
public class AlarmController {
	
		@RequestMapping("/alarmList")
	   public String  AlarmList(){
		   
		return "/museum/mgt-alarm";
	   }
		
		
		@RequestMapping("/searcnAlarm")
		public void  searcnAlarm(HttpServletRequest request){
		String areaName=request.getParameter("areaName");
		System.out.println(areaName+"11111");
		}
}
