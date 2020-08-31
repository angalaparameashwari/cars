package com.markets.car.demo.dao;

import com.markets.car.demo.apiModels.cars.CreateCarApiModel;
import com.markets.car.demo.db_mapper.CarDbMapper;
import com.tej.JooQDemo.jooq.sample.model.Tables;
import com.tej.JooQDemo.jooq.sample.model.tables.records.CarsRecord;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class CarRepo implements RepositoryInterface<CarsRecord> {
    @Autowired
    DSLContext context;

    @Transactional
    @Override
    public CarsRecord add(CarsRecord record) {
        record.insert();
        return null;
    }
}
