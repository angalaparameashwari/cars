package com.markets.car.demo.apiModels.cars.apiMapper;

public interface ApiMapper<T,R>{
    T create(R record);
}

