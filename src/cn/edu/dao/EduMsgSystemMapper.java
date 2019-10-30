package cn.edu.dao;

import cn.edu.pojo.EduMsgSystem;
import cn.edu.pojo.EduMsgSystemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduMsgSystemMapper {
    long countByExample(EduMsgSystemExample example);

    int deleteByExample(EduMsgSystemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduMsgSystem record);

    int insertSelective(EduMsgSystem record);

    List<EduMsgSystem> selectByExampleWithBLOBs(EduMsgSystemExample example);

    List<EduMsgSystem> selectByExample(EduMsgSystemExample example);

    EduMsgSystem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduMsgSystem record, @Param("example") EduMsgSystemExample example);

    int updateByExampleWithBLOBs(@Param("record") EduMsgSystem record, @Param("example") EduMsgSystemExample example);

    int updateByExample(@Param("record") EduMsgSystem record, @Param("example") EduMsgSystemExample example);

    int updateByPrimaryKeySelective(EduMsgSystem record);

    int updateByPrimaryKeyWithBLOBs(EduMsgSystem record);

    int updateByPrimaryKey(EduMsgSystem record);
}