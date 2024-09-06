package com.learning;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home()
    {
        return "home";
    }

    @RequestMapping("loginHandler")
    public String login(String username, String password, Model model)
    {
        model.addAttribute("username", username);
        model.addAttribute("password", password);
        return "afterLogin";
    }
}
