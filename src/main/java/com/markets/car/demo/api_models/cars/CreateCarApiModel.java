package com.markets.car.demo.api_models.cars;

import com.markets.car.demo.api_models.ApiModel;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateCarApiModel extends ApiModel implements Serializable {
    private String id;
    private String brand;
    private String model;
//    private String features;
    private String registrationNo;
    private String engineNo;
    private boolean isRentable;
}
