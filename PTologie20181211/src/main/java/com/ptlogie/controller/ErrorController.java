package com.ptlogie.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ptlogie.domain.Page;
import com.ptlogie.domain.Scene;
import com.ptlogie.service.ErrorServiceImpl;

@Controller
@RequestMapping("/error")
public class ErrorController {
	
	@Autowired
	ErrorServiceImpl errorService;
	
	@Autowired
	private Page page;
	
	@RequestMapping("/errorList")
	   public String  AlarmList(Model model){
		List<com.ptlogie.domain.Error> list =errorService.findAll();
		page.setTotalCounts(list.size());
		page.setCurrentPage(1);
		page.getTotalPages();
		List<Map<String,Object>> dataList=errorService.findByPage(0,page.getPageSize());
		page.setDataList(dataList);
		model.addAttribute("page", page);
		return "/museum/mgt-alarm";
	   }
		
	
	//分页查询  传入当前页码
	@RequestMapping("/findByPage")
	@ResponseBody
	public Page findByPage(Model model,int pageNum){
		List<com.ptlogie.domain.Error> list =errorService.findAll();
		page.setTotalCounts(list.size());
		page.setCurrentPage(pageNum);
		page.getTotalPages();
		int startObj=(pageNum-1)*page.getPageSize();
		List<Map<String,Object>> dataList=errorService.findByPage(startObj,page.getPageSize());
		page.setDataList(dataList);
		return page;
	}
		
		@RequestMapping("/searcnError")
		public void  searcnAlarm(HttpServletRequest request){
		String areaName=request.getParameter("areaName");
		}
	
	
	@ResponseBody
	@RequestMapping("/errorStatistics")
	public String    searcnAlarm(){
	List <Map<String,Object>>list=	errorService.findErrorsBy7Day();
	String result = JSON.toJSONString(list);
	return result;
	}
	
	
	@ResponseBody
	@RequestMapping("/alarmProportion")
	public String    alarmProportion(){
	List <Map<String,Object>>list=	errorService.alarmProportion();
	String result = JSON.toJSONString(list);
	return result;
	}
	
}
