package com.markets.car.demo.dao;

import com.markets.car.demo.apiModels.cars.ApiModel;
import com.markets.car.demo.entity.CommonEntityFields;
import org.jooq.Record;
import org.jooq.Record8;
import org.jooq.impl.UpdatableRecordImpl;

public interface RepositoryInterface<T extends Record8> {
        public T add(T entry);
}
