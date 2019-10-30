package cn.edu.service;

import cn.edu.dao.EduCourseMapper;
import cn.edu.pojo.EduCourse;
import cn.edu.util.MyBatisUtil;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class EduCourseService {
    public List<EduCourse> getEduCourseList(String pageNo) {
        Integer integerPage = Integer.valueOf(pageNo);
        PageHelper.startPage(integerPage,5);
        SqlSession sqlSession = MyBatisUtil.createSqlSession();
        List<EduCourse> eduCourses = sqlSession.getMapper(EduCourseMapper.class).selectByExample();
        return eduCourses;
    }
}