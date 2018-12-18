package com.ptlogie.mapper;

import com.ptlogie.domain.Articletype;
import com.ptlogie.domain.ArticletypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticletypeMapper {
    int countByExample(ArticletypeExample example);

    int deleteByExample(ArticletypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Articletype record);

    int insertSelective(Articletype record);

    List<Articletype> selectByExample(ArticletypeExample example);

    Articletype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Articletype record, @Param("example") ArticletypeExample example);

    int updateByExample(@Param("record") Articletype record, @Param("example") ArticletypeExample example);

    int updateByPrimaryKeySelective(Articletype record);

    int updateByPrimaryKey(Articletype record);
}