package com.ptlogie.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ptlogie.domain.Equipment;
import com.ptlogie.domain.EquipmentExample;
import com.ptlogie.domain.Page;
import com.ptlogie.domain.Scene;
import com.ptlogie.service.equipmentService;
import com.ptlogie.service.subareaService;

@Controller
@RequestMapping("/subarea")
public class SubareaController {
	
	@Autowired
	subareaService subService;
	
	@Autowired
	private equipmentService eqpService;
	@Qualifier("page")
	@Autowired
	private Page page;
	

	//区域列表页面
	@RequestMapping("/subareaList")
	   public String  subareaList(Model model,HttpServletRequest request){
		Map map1 = new HashMap<>();
		map1.put("type", "3");
		List<Equipment> gateList=eqpService.findDeviceList(map1);
		request.setAttribute("gateList", gateList);
		return "/museum/mgt-area";
	   }
	
	
	
			@RequestMapping("/init")
			@ResponseBody
			public Map findByPage(Model model){
			Map dataMap = new HashMap<>();
			Map map = new HashMap<>();
			Map map1 = new HashMap<>();
		
			List<Map<String, Object>> userList1=subService.findAreaList(map1);
			map.put("start", 0);
			map.put("pageSize", page.getPageSize());
			List<Map<String, Object>> userList=subService.findAreaList(map);
			dataMap.put("dataList", userList); 
			//获取每种设备页数
			page.setTotalCounts( userList1.size());
			dataMap.put("page",page.getTotalPages()); 
			//每页个数
			dataMap.put("pageNum", page.getPageSize()); 
			return dataMap;
			}
	
			
			@ResponseBody
			@RequestMapping("/findareaList")
			public Map equipmentList(int pageNum,String  condition) throws IOException{
				Map dataMap= new HashMap<>();
				Map map = new HashMap<>();
				//查询符合条件的总数据
				Map map1 = new HashMap<>();
				map1.put("condition", condition);
				List<Map<String, Object>> userList1=subService.findAreaList(map1);
				//查询符合条件的分页数据
				map.put("start", (pageNum-1)*page.getPageSize());
				map.put("pageSize", page.getPageSize());
				map.put("condition", condition);
				List<Map<String, Object>> dataList=subService.findAreaList(map);
				
				//往map里放值
				page.setTotalCounts( userList1.size());
				dataMap.put("page",page.getTotalPages()); 
				dataMap.put("pageNum", page.getPageSize()); 
				dataMap.put("dataList", dataList);
				return dataMap;
			}
	
	@RequestMapping("/areaInfo")
	//根据场景id查找相应的设备信息 警告信息 日志信息
	public String  areaInfo(Model model,String id,HttpSession session){
		session.removeAttribute("AreaId");
		session.setAttribute("AreaId",id);
		return "/museum/info-area";
	}
	
	@ResponseBody
	@RequestMapping("/areaData")
	//根据场景id查找相应的设备信息 警告信息 日志信息
	public List<Map<String,Object>> areaData(){
		List<Map<String,Object>> list=	subService.areaData();
		return list;
	}
	@ResponseBody
	@RequestMapping("/addArea")
	//根据场景id查找相应的设备信息 警告信息 日志信息
	public String  addArea(Model model,String sceneName,String location,String article,String gateid,String contents,String areaType){
		Scene scene = new Scene();
		scene.setScenename(sceneName);
		scene.setLocation(location);
		scene.setArticlename(article);
		scene.setGatewayid(Integer.valueOf(gateid));
		scene.setRemark(contents);
		if(areaType!=null){
		String scenetype1=areaType.substring(1,areaType.length()-2);
		scene.setScenetype(scenetype1);
}
		try {
			subService.addObj(scene);
		} catch (Exception e) {
			// TODO: handle exception
			return "error";
		}
		return "ok";
	}
	
	@ResponseBody
	@RequestMapping("/deleteById")
	//根据场景id查找相应的设备信息 警告信息 日志信息
	public String  deleteById(String sceneId){
		try {
			subService.deleteById(Integer.valueOf(sceneId));
		} catch (Exception e) {
			// TODO: handle exception
			return "error";
		}
		return "ok";
	}
	
	
	@ResponseBody
	@RequestMapping("/getPage")
	//根据场景id查找相应的设备信息 警告信息 日志信息
	public Map  getPage(int pageNum,String  condition){
		Map dataMap = new HashMap<>();
		//查询符合条件的总数据
		Map map1 = new HashMap<>();
		map1.put("condition", condition);
		List<Map<String, Object>> userList1=subService.findAreaList(map1);
		page.setTotalCounts( userList1.size());
		dataMap.put("page",page.getTotalPages()); 
		dataMap.put("pageNum", page.getPageSize());
		return dataMap;
	}
	
	
	
	@ResponseBody
	@RequestMapping("/searchAreaDataByTypeAndDateAndAreaId")
	//根据场景id查找相应的设备信息 警告信息 日志信息
	public List  searchAreaDataByTypeAndDateAndAreaId(String sceneId,String type,String date) throws ParseException{
		int AreaId=Integer.valueOf(sceneId);
		int Type=Integer.valueOf(type);
		Date time=new SimpleDateFormat("YYYY-MM-dd HH:SS:mm").parse(date);
		List<Map<String,Object>> list=subService.searchAreaDataByTypeAndDateAndAreaId(AreaId,Type,time);
		return list;
	}
	
	
}
