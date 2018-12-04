package com.ptlogie.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.ptlogie.domain.Datainfo;
import com.ptlogie.domain.LoginUser;
import com.ptlogie.domain.Scene;
import com.ptlogie.service.LoginUserServiceImpl;
import com.ptlogie.util.MD5Utils;
@Controller
@RequestMapping("/loginUser")
public class UserLoginController {
	
	
	
	private final Log logger = LogFactory.getLog(UserLoginController.class);
	
	
	@Autowired
	LoginUserServiceImpl service;
	
	
	@RequestMapping("/toLogin")
	public String  toLogin(){
	
		return "/museum/login";
	}
	
	
	@RequestMapping("/userLogin")
	public String  login(Map<String, Object> map, HttpSession session, HttpServletRequest request,Model model) throws ParseException{
		logger.debug("loging");
	String  userName =(String) request.getParameter("login_id");
	String  passWord =(String) request.getParameter("password");
	List <LoginUser>list=service.findUserByUserName(userName);
	if(list.size()>0&&list!=null){
		LoginUser user=list.get(0);
		String pwd=user.getPassword();
		if(user.getPassword().equals(MD5Utils.md5(passWord))){
			session.setAttribute("loginUser", user);
			InitBar(model);
			InitPie(model);
			SenenList(model);
			DataInfoList(model);
			return "/museum/home";
		}else{
			return "/museum/login";
		}
	}
	return "/museum/login";
	}
	
	
	@RequestMapping("/toMain")
	public String toMain(Model model) throws ParseException{
		InitBar(model);
		InitPie(model);
		SenenList(model);
		DataInfoList(model);
		return "/museum/home";
	}
	
	
	
	 public void InitBar(Model model){
		 Map map1=new HashMap();
		   Map map2=new HashMap();
		   Map map3=new HashMap();
		   Map map4=new HashMap();
		   Map map5=new HashMap();
		   Map map6=new HashMap();
		   Map map7=new HashMap();
		   List data=new ArrayList<>();
		   int [] day1={27,24};
		   int [] day2={17,21};
		   int [] day3={32,14};
		   int [] day4={27,24};
		   int [] day5={14,18};
		   int [] day6={8,20};
		   int [] day7={9,12};
		   map1.put("x","第1天");
		   map2.put("x","第2天");
		   map3.put("x", "第3天");
		   map4.put("x", "第4天");
		   map5.put("x", "第5天");
		   map6.put("x", "第6天");
		   map7.put("x", "第7天");
		   map1.put("val",day1);
		   map2.put ("val",day2);
		   map3.put ("val",day3);
		   map4.put ("val",day4);
		   map5.put ("val",day5);
		   map6.put ("val",day6);
		   map7.put ("val",day7);
		   data.add(map1);
		   data.add(map2);
		   data.add(map3);
		   data.add(map4);
		   data.add(map5);
		   data.add(map6);
		   data.add(map7);
		   String objJson = JSON.toJSONString(data);
		   model.addAttribute("InitBar", objJson);
	 }
	 
	 public void InitPie(Model model){
		   Map map1=new HashMap();
		   Map map2=new HashMap();
		   Map map3=new HashMap();
		   Map map4=new HashMap();
		   Map map5=new HashMap();
		   Map map6=new HashMap();
		   Map map7=new HashMap();
		   Map map8=new HashMap();
		   List data=new ArrayList<>();
		  
		   map1.put("name","区域1");
		   map2.put("name","区域2");
		   map3.put("name", "区域3");
		   map4.put("name", "区域4");
		   map5.put("name", "区域5");
		   map6.put("name", "区域6");
		   map7.put("name", "区域7");
		   map7.put("name", "区域8");
		   map1.put("value",45);
		   map2.put ("value",121);
		   map3.put ("value",37);
		   map4.put ("value",46);
		   map5.put ("value",221);
		   map6.put ("value",121);
		   map7.put ("value",76);
		   map8.put ("value",88);
		   data.add(map1);
		   data.add(map2);
		   data.add(map3);
		   data.add(map4);
		   data.add(map5);
		   data.add(map6);
		   data.add(map7);
		   String objJson = JSON.toJSONString(data);
		   model.addAttribute("InitPie", objJson);
	 }
	 
	 public void SenenList(Model model){
		 List list = new ArrayList<>();
		 Scene scnene1= new Scene();
		 Scene scnene2= new Scene();
		 Scene scnene3= new Scene();
		 Scene scnene4= new Scene();
		 scnene1.setSceneId(1);
		 scnene1.setSceneName("aaa");
		 scnene1.setDevicestatus("2");
		 scnene1.setState(1);
		 scnene1.setSceneremark("sss");
		 scnene1.setUpdatetime(new Date());
		 
		 scnene2.setSceneId(2);
		 scnene2.setSceneName("bbb");
		 scnene2.setDevicestatus("2");
		 scnene2.setState(1);
		 scnene2.setSceneremark("sss");
		 scnene2.setUpdatetime(new Date());
		 
		 scnene3.setSceneId(3);
		 scnene3.setSceneName("ccc");
		 scnene3.setDevicestatus("2");
		 scnene3.setState(1);
		 scnene3.setSceneremark("sss");
		 scnene3.setUpdatetime(new Date());
		 
		 scnene4.setSceneId(4);
		 scnene4.setSceneName("ddd");
		 scnene4.setDevicestatus("2");
		 scnene4.setState(1);
		 scnene4.setSceneremark("sss");
		 scnene4.setUpdatetime(new Date());
		 
		 list.add(scnene1);
		 list.add(scnene2);
		 list.add(scnene3);
		 list.add(scnene4);
		 /*String objJson = JSON.toJSONString(list);*/
		 model.addAttribute("sceneList", list);
	
	 }
	 
	 public void DataInfoList(Model model) throws ParseException{
	 List list=new ArrayList<>();
	for (int i = 0; i <5; i++) {
		Datainfo data=new Datainfo();
		data.setId(i);
		data.setDevicename("device"+i);
		data.setScnenenmae("scene"+i);
		data.setRemark("ssss");
		data.setUptime(new Date());
		list.add(data);
	}
	model.addAttribute("dataInfoList", list);
	 }
	 
	 @RequestMapping("/logout")
	 public String logout(HttpSession session){
		 session.removeAttribute("loginUser");;
		 return "/museum/login";
	 }
}
