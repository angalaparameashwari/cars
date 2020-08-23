package com.markets.car.demo.entity;

import java.sql.Timestamp;

public class ServicesAvailedEntity extends CommonEntityFields{
//    id BIGSERIAL PRIMARY KEY,
//    customer_id BIGINT REFERENCES customers(id) ON DELETE CASCADE,
//    car_id BIGINT REFERENCES services(id) ON DELETE CASCADE,
//    start_time TIMESTAMP,
//    end_time TIMESTAMP,
//    deleted VARCHAR ( 255 ),
//    created_at TIMESTAMP ,
//    updated_at TIMESTAMP
    private long id;
    private long customer_idd;
    private long car_id;
    private Timestamp startTime;
    private Timestamp endTime;
}
