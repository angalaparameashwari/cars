package com.markets.car.demo.apiModels.cars;

import lombok.*;
import org.jooq.JSON;
import org.jooq.tools.json.JSONObject;
import java.sql.Timestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarApiModel extends ApiResponseModel{
    private long id;
    private String externalId;
    private String brand;
    private String model;
    private JSONObject features;
    private String registrationNo;
    private String engineNo;
    private boolean isRentable;
    private String deleted;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
