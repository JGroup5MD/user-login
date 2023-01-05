package org.example.controllers.web.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.Locale;
@WebFilter(urlPatterns = {"/views/*"})
public class FiltrConect implements Filter {
    private FilterConfig config=null;
    private boolean active=false;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config=config;
        String act=config.getInitParameter("active");
        if(act!=null){
            active=(act.toUpperCase(Locale.ROOT).equals("TRUE"));
        }
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    }

    @Override
    public void destroy() {

    }
}
