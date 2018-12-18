package com.ptlogie.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ptlogie.domain.Equipment;
import com.ptlogie.domain.Page;
import com.ptlogie.domain.Scene;
import com.ptlogie.service.SubareaServiceImpl;

@Controller
@RequestMapping("/subarea")
public class SubareaController {
	
	@Autowired
	SubareaServiceImpl subService;
	@Autowired
	private Page page;
	//区域列表页面
	@RequestMapping("/subareaList")
	   public String  subareaList(Model model){
		List<Scene> list =subService.findAll();
		page.setTotalCounts(list.size());
		page.setCurrentPage(1);
		page.getTotalPages();
		List<Map<String,Object>> dataList=subService.findByPage(0,page.getPageSize());
		page.setDataList(dataList);
		model.addAttribute("page", page);
		return "/museum/mgt-area";
	   }
	
	@RequestMapping("/areaInfo")
	//根据场景id查找相应的设备信息 警告信息 日志信息
	public String  areaInfo(Model model,String id){
	
		return "/museum/info-area";
	}
	
	@ResponseBody
	@RequestMapping("/areaData")
	//根据场景id查找相应的设备信息 警告信息 日志信息
	public List<Map<String,Object>> areaData(){
		List<Map<String,Object>> list=	subService.areaData();
		return list;
	}
	
	
	//分页查询  传入当前页码
	@RequestMapping("/findByPage")
	@ResponseBody
	public Page findByPage(Model model,int pageNum){
		List<Scene> list =subService.findAll();
		page.setTotalCounts(list.size());
		page.setCurrentPage(pageNum);
		page.getTotalPages();
	
		int startObj=(pageNum-1)*page.getPageSize();
		List<Map<String,Object>> dataList=subService.findByPage(startObj,page.getPageSize());
		page.setDataList(dataList);
		return page;
	}
	
}
