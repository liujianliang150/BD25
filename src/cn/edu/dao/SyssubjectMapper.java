package cn.edu.dao;

import cn.edu.pojo.Syssubject;
import cn.edu.pojo.SyssubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyssubjectMapper {
    long countByExample(SyssubjectExample example);

    int deleteByExample(SyssubjectExample example);

    int deleteByPrimaryKey(Integer subjectid);

    int insert(Syssubject record);

    int insertSelective(Syssubject record);

    List<Syssubject> selectByExample(SyssubjectExample example);

    Syssubject selectByPrimaryKey(Integer subjectid);

    int updateByExampleSelective(@Param("record") Syssubject record, @Param("example") SyssubjectExample example);

    int updateByExample(@Param("record") Syssubject record, @Param("example") SyssubjectExample example);

    int updateByPrimaryKeySelective(Syssubject record);

    int updateByPrimaryKey(Syssubject record);
}