package cn.edu.dao;

import cn.edu.pojo.EduPraise;
import cn.edu.pojo.EduPraiseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduPraiseMapper {
    long countByExample(EduPraiseExample example);

    int deleteByExample(EduPraiseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduPraise record);

    int insertSelective(EduPraise record);

    List<EduPraise> selectByExample(EduPraiseExample example);

    EduPraise selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduPraise record, @Param("example") EduPraiseExample example);

    int updateByExample(@Param("record") EduPraise record, @Param("example") EduPraiseExample example);

    int updateByPrimaryKeySelective(EduPraise record);

    int updateByPrimaryKey(EduPraise record);
}