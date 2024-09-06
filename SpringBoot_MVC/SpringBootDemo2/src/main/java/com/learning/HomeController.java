package com.learning;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index()
    {
        return "index";
    }

    //Simple method(use of ModelAttribute
    @ModelAttribute("courses")
    public String courseName()
    {
        return "Java";
    }
    //In simple terms, it binds an HTML form's input fields
    // to the properties of a Java object.

//    @RequestMapping("loginServlet")
//    public ModelAndView afterLogin(@RequestParam String username, @RequestParam String password, ModelAndView mv)
//    {
//        mv.addObject("username", username);
//        mv.addObject("password", password);
//        mv.setViewName("afterLogin");
//        return mv;
//    }

    @RequestMapping("loginServlet")
    public String afterLogin(Identity id)
    {
        return "afterLogin";
    }
}
