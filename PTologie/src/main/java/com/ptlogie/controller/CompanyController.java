package com.ptlogie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ptlogie.service.companyService;


@Controller
@RequestMapping("/company")
public class CompanyController {
	
	@Autowired
	companyService comp;
	
	@RequestMapping("/list")
	public String  getList(){
		List list=comp.findList();
		return "/museum/home";
	}

}
