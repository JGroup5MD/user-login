package web.controllers.filters;

import web.service.api.ILoginService;
import web.service.fabrics.LoginServiceSingleton;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(urlPatterns = {"/ui/admin/*", "/api/admin/*"})
public class AdminSecurityFilter implements Filter {
    private final ILoginService loginService;

    public AdminSecurityFilter(){
        loginService = LoginServiceSingleton.getInstance();
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String contexPath = request.getContextPath();
        HttpSession session = request.getSession();

        if ((session != null) && (session.getAttribute("user") != null)) {
            String login = (String) session.getAttribute("user");
            if (loginService.isAdmin(login)) {
                filterChain.doFilter(request, response);
            } else {
                throw new ServletException("В доступе отказано. Вы не авторизованы для просмотра этой страницы");
            }

        } else {
            response.sendRedirect(contexPath = "/ui/signIn");
        }
    }

    @Override
    public void destroy() {

    }
}
