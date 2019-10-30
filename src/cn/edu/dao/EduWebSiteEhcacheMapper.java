package cn.edu.dao;

import cn.edu.pojo.EduWebSiteEhcache;
import cn.edu.pojo.EduWebSiteEhcacheExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduWebSiteEhcacheMapper {
    long countByExample(EduWebSiteEhcacheExample example);

    int deleteByExample(EduWebSiteEhcacheExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduWebSiteEhcache record);

    int insertSelective(EduWebSiteEhcache record);

    List<EduWebSiteEhcache> selectByExample(EduWebSiteEhcacheExample example);

    EduWebSiteEhcache selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduWebSiteEhcache record, @Param("example") EduWebSiteEhcacheExample example);

    int updateByExample(@Param("record") EduWebSiteEhcache record, @Param("example") EduWebSiteEhcacheExample example);

    int updateByPrimaryKeySelective(EduWebSiteEhcache record);

    int updateByPrimaryKey(EduWebSiteEhcache record);
}