package com.learning;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "home.jsp";
    }

    @RequestMapping("loginHandler")
    public String login(@RequestParam String username, Model model)
    {
        model.addAttribute("username", username);
        return "afterLogin.jsp";
    }
}
