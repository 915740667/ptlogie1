package com.ptlogie.service;

import java.util.List;

import com.ptlogie.domain.Gateway;;

public interface gatewayService {
	public List<Gateway> findByPage(int pageNum, int pageSize);

	public List<Gateway> findAll();

	public List<Gateway> findOnline();
}
