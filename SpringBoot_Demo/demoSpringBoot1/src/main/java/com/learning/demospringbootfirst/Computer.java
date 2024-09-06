package com.learning.demospringbootfirst;

import org.springframework.stereotype.Component;

@Component
public class Computer {
    public void compile()
    {
        System.out.println("Computer is compiling the code...");
    }
}
