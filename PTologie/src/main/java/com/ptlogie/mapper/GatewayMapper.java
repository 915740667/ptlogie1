package com.ptlogie.mapper;

import com.ptlogie.domain.Gateway;
import com.ptlogie.domain.GatewayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GatewayMapper {
    int countByExample(GatewayExample example);

    int deleteByExample(GatewayExample example);

    int deleteByPrimaryKey(Integer gatewayid);

    int insert(Gateway record);

    int insertSelective(Gateway record);

    List<Gateway> selectByExample(GatewayExample example);

    Gateway selectByPrimaryKey(Integer gatewayid);

    int updateByExampleSelective(@Param("record") Gateway record, @Param("example") GatewayExample example);

    int updateByExample(@Param("record") Gateway record, @Param("example") GatewayExample example);

    int updateByPrimaryKeySelective(Gateway record);

    int updateByPrimaryKey(Gateway record);
    
    List<Gateway> findByPage(@Param("startObj")int startObj, @Param("pageSize")int pageSize);
    
   	List<Gateway> findOnline();
}