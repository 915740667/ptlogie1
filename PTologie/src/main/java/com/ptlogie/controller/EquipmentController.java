package com.ptlogie.controller;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ptlogie.domain.Equipment;
import com.ptlogie.domain.Page;
import com.ptlogie.domain.Scene;
import com.ptlogie.service.equipmentService;
import com.ptlogie.service.subareaService;

@Controller
@RequestMapping("/equipment")
public class EquipmentController {
	
	@Autowired
	private equipmentService eqs;
	
	@Autowired
	private subareaService subService;
	
	
	@Qualifier("page")
	@Autowired
	private Page page;

	
	@RequestMapping("/equipmentList")
	   public String  equipmentList(Model model,HttpServletRequest request){
		List <Scene> sceneList=subService.findAll();
		request.setAttribute("sceneList", sceneList);
		return "/museum/mgt-equipment";
	   }

	
	//分页查询  传入当前页码
	@RequestMapping("/init")
	@ResponseBody
	public Map init(Model model){
	Map dataMap = new HashMap<>();
	Map map = new HashMap<>();
	Map map1 = new HashMap<>();
	map1.put("type", "1,4,5");
	List<Equipment> deviceList1=eqs.findDeviceList(map1);
	map1.put("type", "2");
	List<Equipment> relayList1=eqs.findDeviceList(map1);
	map1.put("type", "3");
	List<Equipment> gateList1=eqs.findDeviceList(map1);

	//获取每种设备页数
	page.setTotalCounts( deviceList1.size());
	dataMap.put("page1",page.getTotalPages()); 
	page.setTotalCounts( relayList1.size());
	dataMap.put("page2", page.getTotalPages()); 
	page.setTotalCounts( gateList1.size());
	dataMap.put("page3", page.getTotalPages()); 
	//每页个数
	dataMap.put("pageNum", page.getPageSize()); 
	return dataMap;
	}
	
	
	
	@ResponseBody
	@RequestMapping("/findequipmentList")
	public Map equipmentList(int pageNum,String equipmentType,String  condition) throws IOException{
		Map dataMap= new HashMap<>();
		Map map = new HashMap<>();
		Map map1 = new HashMap<>();
		map1.put("type", equipmentType);
		map1.put("condition", condition);
		List<Equipment> condList=eqs.findDeviceList(map1);
		
		page.setTotalCounts( condList.size());
		dataMap.put("page",page.getTotalPages()); 
		dataMap.put("pageNum", page.getPageSize()); 
		
		map.put("start", (pageNum-1)*page.getPageSize());
		map.put("pageSize", page.getPageSize());
		map.put("type", equipmentType);
		map.put("condition", condition);
		List<Equipment> dataList=eqs.findDeviceList(map);
		dataMap.put("dataList", dataList);
		
		return dataMap;
	}
	
	@ResponseBody
	@RequestMapping("/addequipment")
	public String  add(String Name,Integer sceneid,Integer equipmenttype,String SN,String Mac,String Content,String gps) throws IOException{
		Equipment equipment = new Equipment();
		equipment.setEquipmentname(Name);
		equipment.setSceneid(sceneid);
		equipment.setEquipmenttype(equipmenttype);
		equipment.setSnno(SN);
		equipment.setMacno(Mac);
		equipment.setContent(Content);
		equipment.setGps(gps);
		equipment.setCreatetime(new Date());
		equipment.setAlarmstatus(0);
		equipment.setWorkstatus(0);
		try {
			eqs.addObj(equipment);
		} catch (Exception e) {
			// TODO: handle exception
			return "error";
		}
		return "ok";
		
	}
	
	@ResponseBody
	@RequestMapping("/deleteById")
	//根据场景id查找相应的设备信息 警告信息 日志信息
	public String  deleteById(int equipmentid){
		try {
			eqs.deleteById(equipmentid);
		} catch (Exception e) {
			// TODO: handle exception
			return "error";
		}
		return "ok";
	}
	
	//查询在线设备率  i
	//int 类型相除取整数部分 5/2  =2  
	@RequestMapping("/eqpOnline")
	@ResponseBody
	public String  eqpOnline() throws IOException{
		List<Equipment> list =eqs.findAll();
		List<Equipment> onlineList =eqs.findOnline();
		double p1=onlineList.size();
		double p2=list.size();
		double radio=(p1/p2)*100;
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(radio);
	}
	
}
