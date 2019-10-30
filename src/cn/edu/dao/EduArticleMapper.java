package cn.edu.dao;

import cn.edu.pojo.EduArticle;
import cn.edu.pojo.EduArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduArticleMapper {
    long countByExample(EduArticleExample example);

    int deleteByExample(EduArticleExample example);

    int deleteByPrimaryKey(Integer articleid);

    int insert(EduArticle record);

    int insertSelective(EduArticle record);

    List<EduArticle> selectByExample(EduArticleExample example);

    EduArticle selectByPrimaryKey(Integer articleid);

    int updateByExampleSelective(@Param("record") EduArticle record, @Param("example") EduArticleExample example);

    int updateByExample(@Param("record") EduArticle record, @Param("example") EduArticleExample example);

    int updateByPrimaryKeySelective(EduArticle record);

    int updateByPrimaryKey(EduArticle record);
}