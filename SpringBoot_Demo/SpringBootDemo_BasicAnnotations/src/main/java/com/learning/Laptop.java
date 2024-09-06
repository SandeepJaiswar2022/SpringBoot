package com.learning;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer{
    public Laptop()
    {
        System.out.println("Laptop object created");
    }
    public void compile()
    {
        System.out.println("using Desktop.....");
    }
}
