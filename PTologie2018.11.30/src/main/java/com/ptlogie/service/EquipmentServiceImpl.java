package com.ptlogie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptlogie.domain.Equipment;
import com.ptlogie.mapper.EquipmentMapper;

@Service
public class EquipmentServiceImpl implements equipmentService {
	@Autowired
	private EquipmentMapper emapper;

	@Override
	public List<Equipment> findByPage(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return emapper.findByPage(pageNum,pageSize);
	}

	@Override
	public List<Equipment> findAll() {
		// TODO Auto-generated method stub
		return emapper.selectByExample(null);
	}




}
