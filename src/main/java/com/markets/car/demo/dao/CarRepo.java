package com.markets.car.demo.dao;


import com.tej.JooQDemo.jooq.sample.model.Tables;
import com.tej.JooQDemo.jooq.sample.model.tables.Cars;
import com.tej.JooQDemo.jooq.sample.model.tables.records.CarsRecord;
import org.springframework.stereotype.Component;

@Component
public class CarRepo extends RepositoryInterface {

    public CarsRecord fetch(long id){
        return context.selectFrom(Tables.CARS)
                .where(Cars.CARS.CAR_ID.equal(id)).fetchOne();
    }

    // Multitenancy -> domains,
    /*
    name, id, status
     */


}
