package org.example.controllers.web.servlets;

import org.example.DTO.ActivUserSession;
import org.example.DTO.UserDTO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ActivUserSessionServlet extends HttpServlet {
    private final ActivUserSession as;
    private final UserDTO dto;

    public ActivUserSessionServlet(ActivUserSession as, UserDTO dto) {
        this.as = as;
        this.dto = dto;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("txt/html; charset=UTF-8");
        PrintWriter writer=resp.getWriter();
        String password=req.getParameter(as.getPassword());
        String login=req.getParameter(as.getLogin());

        if (password.equals(dto.getPassword()) && login.equals(dto.getLogin())){
            writer.write("user: " + as.getRole() + as.getTimeStartSession()) ;
        }
    }
}
