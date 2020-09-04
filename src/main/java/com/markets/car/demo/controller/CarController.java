package com.markets.car.demo.controller;

import com.markets.car.demo.api_models.cars.CarApiModel;
import com.markets.car.demo.api_models.cars.CreateCarApiModel;
import com.markets.car.demo.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarController {
    @Autowired
    CarService carService;

    @Transactional
    @PostMapping(path = "/cars")
    public ResponseEntity<CarApiModel> addCar(@RequestBody CreateCarApiModel carModel){
        CarApiModel car = carService.createCar(carModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(car);
    }

    @GetMapping(path = "/cars/{id}")
    public ResponseEntity<CarApiModel> getCar(@PathVariable String id){
        CarApiModel car = carService.getCar(id);
        return ResponseEntity.status(HttpStatus.FOUND).body(car);
    }
}
