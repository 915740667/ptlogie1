package com.ptlogie.service;

import java.util.List;
import java.util.Map;

public interface dataInfoService {
	public List<Map<String, Object>> getDataToDay();

	
	
	
	public int getCountToDay() ;
	public int getCountToMonth() ;
}
