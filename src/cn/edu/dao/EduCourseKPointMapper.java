package cn.edu.dao;

import cn.edu.pojo.EduCourseKPoint;
import cn.edu.pojo.EduCourseKPointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduCourseKPointMapper {
    long countByExample(EduCourseKPointExample example);

    int deleteByExample(EduCourseKPointExample example);

    int deleteByPrimaryKey(Integer kpointid);

    int insert(EduCourseKPoint record);

    int insertSelective(EduCourseKPoint record);

    List<EduCourseKPoint> selectByExampleWithBLOBs(EduCourseKPointExample example);

    List<EduCourseKPoint> selectByExample(EduCourseKPointExample example);

    EduCourseKPoint selectByPrimaryKey(Integer kpointid);

    int updateByExampleSelective(@Param("record") EduCourseKPoint record, @Param("example") EduCourseKPointExample example);

    int updateByExampleWithBLOBs(@Param("record") EduCourseKPoint record, @Param("example") EduCourseKPointExample example);

    int updateByExample(@Param("record") EduCourseKPoint record, @Param("example") EduCourseKPointExample example);

    int updateByPrimaryKeySelective(EduCourseKPoint record);

    int updateByPrimaryKeyWithBLOBs(EduCourseKPoint record);

    int updateByPrimaryKey(EduCourseKPoint record);
}