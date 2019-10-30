package cn.edu.dao;

import cn.edu.pojo.EduMsgReceive;
import cn.edu.pojo.EduMsgReceiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduMsgReceiveMapper {
    long countByExample(EduMsgReceiveExample example);

    int deleteByExample(EduMsgReceiveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduMsgReceive record);

    int insertSelective(EduMsgReceive record);

    List<EduMsgReceive> selectByExampleWithBLOBs(EduMsgReceiveExample example);

    List<EduMsgReceive> selectByExample(EduMsgReceiveExample example);

    EduMsgReceive selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduMsgReceive record, @Param("example") EduMsgReceiveExample example);

    int updateByExampleWithBLOBs(@Param("record") EduMsgReceive record, @Param("example") EduMsgReceiveExample example);

    int updateByExample(@Param("record") EduMsgReceive record, @Param("example") EduMsgReceiveExample example);

    int updateByPrimaryKeySelective(EduMsgReceive record);

    int updateByPrimaryKeyWithBLOBs(EduMsgReceive record);

    int updateByPrimaryKey(EduMsgReceive record);
}