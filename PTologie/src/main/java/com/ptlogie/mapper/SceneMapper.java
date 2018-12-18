package com.ptlogie.mapper;

import com.ptlogie.domain.Scene;
import com.ptlogie.domain.SceneExample;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SceneMapper {
    int countByExample(SceneExample example);

    int deleteByExample(SceneExample example);

    int deleteByPrimaryKey(Integer sceneid);

    int insert(Scene record);

    int insertSelective(Scene record);

    List<Scene> selectByExample(SceneExample example);

    Scene selectByPrimaryKey(Integer sceneid);

    int updateByExampleSelective(@Param("record") Scene record, @Param("example") SceneExample example);

    int updateByExample(@Param("record") Scene record, @Param("example") SceneExample example);

    int updateByPrimaryKeySelective(Scene record);

    int updateByPrimaryKey(Scene record);

	List<Map<String, Object>> areaData();


	List<Scene> findAll();

	List<Map<String, Object>> findByPage(@Param("startObj")int startObj, @Param("pageSize")int pageSize);

	List<Map<String, Object>> findAreaList(@Param("param")Map map1);

	List<Map<String, Object>> searchAreaDataByTypeAndDateAndAreaId(@Param("sceneId")int sceneId,@Param("type") int type, @Param("date")Date date);
}