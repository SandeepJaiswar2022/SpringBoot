package com.learning;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexServlet {
    @RequestMapping("/index")
    public String index()
    {
        return "index.jsp";
    }
}
