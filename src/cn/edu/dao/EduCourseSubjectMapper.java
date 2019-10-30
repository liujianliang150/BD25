package cn.edu.dao;

import cn.edu.pojo.EduCourseSubject;
import cn.edu.pojo.EduCourseSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduCourseSubjectMapper {
    long countByExample(EduCourseSubjectExample example);

    int deleteByExample(EduCourseSubjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduCourseSubject record);

    int insertSelective(EduCourseSubject record);

    List<EduCourseSubject> selectByExample(EduCourseSubjectExample example);

    EduCourseSubject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduCourseSubject record, @Param("example") EduCourseSubjectExample example);

    int updateByExample(@Param("record") EduCourseSubject record, @Param("example") EduCourseSubjectExample example);

    int updateByPrimaryKeySelective(EduCourseSubject record);

    int updateByPrimaryKey(EduCourseSubject record);
}