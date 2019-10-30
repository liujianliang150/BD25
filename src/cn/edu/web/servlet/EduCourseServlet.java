package cn.edu.web.servlet;

import cn.edu.dao.EduCourseMapper;
import cn.edu.pojo.EduCourse;
import cn.edu.service.EduCourseService;
import cn.edu.util.MyBatisUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

@WebServlet(name = "EduCourseServlet", urlPatterns = "/EduCourseServlet")
public class EduCourseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pageNo = request.getParameter("pageNo");
        //Integer integerPage = Integer.valueOf(pageNo);
        //PageHelper.startPage(integerPage,5);
        //SqlSession sqlSession = MyBatisUtil.createSqlSession();
        //List<EduCourse> eduCourses = sqlSession.getMapper(EduCourseMapper.class).selectByExample();
        List<EduCourse> eduCourseList = new EduCourseService().getEduCourseList(pageNo);
        PageInfo<EduCourse> pageInfo = new PageInfo<>(eduCourseList);
        HashMap<String, Object> map = new HashMap<>();
        map.put("list",eduCourseList);
        map.put("total", pageInfo.getTotal());//获取数据总数
        map.put("size", pageInfo.getPageSize());//获取长度
        map.put("page", pageInfo.getPageNum());//获取当前页数
        System.out.println(JSON.toJSON(map));
        response.getWriter().print(JSON.toJSON(map));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
