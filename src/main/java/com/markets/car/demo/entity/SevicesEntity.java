package com.markets.car.demo.entity;

import org.jooq.JSON;

public class SevicesEntity extends CommonEntityFields {
//    id BIGSERIAL PRIMARY KEY,
//    external_id VARCHAR (255) NOT NULL,
//    brand VARCHAR (255) NOT NULL,
//    model VARCHAR (255),
//    name VARCHAR (255) ,
//    price INTEGER,
//   package json,
//    deleted VARCHAR (255),
//    created_at TIMESTAMP ,
//    updated_at TIMESTAMP
    private long id;
    private String externalId;
    private String brand;
    private String model;
    private String name;
    private int price;
    private JSON packages;
}
