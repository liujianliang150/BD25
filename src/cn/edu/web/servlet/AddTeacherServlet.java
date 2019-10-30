package cn.edu.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 周小龙
 * @version 1.0
 * @date 2019/10/30 10:44
 * @description
 */
@WebServlet(name = "AddTeacherServlet",urlPatterns = "/AddTeacherServlet")
public class AddTeacherServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("进入教师添加的servlet");

    }
}
