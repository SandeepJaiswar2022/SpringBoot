package com.learning.demospringbootfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpringBoot1Application {

    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(DemoSpringBoot1Application.class, args);

       Alien alien = context.getBean(Alien.class);
       alien.code();
    }

}
