package cn.edu.dao;

import cn.edu.pojo.EduWebSiteProfile;
import cn.edu.pojo.EduWebSiteProfileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduWebSiteProfileMapper {
    long countByExample(EduWebSiteProfileExample example);

    int deleteByExample(EduWebSiteProfileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduWebSiteProfile record);

    int insertSelective(EduWebSiteProfile record);

    List<EduWebSiteProfile> selectByExampleWithBLOBs(EduWebSiteProfileExample example);

    List<EduWebSiteProfile> selectByExample(EduWebSiteProfileExample example);

    EduWebSiteProfile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduWebSiteProfile record, @Param("example") EduWebSiteProfileExample example);

    int updateByExampleWithBLOBs(@Param("record") EduWebSiteProfile record, @Param("example") EduWebSiteProfileExample example);

    int updateByExample(@Param("record") EduWebSiteProfile record, @Param("example") EduWebSiteProfileExample example);

    int updateByPrimaryKeySelective(EduWebSiteProfile record);

    int updateByPrimaryKeyWithBLOBs(EduWebSiteProfile record);

    int updateByPrimaryKey(EduWebSiteProfile record);
}