package com.ptlogie.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ptlogie.domain.Scene;

public interface errorService {
	public List<Map<String, Object>> findErrorsBy7Day() ;
	public List<Map<String, Object>> alarmProportion() ;
	public List<com.ptlogie.domain.Error> findAll();
	public List<Map<String, Object>> findByPage(int i, int pageSize);
}
