package com.ptlogie.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptlogie.domain.Equipment;
import com.ptlogie.mapper.EquipmentMapper;
import com.ptlogie.util.DateUtils;

@Service
public class EquipmentServiceImpl implements equipmentService {
	@Autowired
	private EquipmentMapper emapper;



	@Override
	public List<Equipment> findAll() {
		// TODO Auto-generated method stub
		return emapper.selectByExample(null);
	}

	@Override
	public List<Equipment> findOnline() {
		// TODO Auto-generated method stub
		return emapper.findOnline();
	}

	@Override
	public List<Map<String, Object>> findDeviceList(Map map) {
		String equipmentType=	(String) map.get("type");
		List pList=new ArrayList<>();
		Map temp = new HashMap<>();
		if(equipmentType.contains(",")){
		String[] str=	equipmentType.split(",");
		for (String string : str) {
			int p = Integer.valueOf(string);
			pList.add(p);
		}
		temp.put("type", pList);
		temp.put("condition",  map.get("condition"));
		temp.put("start",  map.get("start"));
		temp.put("pageSize",  map.get("pageSize"));
		List templist=	emapper.findDeviceList(temp);
		return templist;
		}
		pList.add(Integer.valueOf(equipmentType));
		temp.put("type", pList);
		temp.put("condition",  map.get("condition"));
		temp.put("start",  map.get("start"));
		temp.put("pageSize",  map.get("pageSize"));
		List<Map<String, Object>> list=	 emapper.findDeviceList(temp);
		List tempList=new ArrayList<>();
		for (Map equipment : list) {
			if(equipment.get("createtime")!=null){
				equipment.put("createtime", DateUtils.dateFormat((Date)equipment.get("createtime")));
				tempList.add(equipment);
			}
			
		}
		// TODO Auto-generated method stub
		return tempList;
	}

	@Override
	public void addObj(Equipment equipment) {
		// TODO Auto-generated method stub
		emapper.insert(equipment);
	}

	@Override
	public void deleteById(int equipmentid) {
		// TODO Auto-generated method stub
		emapper.deleteByPrimaryKey(equipmentid);
	}




}
