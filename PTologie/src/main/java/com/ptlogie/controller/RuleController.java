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

import com.ptlogie.domain.Page;
import com.ptlogie.domain.Rule;
import com.ptlogie.service.ruleService;

@Controller
@RequestMapping("/rule")
public class RuleController {

	@Autowired
	ruleService rService;
	
	@Autowired
	private Page page;
	
	
	//分页查询  传入当前页码
		@RequestMapping("/init")
		@ResponseBody
		public Map init(Model model){
			Map dataMap = new HashMap<>();
			Map map = new HashMap<>();
			Map map1 = new HashMap<>();
		
			List<Rule> ruleList1=rService.findRuleList(map1);
			map.put("start", 0);
			map.put("pageSize", page.getPageSize());
			List<Rule> ruleList=rService.findRuleList(map);
			dataMap.put("dataList", ruleList); 
			//获取每种设备页数
			page.setTotalCounts( ruleList1.size());
			dataMap.put("page",page.getTotalPages()); 
			//每页个数
			dataMap.put("pageNum", page.getPageSize()); 
			return dataMap;
		}
		
	
		@ResponseBody
		@RequestMapping("/findRuleList")
		public Map equipmentList(int pageNum,String  condition) throws IOException{
			Map dataMap= new HashMap<>();
			Map map = new HashMap<>();
			//查询符合条件的总数据
			Map map1 = new HashMap<>();
			map1.put("condition", condition);
			List<Rule> ruleList1=rService.findRuleList(map1);
			//查询符合条件的分页数据
			map.put("start", (pageNum-1)*page.getPageSize());
			map.put("pageSize", page.getPageSize());
			map.put("condition", condition);
			List<Rule> ruleList=rService.findRuleList(map);
			
			//往map里放值
			page.setTotalCounts( ruleList1.size());
			dataMap.put("page",page.getTotalPages()); 
			dataMap.put("pageNum", page.getPageSize()); 
			dataMap.put("dataList", ruleList);
			return dataMap;
		}
		
		@RequestMapping("/searcnError")
		public void  searcnAlarm(HttpServletRequest request){
		String areaName=request.getParameter("areaName");
		}
}
