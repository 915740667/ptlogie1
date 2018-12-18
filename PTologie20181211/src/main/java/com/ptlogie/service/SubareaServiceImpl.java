package com.ptlogie.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptlogie.domain.Equipment;
import com.ptlogie.domain.Scene;
import com.ptlogie.mapper.SceneMapper;

@Service
public class SubareaServiceImpl implements subareaService {

	@Autowired
	SceneMapper mapper;
	
	@Override
	public List<Map<String, Object>> areaData() {
		// TODO Auto-generated method stub
		 List<Map<String, Object>> list=mapper.areaData();
		 List list1=new ArrayList<>();
		 for (int i = 0; i < list.size(); i++) {
			Map map= list.get(i);
			int id=(int) map.get("sceneId");
			int Count=mapper.getDeviceCountBySceneId(id);
			map.put("deviceCount", Count);
			list1.add(map);
		}
		return list1;
	}

	@Override
	public List<Scene> findAll() {
		// TODO Auto-generated method stub
		List<Scene> list=mapper.findAll();
		return list;
	}

	@Override
	public List<Map<String, Object>> findByPage(int startObj, int pageSize) {
		List<Map<String, Object>> list=mapper.findByPage(startObj,pageSize);
		// TODO Auto-generated method stub
		return list;
	}



	



}
