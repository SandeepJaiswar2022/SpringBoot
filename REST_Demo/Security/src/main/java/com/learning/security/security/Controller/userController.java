package com.learning.security.security.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {

    @GetMapping("/")
    public String Home()
    {
        return "Hello World";
    }

    @GetMapping("about")
    public String About()
    {
        return "Hello mr Sushil ";
    }
}
