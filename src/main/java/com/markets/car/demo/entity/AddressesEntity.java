package com.markets.car.demo.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "addresses")
public class AddressesEntity extends CommonEntityFields {
//    id BIGSERIAL PRIMARY KEY,
//    customer_id BIGINT REFERENCES customers(id) ON DELETE CASCADE,
//    is_primary BOOL DEFAULT false ,
//    label VARCHAR (255),
//    first_name VARCHAR (255),
//    last_name VARCHAR (255) ,
//    email VARCHAR (255),
//    phone VARCHAR (255),
//    line1 VARCHAR (255),
//    line2 VARCHAR (255),
//    city VARCHAR (55),
//    stateName VARCHAR (55),
//    country VARCHAR (55),
//    zip_code VARCHAR (55),
//    deleted VARCHAR (255),
//    created_at TIMESTAMP ,
//    updated_at TIMESTAMP
    @Id
    private long id;
    private long customer_id;
    private boolean isPrimary;
    private String label;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String line1;
    private String line2;
    private String city;
    private String stateName;
    private String country;
    private String zipCode;
}
