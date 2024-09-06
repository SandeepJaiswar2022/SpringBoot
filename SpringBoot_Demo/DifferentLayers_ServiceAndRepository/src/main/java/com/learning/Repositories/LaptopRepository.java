package com.learning.Repositories;

import com.learning.Models.Laptop;
import org.springframework.stereotype.Repository;

//Repository layer is responsible for only the operation related to Databases.

@Repository
public class LaptopRepository {
    public void save(Laptop laptop) {
        System.out.println("Laptop saved in database.....");
    }
}
