package cn.edu.dao;

import cn.edu.pojo.EduQuestionsTagRelation;
import cn.edu.pojo.EduQuestionsTagRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduQuestionsTagRelationMapper {
    long countByExample(EduQuestionsTagRelationExample example);

    int deleteByExample(EduQuestionsTagRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduQuestionsTagRelation record);

    int insertSelective(EduQuestionsTagRelation record);

    List<EduQuestionsTagRelation> selectByExample(EduQuestionsTagRelationExample example);

    EduQuestionsTagRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduQuestionsTagRelation record, @Param("example") EduQuestionsTagRelationExample example);

    int updateByExample(@Param("record") EduQuestionsTagRelation record, @Param("example") EduQuestionsTagRelationExample example);

    int updateByPrimaryKeySelective(EduQuestionsTagRelation record);

    int updateByPrimaryKey(EduQuestionsTagRelation record);
}