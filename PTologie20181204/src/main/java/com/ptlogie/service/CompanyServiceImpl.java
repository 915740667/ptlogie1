package com.ptlogie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptlogie.domain.Company;
import com.ptlogie.mapper.CompanyMapper;

@Service
public class CompanyServiceImpl implements companyService {
	@Autowired
	 CompanyMapper cmapper;

	@Override
	public List findList() {
		// TODO Auto-generated method stub
		List <Company> list=cmapper.selectByExample(null);
		return list;
	}
	
	
	
}
