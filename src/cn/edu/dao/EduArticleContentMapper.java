package cn.edu.dao;

import cn.edu.pojo.EduArticleContent;
import cn.edu.pojo.EduArticleContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduArticleContentMapper {
    long countByExample(EduArticleContentExample example);

    int deleteByExample(EduArticleContentExample example);

    int insert(EduArticleContent record);

    int insertSelective(EduArticleContent record);

    List<EduArticleContent> selectByExampleWithBLOBs(EduArticleContentExample example);

    List<EduArticleContent> selectByExample(EduArticleContentExample example);

    int updateByExampleSelective(@Param("record") EduArticleContent record, @Param("example") EduArticleContentExample example);

    int updateByExampleWithBLOBs(@Param("record") EduArticleContent record, @Param("example") EduArticleContentExample example);

    int updateByExample(@Param("record") EduArticleContent record, @Param("example") EduArticleContentExample example);
}