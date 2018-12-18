package com.ptlogie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptlogie.domain.Gateway;
import com.ptlogie.mapper.GatewayMapper;

@Service
public class GatewayServiceImpl implements gatewayService {
	@Autowired
	private GatewayMapper emapper;

	@Override
	public List<Gateway> findByPage(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return emapper.findByPage(pageNum,pageSize);
	}

	@Override
	public List<Gateway> findAll() {
		// TODO Auto-generated method stub
		return emapper.selectByExample(null);
	}

	@Override
	public List<Gateway> findOnline() {
		// TODO Auto-generated method stub
		return emapper.findOnline();
	}




}
