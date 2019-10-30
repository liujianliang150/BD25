package cn.edu.dao;

import cn.edu.pojo.EduWebSiteCourseDetail;
import cn.edu.pojo.EduWebSiteCourseDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduWebSiteCourseDetailMapper {
    long countByExample(EduWebSiteCourseDetailExample example);

    int deleteByExample(EduWebSiteCourseDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduWebSiteCourseDetail record);

    int insertSelective(EduWebSiteCourseDetail record);

    List<EduWebSiteCourseDetail> selectByExample(EduWebSiteCourseDetailExample example);

    EduWebSiteCourseDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduWebSiteCourseDetail record, @Param("example") EduWebSiteCourseDetailExample example);

    int updateByExample(@Param("record") EduWebSiteCourseDetail record, @Param("example") EduWebSiteCourseDetailExample example);

    int updateByPrimaryKeySelective(EduWebSiteCourseDetail record);

    int updateByPrimaryKey(EduWebSiteCourseDetail record);
}