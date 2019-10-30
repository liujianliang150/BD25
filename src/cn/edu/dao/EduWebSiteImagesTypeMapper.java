package cn.edu.dao;

import cn.edu.pojo.EduWebSiteImagesType;
import cn.edu.pojo.EduWebSiteImagesTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduWebSiteImagesTypeMapper {
    long countByExample(EduWebSiteImagesTypeExample example);

    int deleteByExample(EduWebSiteImagesTypeExample example);

    int deleteByPrimaryKey(Integer typeid);

    int insert(EduWebSiteImagesType record);

    int insertSelective(EduWebSiteImagesType record);

    List<EduWebSiteImagesType> selectByExample(EduWebSiteImagesTypeExample example);

    EduWebSiteImagesType selectByPrimaryKey(Integer typeid);

    int updateByExampleSelective(@Param("record") EduWebSiteImagesType record, @Param("example") EduWebSiteImagesTypeExample example);

    int updateByExample(@Param("record") EduWebSiteImagesType record, @Param("example") EduWebSiteImagesTypeExample example);

    int updateByPrimaryKeySelective(EduWebSiteImagesType record);

    int updateByPrimaryKey(EduWebSiteImagesType record);
}