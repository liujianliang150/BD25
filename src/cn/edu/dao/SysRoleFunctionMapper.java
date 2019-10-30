package cn.edu.dao;

import cn.edu.pojo.SysRoleFunction;
import cn.edu.pojo.SysRoleFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleFunctionMapper {
    long countByExample(SysRoleFunctionExample example);

    int deleteByExample(SysRoleFunctionExample example);

    int insert(SysRoleFunction record);

    int insertSelective(SysRoleFunction record);

    List<SysRoleFunction> selectByExample(SysRoleFunctionExample example);

    int updateByExampleSelective(@Param("record") SysRoleFunction record, @Param("example") SysRoleFunctionExample example);

    int updateByExample(@Param("record") SysRoleFunction record, @Param("example") SysRoleFunctionExample example);
}