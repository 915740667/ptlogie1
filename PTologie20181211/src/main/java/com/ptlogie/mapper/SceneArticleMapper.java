package com.ptlogie.mapper;

import com.ptlogie.domain.SceneArticle;
import com.ptlogie.domain.SceneArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SceneArticleMapper {
    int countByExample(SceneArticleExample example);

    int deleteByExample(SceneArticleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SceneArticle record);

    int insertSelective(SceneArticle record);

    List<SceneArticle> selectByExample(SceneArticleExample example);

    SceneArticle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SceneArticle record, @Param("example") SceneArticleExample example);

    int updateByExample(@Param("record") SceneArticle record, @Param("example") SceneArticleExample example);

    int updateByPrimaryKeySelective(SceneArticle record);

    int updateByPrimaryKey(SceneArticle record);
}