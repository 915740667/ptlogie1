package com.ptlogie.mapper;

import com.ptlogie.domain.Datainfo;
import com.ptlogie.domain.DatainfoExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface DatainfoMapper {
    int countByExample(DatainfoExample example);

    int deleteByExample(DatainfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Datainfo record);

    int insertSelective(Datainfo record);

    List<Datainfo> selectByExample(DatainfoExample example);

    Datainfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Datainfo record, @Param("example") DatainfoExample example);

    int updateByExample(@Param("record") Datainfo record, @Param("example") DatainfoExample example);

    int updateByPrimaryKeySelective(Datainfo record);

    int updateByPrimaryKey(Datainfo record);

	List<Map<String, Object>> getDataList();

	List<Map<String, Object>> dataCountByMonth();

	int getCountToDay();

	int getCountToMonth();

	List<Map<String, Object>> findDataList(@Param("param")Map map);
}