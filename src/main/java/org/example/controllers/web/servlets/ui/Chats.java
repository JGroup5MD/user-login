package org.example.controllers.web.servlets.ui;

import org.example.DTO.UserAndRoleRegistration;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(name = "Chats", urlPatterns = "/ui/user/chats")
public class Chats extends HttpServlet {



    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
       HttpSession session = request.getSession();

        UserAndRoleRegistration receiver = (UserAndRoleRegistration) session.getAttribute("user");
        request.setAttribute("receiver", receiver);

        request.getRequestDispatcher("/jsp/message/chats.jsp").forward(request, response);
}
    }
