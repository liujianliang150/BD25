package cn.edu.dao;

import cn.edu.pojo.EduUserLoginLog;
import cn.edu.pojo.EduUserLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduUserLoginLogMapper {
    long countByExample(EduUserLoginLogExample example);

    int deleteByExample(EduUserLoginLogExample example);

    int deleteByPrimaryKey(Integer logid);

    int insert(EduUserLoginLog record);

    int insertSelective(EduUserLoginLog record);

    List<EduUserLoginLog> selectByExample(EduUserLoginLogExample example);

    EduUserLoginLog selectByPrimaryKey(Integer logid);

    int updateByExampleSelective(@Param("record") EduUserLoginLog record, @Param("example") EduUserLoginLogExample example);

    int updateByExample(@Param("record") EduUserLoginLog record, @Param("example") EduUserLoginLogExample example);

    int updateByPrimaryKeySelective(EduUserLoginLog record);

    int updateByPrimaryKey(EduUserLoginLog record);
}