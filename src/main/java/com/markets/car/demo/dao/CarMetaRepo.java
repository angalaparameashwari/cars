package com.markets.car.demo.dao;

import com.tej.JooQDemo.jooq.sample.model.Tables;
import com.tej.JooQDemo.jooq.sample.model.tables.CarsMeta;
import com.tej.JooQDemo.jooq.sample.model.tables.records.CarsMetaRecord;
import com.tej.JooQDemo.jooq.sample.model.tables.records.CarsRecord;
import org.springframework.stereotype.Component;

@Component
public class CarMetaRepo extends RepositoryInterface{

    public CarsMetaRecord fetch(String id){
        CarsMetaRecord carsMetaRecord = context.selectFrom(Tables.CARS_META)
                .where(CarsMeta.CARS_META.EXTERNAL_ID.equal(id))
                .fetchOne();
        return carsMetaRecord;
    }
}
