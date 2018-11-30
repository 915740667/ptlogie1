package com.ptlogie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ptlogie.service.CompanyServiceImpl;

@Controller
@RequestMapping("/company")
public class CompanyController {
	
	@Autowired
	CompanyServiceImpl comp;
	
	@RequestMapping("/list.do")
	public String  getList(){
		List list=comp.findList();
		return "/museum/home";
	}

}
