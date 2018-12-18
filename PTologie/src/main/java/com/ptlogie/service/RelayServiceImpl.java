package com.ptlogie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptlogie.domain.Relay;
import com.ptlogie.mapper.RelayMapper;

@Service
public class RelayServiceImpl implements relayService {
	@Autowired
	private RelayMapper emapper;

	@Override
	public List<Relay> findByPage(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return emapper.findByPage(pageNum,pageSize);
	}

	@Override
	public List<Relay> findAll() {
		// TODO Auto-generated method stub
		return emapper.selectByExample(null);
	}

	@Override
	public List<Relay> findOnline() {
		// TODO Auto-generated method stub
		return emapper.findOnline();
	}




}
