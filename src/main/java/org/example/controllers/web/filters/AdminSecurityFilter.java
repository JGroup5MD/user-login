package org.example.controllers.web.filters;

import org.example.DTO.UserAndRoleRegistration;
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
    public void destroy() {

    }


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        String contextPath = req.getContextPath();
        HttpSession session = req.getSession();
        UserAndRoleRegistration user = (UserAndRoleRegistration) session.getAttribute(USER_NAME);
        if ((session != null) && (user != null) && (user.getRole() == UserRole.admin)) {
           filterChain.doFilter(req, resp);
        } else {
            resp.sendRedirect(contextPath+"/ui/singIn");
       }
    }
}
