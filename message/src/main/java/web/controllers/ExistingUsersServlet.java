package web.controllers;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/*
*Писала под админскую роль, которая может посмотреть, кто зарегистрирован в системе по get-запросу, в случае авторизации как админ
* */

@WebServlet(name = "ExistingUsersServlet", urlPatterns = "/api/existing_user")
public class ExistingUsersServlet extends HttpServlet {
//    private final IUserService service;

    public ExistingUsersServlet(){
  //      this.service = UserServiceSingleton.getInstance();
    }
}
