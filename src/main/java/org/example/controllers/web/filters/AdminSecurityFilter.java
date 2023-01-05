package org.example.controllers.web.filters;

import org.example.DTO.LoginDTO;

import org.example.DTO.UserRole;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(urlPatterns = {"/ui/admin/*"})
public class AdminSecurityFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {HttpServletRequest request=(HttpServletRequest)servletRequest;
    HttpServletResponse response=(HttpServletResponse) servletResponse;
    String contexPath=request.getContextPath();
    HttpSession session=request.getSession();
    if(session!=null && session.getAttribute("user")!=null){
        LoginDTO user=(LoginDTO)session.getAttribute("user");
        if(user.getLogin().equals(UserRole.admin)){
            filterChain.doFilter(request,response);
        }else{
            response.sendRedirect(contexPath = "/ui/signIn");
        }
        response.sendRedirect(contexPath = "/ui/signIn");
        }
    }


    @Override
    public void destroy() {

    }
}
