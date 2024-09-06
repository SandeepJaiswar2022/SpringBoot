package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoBasicAnnotationsApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootDemoBasicAnnotationsApplication.class, args);
        Alien alien = context.getBean(Alien.class);
        System.out.println(alien.getAge());
        alien.code();
    }

}
