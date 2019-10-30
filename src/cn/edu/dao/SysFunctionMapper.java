package cn.edu.dao;

import cn.edu.pojo.SysFunction;
import cn.edu.pojo.SysFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFunctionMapper {
    long countByExample(SysFunctionExample example);

    int deleteByExample(SysFunctionExample example);

    int deleteByPrimaryKey(Integer functionid);

    int insert(SysFunction record);

    int insertSelective(SysFunction record);

    List<SysFunction> selectByExample(SysFunctionExample example);

    SysFunction selectByPrimaryKey(Integer functionid);

    int updateByExampleSelective(@Param("record") SysFunction record, @Param("example") SysFunctionExample example);

    int updateByExample(@Param("record") SysFunction record, @Param("example") SysFunctionExample example);

    int updateByPrimaryKeySelective(SysFunction record);

    int updateByPrimaryKey(SysFunction record);
}