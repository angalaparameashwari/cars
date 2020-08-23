package com.markets.car.demo.entity;


import lombok.*;
import org.jooq.JSON;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "cars_meta")
public class CarsMetaEntity extends CommonEntityFields {
//    id BIGSERIAL PRIMARY KEY,
//    external_id VARCHAR (255) NOT NULL,
//    brand VARCHAR (255) NOT NULL,
//    model VARCHAR (255) ,
//    features json ,
//    deleted VARCHAR (255),
//    created_at TIMESTAMP ,
//    updated_at TIMESTAMP
    @Id
    private long id;
    private String externalId;
    private String brand;
    private String model;
    private JSON features;
}
