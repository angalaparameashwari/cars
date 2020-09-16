package com.markets.car.demo.dao;

import com.tej.JooQDemo.jooq.sample.model.Tables;
import com.tej.JooQDemo.jooq.sample.model.tables.CarsMeta;
import org.jooq.Record;
import org.springframework.stereotype.Component;

@Component
public class CarMetaRepo extends RepositoryInterface{

    public Record fetchWithCar(String id){
        Record record = context.select().from(Tables.CARS_META)
                .join(Tables.CARS)
                .using(CarsMeta.CARS_META.ID)
                .where(CarsMeta.CARS_META.EXTERNAL_ID.equal(id))
                .fetchOne();
        return record;
    }
}
