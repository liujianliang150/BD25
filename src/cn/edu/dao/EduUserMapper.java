package cn.edu.dao;

import cn.edu.pojo.EduUser;
import cn.edu.pojo.EduUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduUserMapper {
    long countByExample(EduUserExample example);

    int deleteByExample(EduUserExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(EduUser record);

    int insertSelective(EduUser record);

    List<EduUser> selectByExample(EduUserExample example);

    EduUser selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") EduUser record, @Param("example") EduUserExample example);

    int updateByExample(@Param("record") EduUser record, @Param("example") EduUserExample example);

    int updateByPrimaryKeySelective(EduUser record);

    int updateByPrimaryKey(EduUser record);
}