package com.ptlogie.mapper;

import com.ptlogie.domain.Error;
import com.ptlogie.domain.ErrorExample;
import com.ptlogie.domain.Rule;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ErrorMapper {
    int countByExample(ErrorExample example);

    int deleteByExample(ErrorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Error record);

    int insertSelective(Error record);

    List<Error> selectByExample(ErrorExample example);

    Error selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Error record, @Param("example") ErrorExample example);

    int updateByExample(@Param("record") Error record, @Param("example") ErrorExample example);

    int updateByPrimaryKeySelective(Error record);

    int updateByPrimaryKey(Error record);
    
	List<Map<String, Object>> findDErrorsBy7Day();

	List<Map<String, Object>> alarmProportion();


	List<Error> findErrorList(@Param("param")Map param);

	
}