package com.ptlogie.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ptlogie.domain.Page;
import com.ptlogie.domain.Userinfo;
import com.ptlogie.service.loginUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	private final Log logger = LogFactory.getLog(UserController.class);
	
	@Autowired
	loginUserService service;
	
	@Autowired
	private Page page;
	
	
	//跳转页面列表
	@RequestMapping("/userList")
	   public String   userList(){
		return "/museum/mgt-user";
	   }
	
	
	//分页查询  传入当前页码
		@RequestMapping("/init")
		@ResponseBody
		public Map findByPage(Model model){
		Map dataMap = new HashMap<>();
		Map map = new HashMap<>();
		Map map1 = new HashMap<>();
	
		List<Userinfo> userList1=service.findUserList(map1);
		map.put("start", 0);
		map.put("pageSize", page.getPageSize());
		List<Userinfo> userList=service.findUserList(map);
		dataMap.put("dataList", userList); 
		//获取每种设备页数
		page.setTotalCounts( userList1.size());
		dataMap.put("page",page.getTotalPages()); 
		//每页个数
		dataMap.put("pageNum", page.getPageSize()); 
		return dataMap;
		}
		
		@ResponseBody
		@RequestMapping("/finduserList")
		public Map equipmentList(int pageNum,String  condition) throws IOException{
			Map dataMap= new HashMap<>();
			Map map = new HashMap<>();
			//查询符合条件的总数据
			Map map1 = new HashMap<>();
			map1.put("condition", condition);
			List<Userinfo> condList=service.findUserList(map1);
			//查询符合条件的分页数据
			map.put("start", (pageNum-1)*page.getPageSize());
			map.put("pageSize", page.getPageSize());
			map.put("condition", condition);
			List<Userinfo> dataList=service.findUserList(map);
			
			//往map里放值
			page.setTotalCounts( condList.size());
			dataMap.put("page",page.getTotalPages()); 
			dataMap.put("pageNum", page.getPageSize()); 
			dataMap.put("dataList", dataList);
			return dataMap;
		}
	
	
}
