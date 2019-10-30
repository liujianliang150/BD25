package cn.edu.dao;

import cn.edu.pojo.EduQuestionsTag;
import cn.edu.pojo.EduQuestionsTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduQuestionsTagMapper {
    long countByExample(EduQuestionsTagExample example);

    int deleteByExample(EduQuestionsTagExample example);

    int deleteByPrimaryKey(Integer questionstagid);

    int insert(EduQuestionsTag record);

    int insertSelective(EduQuestionsTag record);

    List<EduQuestionsTag> selectByExample(EduQuestionsTagExample example);

    EduQuestionsTag selectByPrimaryKey(Integer questionstagid);

    int updateByExampleSelective(@Param("record") EduQuestionsTag record, @Param("example") EduQuestionsTagExample example);

    int updateByExample(@Param("record") EduQuestionsTag record, @Param("example") EduQuestionsTagExample example);

    int updateByPrimaryKeySelective(EduQuestionsTag record);

    int updateByPrimaryKey(EduQuestionsTag record);
}