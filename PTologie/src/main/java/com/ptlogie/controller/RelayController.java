package com.ptlogie.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ptlogie.domain.Page;
import com.ptlogie.domain.Relay;
import com.ptlogie.service.relayService;

@Controller
@RequestMapping("/relay")
public class RelayController {
	
	@Autowired
	private relayService relaySrv;
	@Autowired
	private Page page;
	
	@RequestMapping("/relayList")
	   public String  relayList(Model model){
		List<Relay> list =relaySrv.findAll();
		page.setTotalCounts(list.size());
		page.setCurrentPage(1);
		page.getTotalPages();
		List<Relay> dataList=relaySrv.findByPage(0,page.getPageSize());
		page.setDataList(dataList);
		model.addAttribute("page", page);
		return "/museum/mgt-equipment";
	   }
	//分页查询  传入当前页码
	@RequestMapping("/findByPage")
	@ResponseBody
	public Page findByPage(Model model,int pageNum){
		List<Relay> list =relaySrv.findAll();
		page.setTotalCounts(list.size());
		page.setCurrentPage(pageNum);
		page.getTotalPages();
	
		int startObj=(pageNum-1)*page.getPageSize();
		List<Relay> dataList=relaySrv.findByPage(startObj,page.getPageSize());
		page.setDataList(dataList);
		return page;
	}
//	@RequestMapping("/add")
//	public void add(Relay eq,HttpServletRequest request,HttpServletResponse response) throws IOException{
//		System.out.println("in");
//
//		response.sendRedirect(request.getContextPath()+"/equipment/equipmentList");
//	}
	
	//查询在线设备率  i
	//int 类型相除取整数部分 5/2  =2  
	@RequestMapping("/eqpOnline")
	@ResponseBody
	public double  eqpOnline() throws IOException{
		List<Relay> list =relaySrv.findAll();
		List<Relay> onlineList =relaySrv.findOnline();
		double p1=onlineList.size();
		double p2=list.size();
		double radio=(p1/p2)*100;
		return radio;
	}
	
}
