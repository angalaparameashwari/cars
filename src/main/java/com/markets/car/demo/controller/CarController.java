package com.markets.car.demo.controller;

import com.markets.car.demo.apiModels.cars.ApiResponseModel;
import com.markets.car.demo.apiModels.cars.CarApiModel;
import com.markets.car.demo.apiModels.cars.CreateCarApiModel;
import com.markets.car.demo.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    @Autowired
    CarService carService;
    @PostMapping(path = "/cars")
    public ResponseEntity<CarApiModel> addCar(CreateCarApiModel carModel){
        CarApiModel car = carService.createCar(carModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(car);
    }

    @GetMapping(path = "/cars", params = {"id"})
    public ResponseEntity<CarApiModel> getCar(){
        return null;
    }
}
