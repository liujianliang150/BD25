package cn.edu.dao;

import cn.edu.pojo.EduWebSiteCourse;
import cn.edu.pojo.EduWebSiteCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduWebSiteCourseMapper {
    long countByExample(EduWebSiteCourseExample example);

    int deleteByExample(EduWebSiteCourseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduWebSiteCourse record);

    int insertSelective(EduWebSiteCourse record);

    List<EduWebSiteCourse> selectByExample(EduWebSiteCourseExample example);

    EduWebSiteCourse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduWebSiteCourse record, @Param("example") EduWebSiteCourseExample example);

    int updateByExample(@Param("record") EduWebSiteCourse record, @Param("example") EduWebSiteCourseExample example);

    int updateByPrimaryKeySelective(EduWebSiteCourse record);

    int updateByPrimaryKey(EduWebSiteCourse record);
}