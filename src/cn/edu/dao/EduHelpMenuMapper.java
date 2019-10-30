package cn.edu.dao;

import cn.edu.pojo.EduHelpMenu;
import cn.edu.pojo.EduHelpMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduHelpMenuMapper {
    long countByExample(EduHelpMenuExample example);

    int deleteByExample(EduHelpMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduHelpMenu record);

    int insertSelective(EduHelpMenu record);

    List<EduHelpMenu> selectByExampleWithBLOBs(EduHelpMenuExample example);

    List<EduHelpMenu> selectByExample(EduHelpMenuExample example);

    EduHelpMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduHelpMenu record, @Param("example") EduHelpMenuExample example);

    int updateByExampleWithBLOBs(@Param("record") EduHelpMenu record, @Param("example") EduHelpMenuExample example);

    int updateByExample(@Param("record") EduHelpMenu record, @Param("example") EduHelpMenuExample example);

    int updateByPrimaryKeySelective(EduHelpMenu record);

    int updateByPrimaryKeyWithBLOBs(EduHelpMenu record);

    int updateByPrimaryKey(EduHelpMenu record);
}