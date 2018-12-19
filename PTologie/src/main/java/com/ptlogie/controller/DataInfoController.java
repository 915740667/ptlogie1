package com.ptlogie.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ptlogie.domain.Datainfo;
import com.ptlogie.domain.Page;
import com.ptlogie.domain.Userinfo;
import com.ptlogie.service.dataInfoService;

@Controller
@RequestMapping("/dataInfo")
public class DataInfoController {
	@Autowired
	dataInfoService dataInfoService;
	@Autowired
	private Page page;
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
	
	//分页查询  传入当前页码
	@RequestMapping("/init")
	@ResponseBody
	public Map findByPage(Model model){
	Map dataMap = new HashMap<>();
	Map map = new HashMap<>();
	Map map1 = new HashMap<>();

	List<Map<String, Object>> dataList1=dataInfoService.findDataList(map1);
	map.put("start", 0);
	map.put("pageSize", page.getPageSize());
	List<Map<String, Object>> dataList=dataInfoService.findDataList(map);
	dataMap.put("dataList", dataList); 
	//获取每种设备页数
	page.setTotalCounts( dataList1.size());
	dataMap.put("page",page.getTotalPages()); 
	//每页个数
	dataMap.put("pageNum", page.getPageSize()); 
	return dataMap;
	}
	
	@ResponseBody
	@RequestMapping("/findDataList")
	public Map equipmentList(int pageNum,String  condition) throws IOException{
		Map dataMap= new HashMap<>();
		Map map = new HashMap<>();
		//查询符合条件的总数据
		Map map1 = new HashMap<>();
		map1.put("condition", condition);
		List<Map<String, Object>> condList=dataInfoService.findDataList(map1);
		//查询符合条件的分页数据
		map.put("start", (pageNum-1)*page.getPageSize());
		map.put("pageSize", page.getPageSize());
		map.put("condition", condition);
		List<Map<String, Object>> dataList=dataInfoService.findDataList(map);
		
		//往map里放值
		page.setTotalCounts( condList.size());
		dataMap.put("page",page.getTotalPages()); 
		dataMap.put("pageNum", page.getPageSize()); 
		dataMap.put("dataList", dataList);
		return dataMap;
	}
	
}
