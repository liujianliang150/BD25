package cn.edu.dao;

import cn.edu.pojo.EduMobileSendHistory;
import cn.edu.pojo.EduMobileSendHistoryExample;
import cn.edu.pojo.EduMobileSendHistoryWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduMobileSendHistoryMapper {
    long countByExample(EduMobileSendHistoryExample example);

    int deleteByExample(EduMobileSendHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduMobileSendHistoryWithBLOBs record);

    int insertSelective(EduMobileSendHistoryWithBLOBs record);

    List<EduMobileSendHistoryWithBLOBs> selectByExampleWithBLOBs(EduMobileSendHistoryExample example);

    List<EduMobileSendHistory> selectByExample(EduMobileSendHistoryExample example);

    EduMobileSendHistoryWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduMobileSendHistoryWithBLOBs record, @Param("example") EduMobileSendHistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") EduMobileSendHistoryWithBLOBs record, @Param("example") EduMobileSendHistoryExample example);

    int updateByExample(@Param("record") EduMobileSendHistory record, @Param("example") EduMobileSendHistoryExample example);

    int updateByPrimaryKeySelective(EduMobileSendHistoryWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EduMobileSendHistoryWithBLOBs record);

    int updateByPrimaryKey(EduMobileSendHistory record);
}