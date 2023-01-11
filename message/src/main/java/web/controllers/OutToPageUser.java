package web.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet(name="OutToPageUser", urlPatterns = "/ui/Out")
public class OutToPageUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("URF-8");
        HttpSession session=req.getSession();
        if(session.getAttribute("user")!=null){
            session.invalidate();
        }
        req.getRequestDispatcher("/views/ui/main/hello.jsp").forward(req,resp);
    }
}
