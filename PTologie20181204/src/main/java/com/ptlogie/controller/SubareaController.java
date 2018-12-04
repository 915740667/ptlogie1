package com.ptlogie.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ptlogie.domain.Alarm;
import com.ptlogie.domain.Equipment;

@Controller
@RequestMapping("/subarea")
public class SubareaController {
	@RequestMapping("/subareaList")
	   public String  subareaList(){
		   
		return "/museum/mgt-area";
	   }
	
	@RequestMapping("/areaInfo")
	//根据场景id查找相应的设备信息 警告信息 日志信息
	public String  areaInfo(Model model,String id){
		List alarmList=new ArrayList<>();
		List equipmentList=new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			Alarm alarm = new Alarm();
			Equipment eq=new Equipment();
			alarm.setId(i+1);
			alarm.setDeviceid(1+i);
			alarm.setDatavalue((float) 30.0);
			alarm.setMessage("sss");
			alarm.setType(i);
			
			eq.setEquipmentid(i+1);
			eq.setEquipmentname("n"+i);
			eq.setEquipmenttype(1);
			eq.setEletric((float) 2.15);
			eq.setWorkstatus(1);
			eq.setAlarmstatus(1);
			equipmentList.add(eq);
			alarmList.add(alarm);
		}
		model.addAttribute("equipmentList",equipmentList);
		model.addAttribute("alarmList",alarmList);
		model.addAttribute("Hourlist",initHourList());
		return "/museum/info-area";
	}
	
	//初始化时间下拉列表
	public List initHourList(){
		List Hourlist =new ArrayList<>();
		for (int i = 1; i < 25; i++) {
			Hourlist.add(i);
		}
		return Hourlist;
	}
}
