package cn.edu.web.servlet;

import cn.edu.service.SysUserService;
import cn.edu.service.SysUserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Classname ${NAME}
 * @Auther: 周小龙
 * @Description TODO
 * @Date 2019/10/28 10:40
 * @Created by Administrator
 */
@WebServlet(name = "AdminLoginDetectionServlet", urlPatterns = "/AdminLoginDetectionServlet")
public class AdminLoginDetectionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取登录框输入的登录名
        String loginName = request.getParameter("username");
        //实例化service，以便使用里面的方法
        SysUserService sus=new SysUserServiceImpl();
        //判断数据库里面是否有这个登录名
        boolean b = sus.selectByUserName(loginName);
        //将结果返回给登录页面的ajax
        response.getWriter().print(b);

    }
}
