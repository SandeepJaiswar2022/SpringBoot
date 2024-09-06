package com.learning;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    public Desktop()
    {
        System.out.println("Desktop object created");
    }
    public void compile()
    {
        System.out.println("using Desktop.....");
    }
}
