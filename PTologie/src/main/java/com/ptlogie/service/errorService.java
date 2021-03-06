package com.ptlogie.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ptlogie.domain.Scene;
import com.ptlogie.domain.Userinfo;

public interface errorService {
	public List<Map<String, Object>> findErrorsBy7Day() ;
	public List<Map<String, Object>> alarmProportion() ;
	public List<com.ptlogie.domain.Error> findAll();
	public List<com.ptlogie.domain.Error> findErrorList(Map map1);
}
