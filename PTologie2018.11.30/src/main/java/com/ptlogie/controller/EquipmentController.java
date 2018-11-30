package com.ptlogie.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ptlogie.domain.Equipment;
import com.ptlogie.domain.Page;
import com.ptlogie.service.equipmentService;

@Controller
@RequestMapping("/equipment")
public class EquipmentController {
	
	@Autowired
	private equipmentService eqs;
	@Autowired
	private Page page;
	//分页查询  传入当前页码
	@RequestMapping("/equipmentList.do")
	   public String  equipmentList(Model model,int pageNum){
		List<Equipment> list =eqs.findAll();
		page.setTotalCounts(list.size());
		page.setCurrentPage(pageNum);
		page.getTotalPages();
	
		int startObj=(pageNum-1)*page.getPageSize();
		List<Equipment> dataList=eqs.findByPage(startObj,page.getPageSize());
		page.setDataList(dataList);
		

		model.addAttribute("page", page);

	
	
		return "/museum/mgt-equipment";
	   }
	
	
}
