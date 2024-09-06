package com.learning;

import com.learning.Models.Laptop;
import com.learning.Services.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DifferentLayersServiceAndRepositoryApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DifferentLayersServiceAndRepositoryApplication.class, args);
        LaptopService laptopService = context.getBean(LaptopService.class);
        Laptop laptop = context.getBean(Laptop.class);
        laptopService.addLaptopInDatabase(laptop);
        System.out.println("Is it good for coding : "+ laptopService.isGoodForCoding(laptop));
    }

}
