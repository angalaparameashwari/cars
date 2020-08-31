package com.markets.car.demo.services;

import com.markets.car.demo.apiModels.cars.CarApiModel;
import com.markets.car.demo.apiModels.cars.CreateCarApiModel;
import com.markets.car.demo.apiModels.cars.apiMapper.CarApiMapper;
import com.markets.car.demo.dao.CarRepo;
import com.markets.car.demo.dao.RepositoryInterface;
import com.markets.car.demo.db_mapper.CarDbMapper;
import com.markets.car.demo.db_mapper.DBMapper;
import com.tej.JooQDemo.jooq.sample.model.tables.records.CarsRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class CarService {
    @Autowired
    private CarDbMapper mapper;
    private CarApiMapper apiMapper;
    private CarRepo carRepo;

    public CarApiModel createCar(CreateCarApiModel apiModel) {
        //valida
        //
        //
        //

        CarsRecord record = mapper.createRecord(apiModel);
        carRepo.add(record);
        return apiMapper.create(record);
    }
}
