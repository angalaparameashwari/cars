package com.markets.car.demo.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "cars")
public class CarsEntity extends CommonEntityFields {
//    id BIGSERIAL PRIMARY KEY,
//    car_id BIGINT REFERENCES cars_meta(id) ON DELETE CASCADE,
//    registration_no VARCHAR (55),
//    engine_no VARCHAR (55),
//    is_rentable BOOL DEFAULT false,
//    deleted VARCHAR (255),
//    created_at TIMESTAMP ,
    /* Car
  map  API ->        BUSINESS -> DAO
    CarApiInput -> Domainentities[5] -> convert tp DAO persit / dynamo
    CarApiRspone -y
     CarApiRsponv3e
      CarApiRsponev
    */
//    updated_at TIMESTAMP
    @Id
    private long id;
    private String carId;
    private String registrationNo;
    private String engineNo;
    private boolean isRentable;
}
