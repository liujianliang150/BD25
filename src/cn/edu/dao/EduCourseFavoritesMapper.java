package cn.edu.dao;

import cn.edu.pojo.EduCourseFavorites;
import cn.edu.pojo.EduCourseFavoritesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduCourseFavoritesMapper {
    long countByExample(EduCourseFavoritesExample example);

    int deleteByExample(EduCourseFavoritesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduCourseFavorites record);

    int insertSelective(EduCourseFavorites record);

    List<EduCourseFavorites> selectByExample(EduCourseFavoritesExample example);

    EduCourseFavorites selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduCourseFavorites record, @Param("example") EduCourseFavoritesExample example);

    int updateByExample(@Param("record") EduCourseFavorites record, @Param("example") EduCourseFavoritesExample example);

    int updateByPrimaryKeySelective(EduCourseFavorites record);

    int updateByPrimaryKey(EduCourseFavorites record);
}