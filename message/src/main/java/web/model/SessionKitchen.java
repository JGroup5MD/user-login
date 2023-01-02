package web.model;

import web.dao.api.IUserDao;
import web.dto.LoginDto;
import web.service.LoginService;
import web.service.api.ILoginService;
import web.service.fabrics.LoginServiceSingleton;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionKitchen extends HttpServlet {

    private static ILoginService service;


    public static String getSessionValue(HttpServletRequest req, String LOGIN_PARAM_NAME) {

        String val = req.getParameter(LOGIN_PARAM_NAME);

            if (val == null) {
                HttpSession session = req.getSession();

                if (!session.isNew()) {
                    val = (String) session.getAttribute(LOGIN_PARAM_NAME);
                }
            }


        return val;
    }
        public static void saveSession(HttpServletRequest req, String LOGIN_PARAM_NAME, String val){
            HttpSession session = req.getSession();
            session.setAttribute(LOGIN_PARAM_NAME, val);

        }

}
