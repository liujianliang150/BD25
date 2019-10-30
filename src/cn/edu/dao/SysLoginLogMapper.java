package cn.edu.dao;

import cn.edu.pojo.SysLoginLog;
import cn.edu.pojo.SysLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLoginLogMapper {
    long countByExample(SysLoginLogExample example);

    int deleteByExample(SysLoginLogExample example);

    int deleteByPrimaryKey(Integer logid);

    int insert(SysLoginLog record);

    int insertSelective(SysLoginLog record);

    List<SysLoginLog> selectByExample(SysLoginLogExample example);

    SysLoginLog selectByPrimaryKey(Integer logid);

    int updateByExampleSelective(@Param("record") SysLoginLog record, @Param("example") SysLoginLogExample example);

    int updateByExample(@Param("record") SysLoginLog record, @Param("example") SysLoginLogExample example);

    int updateByPrimaryKeySelective(SysLoginLog record);

    int updateByPrimaryKey(SysLoginLog record);
}