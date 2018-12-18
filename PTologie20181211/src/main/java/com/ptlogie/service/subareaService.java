package com.ptlogie.service;

import java.util.List;
import java.util.Map;

import com.ptlogie.domain.Equipment;
import com.ptlogie.domain.Scene;

public interface subareaService {

	
	public List<Map<String, Object>> areaData() ;
		// TODO Auto-generated method stub
	public List<Scene> findAll();
	
	public List<Map<String, Object>> findByPage(int startObj, int pageSize);
}
