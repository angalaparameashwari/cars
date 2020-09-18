package com.markets.car.demo.services;

import com.markets.car.demo.api_models.cars.CarApiModel;
import com.markets.car.demo.api_models.cars.CreateCarApiModel;
import com.markets.car.demo.api_mapper.CarMapper;
import com.markets.car.demo.dao.CarMetaRepo;
import com.markets.car.demo.dao.CarRepo;
import com.markets.car.demo.ms_exceptions.GeneralException;
import com.tej.JooQDemo.jooq.sample.model.tables.records.CarsMetaRecord;
import com.tej.JooQDemo.jooq.sample.model.tables.records.CarsRecord;
import org.jooq.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class CarService {
    @Autowired
    private CarMapper mapper;
    @Autowired
    private CarRepo carRepo;
    @Autowired
    private CarMetaRepo carMetaRepo;


    public CarApiModel createCar(CreateCarApiModel apiModel) {
        CarsRecord record = mapper.createApiToCarRecord(apiModel);
        CarsMetaRecord carsMeta = mapper.createApiToCarMetaRecord(apiModel);
        carMetaRepo.insert(carsMeta);
        record.setCarId(carsMeta.getId());
        carRepo.insert(record);
        return mapper.recordToApiModel(record,carsMeta);
    }

    public CarApiModel getCar(String id){
        Record record = carMetaRepo.fetchWithCar(id);
        if(record ==  null){
            throw new GeneralException("not found");
        }
        CarsMetaRecord carsMeta = record.into(CarsMetaRecord.class);
        CarsRecord car = record.into(CarsRecord.class);
        return mapper.recordToApiModel(car,carsMeta);
    }
}
