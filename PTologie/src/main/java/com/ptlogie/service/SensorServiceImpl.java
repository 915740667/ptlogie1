package com.ptlogie.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptlogie.mapper.SensorMapper;

@Service
public class SensorServiceImpl implements sensorService {

	@Autowired
	SensorMapper smapper;
	@Override
	public List<Map<String, Object>> findByType() {
		
		List<Map <String,Object>> list=	smapper.findByType();
	
		return list;
	}

}
