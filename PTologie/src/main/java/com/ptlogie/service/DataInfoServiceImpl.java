package com.ptlogie.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptlogie.mapper.DatainfoMapper;
import com.ptlogie.util.DateUtils;
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
	
	//对日期进行格式化处理
	@Override
	public List<Map<String, Object>> findDataList(Map map) {
		List<Map<String, Object>> dataList=mapper.findDataList(map);
		List templist=new ArrayList<>();
		for (int i = 0; i < dataList.size(); i++) {
			Map  temp=dataList.get(i);
			Date date =(Date) temp.get("updatetime");
			temp.put("updatetime", DateUtils.dateFormat(date));
			templist.add(temp);
		}
		// TODO Auto-generated method stub
		return templist;
	}







}
