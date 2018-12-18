package com.ptlogie.service;

import java.util.List;

import com.ptlogie.domain.Equipment;

public interface equipmentService {
	public List<Equipment> findByPage(int pageNum, int pageSize);

	public List<Equipment> findAll();

	public List<Equipment> findOnline();
}
