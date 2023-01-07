package web.controllers.filters;


import web.dto.LoginDto;
import web.dto.Role;

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
        LoginDto user=(LoginDto)session.getAttribute("user");
        if(user.getLogin().equals(Role.ADMIN)){
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
