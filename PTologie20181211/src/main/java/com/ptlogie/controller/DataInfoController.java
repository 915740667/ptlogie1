package com.ptlogie.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ptlogie.service.DataInfoServiceImpl;

@Controller
@RequestMapping("/dataInfo")
public class DataInfoController {
	@Autowired
	DataInfoServiceImpl dataInfoService;
	
	//数据信息列表
	@ResponseBody
	@RequestMapping("/dataInfoList")
	//根据场景id查找相应的设备信息 警告信息 日志信息
	public List<Map<String,Object>> areaData(){
		List<Map<String,Object>> list=	dataInfoService.getDataToDay();
		return list;
	}
	
	
	//当天数据量
	@ResponseBody
	@RequestMapping("/dataCountByDay")
	public int dataCountByDay(){
		int count=	dataInfoService.getCountToDay();
		return count;
		
	}
	
	//当月数据量
	@ResponseBody
	@RequestMapping("/dataCountByMonth")
	public int dataCountByMonth(){
		int count=	dataInfoService.getCountToMonth();
		return count;
		
	}
}
