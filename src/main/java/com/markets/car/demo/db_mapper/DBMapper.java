package com.markets.car.demo.db_mapper;

public interface DBMapper<T,R>{
    T createRecord(R entity);
}
