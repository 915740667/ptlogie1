package com.ptlogie.mapper;

import com.ptlogie.domain.Equipment;
import com.ptlogie.domain.Userinfo;
import com.ptlogie.domain.UserinfoExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserinfoMapper {
    int countByExample(UserinfoExample example);

    int deleteByExample(UserinfoExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    List<Userinfo> selectByExample(UserinfoExample example);

    Userinfo selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    int updateByExample(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);
    
	List<Userinfo> findUserByUserName(@Param("username") String username);

	List<Userinfo> findUserList(@Param("param")Map param);

	void changePWD(@Param("loginName")String loginName, @Param("passWord")String passWord);
}