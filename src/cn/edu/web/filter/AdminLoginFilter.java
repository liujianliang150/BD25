package cn.edu.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Classname ${NAME}
 * @Auther: 周小龙
 * @Description TODO
 * @Date 2019/10/28 8:44
 * @Created by Administrator
 */

@WebFilter(filterName = "AdminLoginFilter",urlPatterns = "/admin/jsp02/*")
public class AdminLoginFilter implements Filter {
    public void destroy() {
        System.out.println("*********拦截器销毁*************");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
//        chain.doFilter(req, resp);
        System.out.println("*************************过滤器执行过滤操作******************");
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session = request.getSession();
        String path = request.getContextPath();
        if (session.getAttribute("username")!=null){
            System.out.println("判断可进入admin文件夹");
            System.out.println("过滤器里session的userName是："+session.getAttribute("username"));
            chain.doFilter(request,response);
        }else{
            System.out.println("session里面的username为："+session.getAttribute("username"));
            response.sendRedirect(path+"/adminLogin.jsp");
            System.out.println(path+"/adminLogin.jsp");
        }
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("*************过滤器初始化***************");
    }

}
