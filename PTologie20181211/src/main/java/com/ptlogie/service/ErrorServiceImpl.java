package com.ptlogie.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptlogie.mapper.ErrorMapper;
@Service
public class ErrorServiceImpl implements errorService {

	@Autowired
	ErrorMapper mapper;
	
	@Override
	public List<Map<String, Object>> findErrorsBy7Day() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> Dlist=mapper.findDErrorsBy7Day();
	 
		List list= new ArrayList<>();
		for (int i = 0; i < Dlist.size(); i++) {
			Map mapd=Dlist.get(i);
			Date dated=(Date) mapd.get("date");
			String date1=new SimpleDateFormat("yyyy-MM-dd").format(dated);
			for (int j = 0; j <7; j++) {
				Calendar ca = Calendar.getInstance();//得到一个Calendar的实例 
				ca.setTime(new Date()); //设置时间为当前时间
				ca.add(Calendar.DATE,-j);
				String date=new SimpleDateFormat("yyyy-MM-dd").format(ca.getTime());
				if(date1.equals(date)){
					Map<String, Object>mapn=new HashMap<>();
					int p = j+1;
					mapn.put("x", "第"+p+"天");
					Long p1= (Long) mapd.get("t1");
					Long p2=(Long) mapd.get("t2");
					Long[] n ={p1.longValue(),p2.longValue()};
					mapn.put("val",n);
					list.add(mapn);
					continue;
				}
			}
		}
		
		return list;
	}

	@Override
	public List<Map<String, Object>> alarmProportion() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> Dlist=mapper.alarmProportion();
		List nList=new ArrayList<>();
		for (int i = 0; i < Dlist.size(); i++) {
		Map mapn=new HashMap<>();
		Map map=	Dlist.get(i);
		mapn.put("name", map.get("sceneName"));
		mapn.put("value", map.get("tc"));
		nList.add(mapn);
		}
		return nList;
	}

	@Override
	public List<com.ptlogie.domain.Error> findAll() {
		// TODO Auto-generated method stub
		List<com.ptlogie.domain.Error> list=mapper.selectByExample(null);
		return list;
	}

	@Override
	public List<Map<String, Object>> findByPage(int startObj, int pageSize) {
		// TODO Auto-generated method stub
		List<Map<String, Object>> list=mapper.findByPage(startObj,pageSize);
		return list;
	}

	 
	

	

}
