package com.ptlogie.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ptlogie.service.sensorService;

@Controller
@RequestMapping("/sensor")
public class SensorController {
	@Autowired
	private sensorService sensorServiceImpl;
	
	@ResponseBody
	@RequestMapping("/sensorCountByType")
	   public List  sensorCountByType(){
	
		List<Map <String,Object>> list=sensorServiceImpl.findByType();
		return  list;
	   }

}
