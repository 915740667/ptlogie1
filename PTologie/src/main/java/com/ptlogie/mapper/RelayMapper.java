package com.ptlogie.mapper;

import com.ptlogie.domain.Relay;
import com.ptlogie.domain.RelayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelayMapper {
    int countByExample(RelayExample example);

    int deleteByExample(RelayExample example);

    int deleteByPrimaryKey(Integer relayid);

    int insert(Relay record);

    int insertSelective(Relay record);

    List<Relay> selectByExample(RelayExample example);

    Relay selectByPrimaryKey(Integer relayid);

    int updateByExampleSelective(@Param("record") Relay record, @Param("example") RelayExample example);

    int updateByExample(@Param("record") Relay record, @Param("example") RelayExample example);

    int updateByPrimaryKeySelective(Relay record);

    int updateByPrimaryKey(Relay record);

    List<Relay> findByPage(@Param("startObj")int startObj, @Param("pageSize")int pageSize);
    
   	List<Relay> findOnline();
}