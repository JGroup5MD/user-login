package controllers;

import service.api.IUserService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name = "ExistingUsersServlet", urlPatterns = "/api/user")
public class ExistingUsersServlet extends HttpServlet {
    private final IUserService service;

    public ExistingUsersServlet(){
        this.service = UserServiceSingleton.getInstance();
    }
}