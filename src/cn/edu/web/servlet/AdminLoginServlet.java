package cn.edu.web.servlet;

import cn.edu.service.SysUserService;
import cn.edu.service.SysUserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Classname ${NAME}
 * @Auther: 周小龙
 * @Description TODO
 * @Date 2019/10/28 11:49
 * @Created by Administrator
 */
@WebServlet(name = "AdminLoginServlet", urlPatterns = "/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //接收登录页面传过来的信息
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //输出一下，便于查错
        System.out.println("username是" + username);
        System.out.println("password是" + password);
        //获取路径
        String path = request.getContextPath();
        //实例化service，用于操作
        SysUserService sus = new SysUserServiceImpl();
        //判断数据库是否有这个userName和password
        boolean b = sus.canOrNotLogin(username, password);
        //在控制台输出一下，便于查错
        System.out.println("数据库中是否存在该账户密码  " + b);
        //获取session，便于传值
        HttpSession session = request.getSession();
        if (b) {
            //在session里面传入userName，用于在登录成功后显示到页面
            session.setAttribute("username", username);
            //输出一下，看看session是啥
            System.out.println("servlet里面的session为：" + session.getAttribute("username"));
            //登录成功，重定向到admin目录下
            response.sendRedirect(path + "/admin/jsp02/welcome.jsp");
        } else {
            //如果密码错误导致不能登录，就在转发或者重定向到登录页面，注意重定向需要在前面加上path，转发不用  这里两种方式都阔以，但是只留一种
//            request.setAttribute("fool","用户名和密码不匹配，请重新输入");
//            request.getRequestDispatcher("/adminLogin.jsp").forward(request,response);
            //在session里面放入值，重定向到登录页面，提示用户输入错误
            session.setAttribute("fool", "用户名和密码不匹配，请重新输入");
            response.sendRedirect(path + "/adminLogin.jsp");
        }
    }
}
