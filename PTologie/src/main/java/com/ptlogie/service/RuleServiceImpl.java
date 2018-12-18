package com.ptlogie.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptlogie.domain.Rule;
import com.ptlogie.mapper.RuleMapper;
@Service
public class RuleServiceImpl implements ruleService {

	@Autowired
	RuleMapper mapper;
	
	@Override
	public List<Rule> findRuleList(Map map1) {
		// TODO Auto-generated method stub
		return mapper.findRuleList(map1);
	}

}
