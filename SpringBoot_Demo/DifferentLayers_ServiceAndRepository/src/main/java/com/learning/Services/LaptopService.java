package com.learning.Services;

import com.learning.Models.Laptop;
import com.learning.Repositories.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Service layer of a model Laptop means what kind of operations we can perform
// on the laptop along with operations related to Database and others operations as well.

@Service
public class LaptopService {

    private LaptopRepository laptopRepository;

    @Autowired
    public void setLaptopRepository(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    public void addLaptopInDatabase(Laptop laptop)
    {
        laptopRepository.save(laptop);
    }
    public boolean isGoodForCoding(Laptop laptop)
    {
        return true;
    }
}
