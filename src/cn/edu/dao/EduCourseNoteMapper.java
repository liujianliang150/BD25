package cn.edu.dao;

import cn.edu.pojo.EduCourseNote;
import cn.edu.pojo.EduCourseNoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduCourseNoteMapper {
    long countByExample(EduCourseNoteExample example);

    int deleteByExample(EduCourseNoteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduCourseNote record);

    int insertSelective(EduCourseNote record);

    List<EduCourseNote> selectByExampleWithBLOBs(EduCourseNoteExample example);

    List<EduCourseNote> selectByExample(EduCourseNoteExample example);

    EduCourseNote selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduCourseNote record, @Param("example") EduCourseNoteExample example);

    int updateByExampleWithBLOBs(@Param("record") EduCourseNote record, @Param("example") EduCourseNoteExample example);

    int updateByExample(@Param("record") EduCourseNote record, @Param("example") EduCourseNoteExample example);

    int updateByPrimaryKeySelective(EduCourseNote record);

    int updateByPrimaryKeyWithBLOBs(EduCourseNote record);

    int updateByPrimaryKey(EduCourseNote record);
}