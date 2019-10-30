package cn.edu.dao;

import cn.edu.pojo.Eduquestions;
import cn.edu.pojo.EduquestionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduquestionsMapper {
    long countByExample(EduquestionsExample example);

    int deleteByExample(EduquestionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Eduquestions record);

    int insertSelective(Eduquestions record);

    List<Eduquestions> selectByExampleWithBLOBs(EduquestionsExample example);

    List<Eduquestions> selectByExample(EduquestionsExample example);

    Eduquestions selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Eduquestions record, @Param("example") EduquestionsExample example);

    int updateByExampleWithBLOBs(@Param("record") Eduquestions record, @Param("example") EduquestionsExample example);

    int updateByExample(@Param("record") Eduquestions record, @Param("example") EduquestionsExample example);

    int updateByPrimaryKeySelective(Eduquestions record);

    int updateByPrimaryKeyWithBLOBs(Eduquestions record);

    int updateByPrimaryKey(Eduquestions record);
}