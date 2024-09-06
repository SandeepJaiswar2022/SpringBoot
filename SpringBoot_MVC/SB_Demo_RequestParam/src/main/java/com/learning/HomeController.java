package com.learning;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home()
    {
      return "home.jsp";
    }

    @RequestMapping("login")
     //RequestParam is an annotation of SpringBoot framework which is used to get
     //the request parameter from the "form"
     // same as
    //loginHandler(HttpServletRequest request)
    // String uName = HttpServletRequest.getParameter("username");

    //public String loginHandler(@RequestParam String username, @RequestParam String password, HttpSession session)
    //public String loginHandler(@RequestParam("username") String uName, @RequestParam("password") String uPass, HttpSession session)
   // public String loginHandler(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session)
    public String loginHandler(String username, String password, HttpSession session)
    {
        session.setAttribute("username", username);
        session.setAttribute("password", password);
        return "afterLogin.jsp";
    }
}
