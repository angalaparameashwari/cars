package com.markets.car.demo.controller;

import com.markets.car.demo.apiModels.cars.CarApiModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    @PostMapping
    public String addCar(CarApiModel carApiModel){
        return "200";
    }
}
