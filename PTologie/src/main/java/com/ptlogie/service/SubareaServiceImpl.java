package com.ptlogie.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptlogie.domain.Scene;
import com.ptlogie.domain.SceneExample;
import com.ptlogie.mapper.SceneMapper;

@Service
public class SubareaServiceImpl implements subareaService {

	@Autowired
	SceneMapper mapper;
	
	@Override
	public List<Map<String, Object>> areaData() {
		// TODO Auto-generated method stub
		 List<Map<String, Object>> list=mapper.areaData();

		return list;
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

	@Override
	public List<Map<String, Object>> findAreaList(Map map1) {
		// TODO Auto-generated method stub
		List<Map<String, Object>> list= mapper.findAreaList(map1);
		List list1=new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
		String sceneType=	(String) list.get(i).get("sceneType");
		String sceneType1=sceneType.replace("1", "温湿度监控").replace("2", "温度监控").replace("3", "湿度监控").replace("4", "入侵监控");
		list.get(i).put("sceneType", sceneType1);
		list1.add(list.get(i));
		}
		return list1;
	}

	@Override
	public void addObj(Scene scene) {
		// TODO Auto-generated method stub
		mapper.insertSelective(scene);
	}

	@Override
	public void deleteById(Integer sceneId) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(sceneId);
	}

	@Override
	public List<Map<String, Object>> searchAreaDataByTypeAndDateAndAreaId(int sceneId, int type, Date date) {
		// TODO Auto-generated method stub
		List<Map<String, Object>> list=mapper.searchAreaDataByTypeAndDateAndAreaId(sceneId,type,date);
		return list;
	}





	



}
