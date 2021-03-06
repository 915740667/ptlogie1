package com.ptlogie.mapper;

import com.ptlogie.domain.Systemlog;
import com.ptlogie.domain.SystemlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemlogMapper {
    int countByExample(SystemlogExample example);

    int deleteByExample(SystemlogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Systemlog record);

    int insertSelective(Systemlog record);

    List<Systemlog> selectByExample(SystemlogExample example);

    Systemlog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Systemlog record, @Param("example") SystemlogExample example);

    int updateByExample(@Param("record") Systemlog record, @Param("example") SystemlogExample example);

    int updateByPrimaryKeySelective(Systemlog record);

    int updateByPrimaryKey(Systemlog record);
}