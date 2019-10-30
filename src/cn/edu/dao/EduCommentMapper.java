package cn.edu.dao;

import cn.edu.pojo.EduComment;
import cn.edu.pojo.EduCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduCommentMapper {
    long countByExample(EduCommentExample example);

    int deleteByExample(EduCommentExample example);

    int deleteByPrimaryKey(Integer commentid);

    int insert(EduComment record);

    int insertSelective(EduComment record);

    List<EduComment> selectByExample(EduCommentExample example);

    EduComment selectByPrimaryKey(Integer commentid);

    int updateByExampleSelective(@Param("record") EduComment record, @Param("example") EduCommentExample example);

    int updateByExample(@Param("record") EduComment record, @Param("example") EduCommentExample example);

    int updateByPrimaryKeySelective(EduComment record);

    int updateByPrimaryKey(EduComment record);
}