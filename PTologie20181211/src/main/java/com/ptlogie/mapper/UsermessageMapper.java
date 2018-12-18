package com.ptlogie.mapper;

import com.ptlogie.domain.Usermessage;
import com.ptlogie.domain.UsermessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsermessageMapper {
    int countByExample(UsermessageExample example);

    int deleteByExample(UsermessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Usermessage record);

    int insertSelective(Usermessage record);

    List<Usermessage> selectByExample(UsermessageExample example);

    Usermessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Usermessage record, @Param("example") UsermessageExample example);

    int updateByExample(@Param("record") Usermessage record, @Param("example") UsermessageExample example);

    int updateByPrimaryKeySelective(Usermessage record);

    int updateByPrimaryKey(Usermessage record);
}