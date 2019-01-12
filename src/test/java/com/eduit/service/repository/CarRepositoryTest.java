package com.eduit.service.repository;


import com.eduit.service.ServiceApplication;
import com.eduit.service.model.Car;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CarRepositoryTest {

    @Autowired
    private CarRepository carRepository;

    @Test
    public void aaaaaaa(){

        Optional<Car> carOpc = carRepository.findById(1L);

        Assert.assertEquals(true,carOpc.isPresent());


    }



}
