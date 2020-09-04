package com.markets.car.demo.api_models.cars;

import com.markets.car.demo.api_models.ApiModel;
import lombok.*;
import org.jooq.JSON;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarApiModel extends ApiModel {
    private String id;
    private String brand;
    private String model;
    private JSON features;
    private String registrationNo;
    private String engineNo;
    private boolean isRentable;
    private String deleted;
    private long createdAt;
    private long updatedAt;
}
