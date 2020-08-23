package com.markets.car.demo.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "customer_rented_cars")
public class CustomerRentedCarsEntity extends CommonEntityFields {
//    id BIGSERIAL PRIMARY KEY,
//    customer_id BIGINT REFERENCES customers(id) ON DELETE CASCADE,
//    car_id BIGINT REFERENCES cars_meta(id) ON DELETE CASCADE,
//    start_time TIMESTAMP,
//    end_time TIMESTAMP,
//    deleted VARCHAR (255),
//    created_at TIMESTAMP ,
//    updated_at TIMESTAMP
    @Id
    private long id;
    private long customer_id;
    private long car_id;
    private Timestamp startTime;
    private Timestamp endTime;
}
