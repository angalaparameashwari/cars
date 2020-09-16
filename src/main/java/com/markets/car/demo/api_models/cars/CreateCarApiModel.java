package com.markets.car.demo.api_models.cars;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("registraction_no")
    private String registrationNo;
    @JsonProperty("engine_no")
    private String engineNo;
    @JsonProperty("is_rentable")
    private boolean isRentable;
}
