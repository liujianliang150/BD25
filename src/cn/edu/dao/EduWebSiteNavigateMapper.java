package cn.edu.dao;

import cn.edu.pojo.EduWebSiteNavigate;
import cn.edu.pojo.EduWebSiteNavigateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduWebSiteNavigateMapper {
    long countByExample(EduWebSiteNavigateExample example);

    int deleteByExample(EduWebSiteNavigateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduWebSiteNavigate record);

    int insertSelective(EduWebSiteNavigate record);

    List<EduWebSiteNavigate> selectByExample(EduWebSiteNavigateExample example);

    EduWebSiteNavigate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduWebSiteNavigate record, @Param("example") EduWebSiteNavigateExample example);

    int updateByExample(@Param("record") EduWebSiteNavigate record, @Param("example") EduWebSiteNavigateExample example);

    int updateByPrimaryKeySelective(EduWebSiteNavigate record);

    int updateByPrimaryKey(EduWebSiteNavigate record);
}