package cn.edu.dao;

import cn.edu.pojo.EduWebSiteImages;
import cn.edu.pojo.EduWebSiteImagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduWebSiteImagesMapper {
    long countByExample(EduWebSiteImagesExample example);

    int deleteByExample(EduWebSiteImagesExample example);

    int deleteByPrimaryKey(Integer imageid);

    int insert(EduWebSiteImages record);

    int insertSelective(EduWebSiteImages record);

    List<EduWebSiteImages> selectByExample(EduWebSiteImagesExample example);

    EduWebSiteImages selectByPrimaryKey(Integer imageid);

    int updateByExampleSelective(@Param("record") EduWebSiteImages record, @Param("example") EduWebSiteImagesExample example);

    int updateByExample(@Param("record") EduWebSiteImages record, @Param("example") EduWebSiteImagesExample example);

    int updateByPrimaryKeySelective(EduWebSiteImages record);

    int updateByPrimaryKey(EduWebSiteImages record);
}