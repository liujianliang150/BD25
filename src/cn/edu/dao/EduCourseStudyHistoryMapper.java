package cn.edu.dao;

import cn.edu.pojo.EduCourseStudyHistory;
import cn.edu.pojo.EduCourseStudyHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduCourseStudyHistoryMapper {
    long countByExample(EduCourseStudyHistoryExample example);

    int deleteByExample(EduCourseStudyHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduCourseStudyHistory record);

    int insertSelective(EduCourseStudyHistory record);

    List<EduCourseStudyHistory> selectByExampleWithBLOBs(EduCourseStudyHistoryExample example);

    List<EduCourseStudyHistory> selectByExample(EduCourseStudyHistoryExample example);

    EduCourseStudyHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduCourseStudyHistory record, @Param("example") EduCourseStudyHistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") EduCourseStudyHistory record, @Param("example") EduCourseStudyHistoryExample example);

    int updateByExample(@Param("record") EduCourseStudyHistory record, @Param("example") EduCourseStudyHistoryExample example);

    int updateByPrimaryKeySelective(EduCourseStudyHistory record);

    int updateByPrimaryKeyWithBLOBs(EduCourseStudyHistory record);

    int updateByPrimaryKey(EduCourseStudyHistory record);
}