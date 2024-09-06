package com.learning.Models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") //new object will be created every time we call getBean()
public class Laptop {
    public Laptop()
    {
        System.out.println("Laptop object created");
    }
}
