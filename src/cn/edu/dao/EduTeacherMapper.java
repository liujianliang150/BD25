package cn.edu.dao;

import cn.edu.pojo.EduTeacher;
import cn.edu.pojo.EduTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduTeacherMapper {
    long countByExample(EduTeacherExample example);

    int deleteByExample(EduTeacherExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduTeacher record);

    int insertSelective(EduTeacher record);

    List<EduTeacher> selectByExampleWithBLOBs(EduTeacherExample example);

    List<EduTeacher> selectByExample(EduTeacherExample example);

    EduTeacher selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduTeacher record, @Param("example") EduTeacherExample example);

    int updateByExampleWithBLOBs(@Param("record") EduTeacher record, @Param("example") EduTeacherExample example);

    int updateByExample(@Param("record") EduTeacher record, @Param("example") EduTeacherExample example);

    int updateByPrimaryKeySelective(EduTeacher record);

    int updateByPrimaryKeyWithBLOBs(EduTeacher record);

    int updateByPrimaryKey(EduTeacher record);
}