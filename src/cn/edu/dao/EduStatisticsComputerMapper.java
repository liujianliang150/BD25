package cn.edu.dao;

import cn.edu.pojo.EduStatisticsComputer;
import cn.edu.pojo.EduStatisticsComputerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduStatisticsComputerMapper {
    long countByExample(EduStatisticsComputerExample example);

    int deleteByExample(EduStatisticsComputerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduStatisticsComputer record);

    int insertSelective(EduStatisticsComputer record);

    List<EduStatisticsComputer> selectByExample(EduStatisticsComputerExample example);

    EduStatisticsComputer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduStatisticsComputer record, @Param("example") EduStatisticsComputerExample example);

    int updateByExample(@Param("record") EduStatisticsComputer record, @Param("example") EduStatisticsComputerExample example);

    int updateByPrimaryKeySelective(EduStatisticsComputer record);

    int updateByPrimaryKey(EduStatisticsComputer record);
}