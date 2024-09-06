package com.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    private int age;
    private Computer computer;

    public Alien()
    {
        System.out.println("Alien Object Created");
    }
    public int getAge() {
        return age;
    }

    @Value("26")
    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    @Autowired
    @Qualifier("desktop")
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void code()
    {
        System.out.print("Alien is coding ");
        computer.compile();
    }
}
