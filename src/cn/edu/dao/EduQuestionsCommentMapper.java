package cn.edu.dao;

import cn.edu.pojo.EduQuestionsComment;
import cn.edu.pojo.EduQuestionsCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduQuestionsCommentMapper {
    long countByExample(EduQuestionsCommentExample example);

    int deleteByExample(EduQuestionsCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduQuestionsComment record);

    int insertSelective(EduQuestionsComment record);

    List<EduQuestionsComment> selectByExample(EduQuestionsCommentExample example);

    EduQuestionsComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduQuestionsComment record, @Param("example") EduQuestionsCommentExample example);

    int updateByExample(@Param("record") EduQuestionsComment record, @Param("example") EduQuestionsCommentExample example);

    int updateByPrimaryKeySelective(EduQuestionsComment record);

    int updateByPrimaryKey(EduQuestionsComment record);
}