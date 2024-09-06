package com.learning;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginServlet {
    @RequestMapping("/home")
    public String home() {
        return "login.jsp";
    }

    @RequestMapping("login")
    public String afterLogin(HttpServletRequest request, HttpSession session)
    {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
//        System.out.println("username: " + username);
//        System.out.println("password: " + password);
        session.setAttribute("username", username);
        session.setAttribute("password", password);
        return "afterLogin.jsp";
    }
}
