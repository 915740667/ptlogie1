package com.ptlogie.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.ptlogie.domain.Scene;

public interface subareaService {

	
	public List<Map<String, Object>> areaData() ;
		// TODO Auto-generated method stub
	public List<Scene> findAll();
	
	public List<Map<String, Object>> findByPage(int startObj, int pageSize);
	public List<Map<String, Object>> findAreaList(Map map1);
	public void addObj(Scene scene);
	public void deleteById(Integer sceneId);
	public List<Map<String,Object>> searchAreaDataByTypeAndDateAndAreaId(int sceneId, int type, Date date);
}
