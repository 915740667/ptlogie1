package com.ptlogie.mapper;

import com.ptlogie.domain.Equimentlog;
import com.ptlogie.domain.EquimentlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquimentlogMapper {
    int countByExample(EquimentlogExample example);

    int deleteByExample(EquimentlogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Equimentlog record);

    int insertSelective(Equimentlog record);

    List<Equimentlog> selectByExample(EquimentlogExample example);

    Equimentlog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Equimentlog record, @Param("example") EquimentlogExample example);

    int updateByExample(@Param("record") Equimentlog record, @Param("example") EquimentlogExample example);

    int updateByPrimaryKeySelective(Equimentlog record);

    int updateByPrimaryKey(Equimentlog record);
}