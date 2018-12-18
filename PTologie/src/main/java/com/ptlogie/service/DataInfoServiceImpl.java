package com.ptlogie.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptlogie.domain.Datainfo;
import com.ptlogie.mapper.DatainfoMapper;
@Service
public class DataInfoServiceImpl implements dataInfoService {

	@Autowired
	DatainfoMapper mapper;
	@Override
	public List<Map<String, Object>> getDataToDay() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> list=	mapper.getDataList();
		return list;
	}
	@Override
	public int getCountToDay() {
		// TODO Auto-generated method stub
	int i=	mapper.getCountToDay();
		return  i;
	}
	@Override
	public int getCountToMonth() {
		// TODO Auto-generated method stub
		return mapper.getCountToMonth();
	}
	@Override
	public List<Map<String, Object>> findDataList(Map map) {
		// TODO Auto-generated method stub
		return mapper.findDataList(map);
	}







}
