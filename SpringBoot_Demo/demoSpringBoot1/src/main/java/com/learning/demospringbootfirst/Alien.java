package com.learning.demospringbootfirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Autowired
    Computer computer;
    public void code()
    {
        computer.compile();
        //System.out.println("Coding here in this world...");
    }
}






