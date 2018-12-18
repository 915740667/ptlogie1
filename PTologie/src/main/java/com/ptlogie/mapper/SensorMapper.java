package com.ptlogie.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ptlogie.domain.Sensor;
import com.ptlogie.domain.SensorExample;

public interface SensorMapper {
    int countByExample(SensorExample example);

    int deleteByExample(SensorExample example);

    int deleteByPrimaryKey(Integer sensorid);

    int insert(Sensor record);

    int insertSelective(Sensor record);

    List<Sensor> selectByExample(SensorExample example);

    Sensor selectByPrimaryKey(Integer sensorid);

    int updateByExampleSelective(@Param("record") Sensor record, @Param("example") SensorExample example);

    int updateByExample(@Param("record") Sensor record, @Param("example") SensorExample example);

    int updateByPrimaryKeySelective(Sensor record);

    int updateByPrimaryKey(Sensor record);

	List<Map<String, Object>> findByType();
}