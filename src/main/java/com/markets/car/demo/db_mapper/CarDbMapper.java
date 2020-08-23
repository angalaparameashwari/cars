package com.markets.car.demo.db_mapper;

import com.markets.car.demo.apiModels.cars.CreateCarApiModel;
import com.markets.car.demo.entity.CarsEntity;
import com.tej.JooQDemo.jooq.sample.model.tables.records.CarsRecord;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Component
public class CarDbMapper implements DBMapper<CarsRecord, CreateCarApiModel>{
     public CarsRecord createRecord(CreateCarApiModel carApi) {
         LocalDateTime currentTime = LocalDateTime.now();
        CarsRecord record = new CarsRecord();
        record.setRegistrationNo(carApi.getRegistrationNo());
        record.setEngineNo(carApi.getEngineNo());
        record.setIsRentable(carApi.isRentable());
        record.setCreatedAt(currentTime);
        record.setUpdatedAt(currentTime);
        return record;
    }
}
