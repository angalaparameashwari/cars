package com.markets.car.demo.api_mapper;

import com.markets.car.demo.api_models.cars.CarApiModel;
import com.markets.car.demo.api_models.cars.CreateCarApiModel;
import com.tej.JooQDemo.jooq.sample.model.tables.records.CarsMetaRecord;
import com.tej.JooQDemo.jooq.sample.model.tables.records.CarsRecord;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Component
public class CarMapper extends ApiMapper{
    public CarApiModel recordToApiModel(CarsRecord carsRecord, CarsMetaRecord carsMetaRecord) {
        CarApiModel carApiModel = new CarApiModel();
        carApiModel.setId(carsMetaRecord.getExternalId());
        carApiModel.setBrand(carsMetaRecord.getBrand());
        carApiModel.setModel(carsMetaRecord.getModel());
//        carApiModel.setFeatures(carsMetaRecord.getModetFeatures());
        carApiModel.setRegistrationNo(carsRecord.getRegistrationNo());
        carApiModel.setEngineNo(carsRecord.getEngineNo());
        carApiModel.setRentable(carsRecord.getIsRentable());
        carApiModel.setDeleted(carsMetaRecord.getDeleted());
        carApiModel.setCreatedAt(localDateTimeToEpoch(carsMetaRecord.getCreatedAt()));
        carApiModel.setUpdatedAt(localDateTimeToEpoch(carsMetaRecord.getUpdatedAt()));
        return carApiModel;
    }

    public CarsRecord createApiToCarRecord(CreateCarApiModel carApi) {
        LocalDateTime currentTime = LocalDateTime.now();
        CarsRecord record = new CarsRecord();
        record.setRegistrationNo(carApi.getRegistrationNo());
        record.setEngineNo(carApi.getEngineNo());
        record.setIsRentable(carApi.isRentable());
        record.setCreatedAt(currentTime);
        record.setUpdatedAt(currentTime);
        return record;
    }

    public CarsMetaRecord createApiToCarMetaRecord(CreateCarApiModel carApi) {
        LocalDateTime currentTime = LocalDateTime.now();
        CarsMetaRecord record = new CarsMetaRecord();
        record.setBrand(carApi.getBrand());
        record.setModel(carApi.getModel());
//            record.setFeatures(JSON.valueOf(carApi.getFeatures()));
        record.setExternalId(carApi.getId());
        record.setCreatedAt(currentTime);
        record.setUpdatedAt(currentTime);
        return record;
    }
}

