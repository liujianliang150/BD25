package cn.edu.dao;

import cn.edu.pojo.EduEmailSendHistory;
import cn.edu.pojo.EduEmailSendHistoryExample;
import cn.edu.pojo.EduEmailSendHistoryWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduEmailSendHistoryMapper {
    long countByExample(EduEmailSendHistoryExample example);

    int deleteByExample(EduEmailSendHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduEmailSendHistoryWithBLOBs record);

    int insertSelective(EduEmailSendHistoryWithBLOBs record);

    List<EduEmailSendHistoryWithBLOBs> selectByExampleWithBLOBs(EduEmailSendHistoryExample example);

    List<EduEmailSendHistory> selectByExample(EduEmailSendHistoryExample example);

    EduEmailSendHistoryWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduEmailSendHistoryWithBLOBs record, @Param("example") EduEmailSendHistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") EduEmailSendHistoryWithBLOBs record, @Param("example") EduEmailSendHistoryExample example);

    int updateByExample(@Param("record") EduEmailSendHistory record, @Param("example") EduEmailSendHistoryExample example);

    int updateByPrimaryKeySelective(EduEmailSendHistoryWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EduEmailSendHistoryWithBLOBs record);

    int updateByPrimaryKey(EduEmailSendHistory record);
}