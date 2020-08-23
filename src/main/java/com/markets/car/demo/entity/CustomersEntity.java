package com.markets.car.demo.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "customers")
public class CustomersEntity extends CommonEntityFields{
//    id BIGSERIAL PRIMARY KEY,
//    external_id VARCHAR (255) NOT NULL,
//    first_name VARCHAR (255) NOT NULL,
//    last_name VARCHAR (255),
//    email VARCHAR (255),
//    phone VARCHAR (255),
//    deleted VARCHAR (255),
//    created_at TIMESTAMP ,
//    updated_at TIMESTAMP
    @Id
    private long id;
    private String externalId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}
