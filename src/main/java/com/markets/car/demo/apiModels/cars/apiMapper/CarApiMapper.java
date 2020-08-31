package com.markets.car.demo.apiModels.cars.apiMapper;

import com.markets.car.demo.apiModels.cars.CarApiModel;
import com.markets.car.demo.apiModels.cars.CreateCarApiModel;
import com.markets.car.demo.db_mapper.DBMapper;
import com.tej.JooQDemo.jooq.sample.model.tables.records.CarsRecord;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

public class CarApiMapper implements ApiMapper<CarApiModel,CarsRecord> {
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

    @Override
    public CarApiModel create(CarsRecord record) {
        CarApiModel carApi = new CarApiModel();
        carApi.setBrand((String) record.get("brand"));
        carApi.setModel((String) record.get("model"));
        return carApi;
    }
}

