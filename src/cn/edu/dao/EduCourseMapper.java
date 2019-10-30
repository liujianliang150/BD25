package cn.edu.dao;

import cn.edu.pojo.EduCourse;
import cn.edu.pojo.EduCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduCourseMapper {
    long countByExample(EduCourseExample example);

    int deleteByExample(EduCourseExample example);

    int deleteByPrimaryKey(Integer courseid);

    int insert(EduCourse record);

    int insertSelective(EduCourse record);

    List<EduCourse> selectByExampleWithBLOBs(EduCourseExample example);

    List<EduCourse> selectByExample();

    EduCourse selectByPrimaryKey(Integer courseid);

    int updateByExampleSelective(@Param("record") EduCourse record, @Param("example") EduCourseExample example);

    int updateByExampleWithBLOBs(@Param("record") EduCourse record, @Param("example") EduCourseExample example);

    int updateByExample(@Param("record") EduCourse record, @Param("example") EduCourseExample example);

    int updateByPrimaryKeySelective(EduCourse record);

    int updateByPrimaryKeyWithBLOBs(EduCourse record);

    int updateByPrimaryKey(EduCourse record);
}