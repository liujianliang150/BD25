package cn.edu.dao;

import cn.edu.pojo.EduStatisticsDay;
import cn.edu.pojo.EduStatisticsDayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduStatisticsDayMapper {
    long countByExample(EduStatisticsDayExample example);

    int deleteByExample(EduStatisticsDayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduStatisticsDay record);

    int insertSelective(EduStatisticsDay record);

    List<EduStatisticsDay> selectByExample(EduStatisticsDayExample example);

    EduStatisticsDay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduStatisticsDay record, @Param("example") EduStatisticsDayExample example);

    int updateByExample(@Param("record") EduStatisticsDay record, @Param("example") EduStatisticsDayExample example);

    int updateByPrimaryKeySelective(EduStatisticsDay record);

    int updateByPrimaryKey(EduStatisticsDay record);
}