package com.ptlogie.service;

import java.util.List;
import java.util.Map;

import com.ptlogie.domain.Datainfo;

public interface dataInfoService {
	public List<Map<String, Object>> getDataToDay();
	public int getCountToDay() ;
	public int getCountToMonth() ;
	public List<Map<String,Object>> findDataList(Map map);
}
