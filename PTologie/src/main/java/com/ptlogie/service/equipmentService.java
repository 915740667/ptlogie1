package com.ptlogie.service;

import java.util.List;
import java.util.Map;

import com.ptlogie.domain.Equipment;

public interface equipmentService {
	public List<Equipment> findByPage(int pageNum, int pageSize);

	public List<Equipment> findAll();

	public List<Equipment> findOnline();

	public List<Equipment> findDeviceList(Map map);

	public void addObj(Equipment equipment);

	public void deleteById(int equipmentid);
}
