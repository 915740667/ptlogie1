package com.ptlogie.mapper;

import com.ptlogie.domain.UserScene;
import com.ptlogie.domain.UserSceneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSceneMapper {
    int countByExample(UserSceneExample example);

    int deleteByExample(UserSceneExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserScene record);

    int insertSelective(UserScene record);

    List<UserScene> selectByExample(UserSceneExample example);

    UserScene selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserScene record, @Param("example") UserSceneExample example);

    int updateByExample(@Param("record") UserScene record, @Param("example") UserSceneExample example);

    int updateByPrimaryKeySelective(UserScene record);

    int updateByPrimaryKey(UserScene record);
}