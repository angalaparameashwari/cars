package com.markets.car.demo.apiModels.cars;

import lombok.*;
import org.jooq.tools.json.JSONObject;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateCarApiModel extends ApiModel {
    private String externalId;
    private String brand;
    private String model;
    private JSONObject features;
    private String registrationNo;
    private String engineNo;
    private boolean isRentable;
}
