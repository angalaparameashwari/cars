package com.markets.car.demo.entity;

import lombok.*;

import javax.persistence.Entity;
import java.sql.Timestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "sales")
public class SalesEntity extends CommonEntityFields {
//    id BIGSERIAL NOT NULL,
//    external_id VARCHAR (255) NOT NULL,
//    customer_id BIGINT REFERENCES customers(id) ON DELETE CASCADE,
//    car_id BIGINT REFERENCES cars_meta(id) ON DELETE CASCADE,
//    dates TIMESTAMP,
//    status VARCHAR ( 255 ),
//    created_at TIMESTAMP ,
//    updated_at TIMESTAMP
    private long id;
    private String externalId;
    private String customerId;
    private String carId;
    private Timestamp dates;
    private String status;
}
