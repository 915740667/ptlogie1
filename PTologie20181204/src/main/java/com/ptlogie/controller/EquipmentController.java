package com.ptlogie.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@RequestMapping("/equipmentList")
	   public String  equipmentList(Model model){
		List<Equipment> list =eqs.findAll();
		page.setTotalCounts(list.size());
		page.setCurrentPage(1);
		page.getTotalPages();
		List<Equipment> dataList=eqs.findByPage(0,page.getPageSize());
		page.setDataList(dataList);
		model.addAttribute("page", page);
		return "/museum/mgt-equipment";
	   }
	//分页查询  传入当前页码
	@RequestMapping("/findByPage")
	@ResponseBody
	public Page findByPage(Model model,int pageNum){
		List<Equipment> list =eqs.findAll();
		page.setTotalCounts(list.size());
		page.setCurrentPage(pageNum);
		page.getTotalPages();
	
		int startObj=(pageNum-1)*page.getPageSize();
		List<Equipment> dataList=eqs.findByPage(startObj,page.getPageSize());
		page.setDataList(dataList);
		return page;
	}
	@RequestMapping("/add")
	public void add(Equipment eq,HttpServletRequest request,HttpServletResponse response) throws IOException{
		System.out.println("in");

		response.sendRedirect(request.getContextPath()+"/equipment/equipmentList");
	}
	
}
