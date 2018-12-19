package com.ptlogie.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.ptlogie.domain.Scene;

public interface subareaService {

	
	public List<Map<String, Object>> areaData() ;
		// TODO Auto-generated method stub
	public List<Scene> findAll();
	
	public List<Map<String, Object>> findAreaList(Map map1);
	public void addObj(Scene scene);
	public void deleteById(Integer sceneId);
	public List<Map<String,Object>> searchAreaDataByTypeAndDateAndAreaId(int sceneId, int type, Date date);
	/**
	 * @Title: getSceneListByCompanyid   
	 * @Description: 根据公司id查询该公司下的所有区域   
	 * @param companyid
	 * @return
	 */
	public List<Scene> getSceneListByCompanyid(int companyid);
}
