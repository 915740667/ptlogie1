package com.ptlogie.service;

import java.util.List;

import com.ptlogie.domain.Relay;

public interface relayService {
	public List<Relay> findByPage(int pageNum, int pageSize);

	public List<Relay> findAll();

	public List<Relay> findOnline();
}
