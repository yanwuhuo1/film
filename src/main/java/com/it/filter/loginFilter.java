package com.it.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
//登入注册过滤器
@WebFilter(filterName = "filter.Filter")
public class loginFilter implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {


        String[] urls={"/imgs/","/css/","//"};



        HttpServletRequest httpServletRequest= (HttpServletRequest) request;
        //判断session是否有user
        HttpSession session = httpServletRequest.getSession();
        Object user = session.getAttribute("user");
        //判断user是否为null
        if (user!=null){
            //登入过
            chain.doFilter(request, response);
        }else {
            //没有登入过，存储提示信息，跳转到登入页面
            request.setAttribute("login_msg","你尚未登入");
            request.getRequestDispatcher("登录页面").forward(request,response);
        }



    }
}
