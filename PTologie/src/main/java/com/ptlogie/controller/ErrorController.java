package com.ptlogie.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.ptlogie.domain.Equipment;
import com.ptlogie.domain.Page;
import com.ptlogie.domain.Userinfo;
import com.ptlogie.service.errorService;

@Controller
@RequestMapping("/error")
public class ErrorController {
	
	@Autowired
	errorService errorService;
	
	@Autowired
	private Page page;
	
	@RequestMapping("/errorList")
	   public String  AlarmList(Model model){
	
		return "/museum/mgt-alarm";
	   }
	
	
	//分页查询  传入当前页码
		@RequestMapping("/init")
		@ResponseBody
		public Map init(Model model){
			Map dataMap = new HashMap<>();
			Map map = new HashMap<>();
			Map map1 = new HashMap<>();
		
			List<com.ptlogie.domain.Error> errorList1=errorService.findErrorList(map1);
			map.put("start", 0);
			map.put("pageSize", page.getPageSize());
			List<com.ptlogie.domain.Error> errorList=errorService.findErrorList(map);
			dataMap.put("dataList", errorList); 
			//获取每种设备页数
			page.setTotalCounts( errorList1.size());
			dataMap.put("page",page.getTotalPages()); 
			//每页个数
			dataMap.put("pageNum", page.getPageSize()); 
			return dataMap;
		}
		
	
		@ResponseBody
		@RequestMapping("/findErrorList")
		public Map equipmentList(int pageNum,String  condition) throws IOException{
			Map dataMap= new HashMap<>();
			Map map = new HashMap<>();
			//查询符合条件的总数据
			Map map1 = new HashMap<>();
			map1.put("condition", condition);
			List<com.ptlogie.domain.Error> errorList1=errorService.findErrorList(map1);
			//查询符合条件的分页数据
			map.put("start", (pageNum-1)*page.getPageSize());
			map.put("pageSize", page.getPageSize());
			map.put("condition", condition);
			List<com.ptlogie.domain.Error> errorList=errorService.findErrorList(map);
			
			//往map里放值
			page.setTotalCounts( errorList1.size());
			dataMap.put("page",page.getTotalPages()); 
			dataMap.put("pageNum", page.getPageSize()); 
			dataMap.put("dataList", errorList);
			return dataMap;
		}
		
		@RequestMapping("/searcnError")
		public void  searcnAlarm(HttpServletRequest request){
		String areaName=request.getParameter("areaName");
		}
	
	//首页柱状图
	@ResponseBody
	@RequestMapping("/errorStatistics")
	public String    searcnAlarm(){
	List <Map<String,Object>>list=	errorService.findErrorsBy7Day();
	String result = JSON.toJSONString(list);
	return result;
	}
	
	//首页饼图
	@ResponseBody
	@RequestMapping("/alarmProportion")
	public String    alarmProportion(){
	List <Map<String,Object>>list=	errorService.alarmProportion();
	String result = JSON.toJSONString(list);
	return result;
	}
	
}
