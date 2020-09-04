package com.markets.car.demo.api_mapper;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public abstract class ApiMapper{

    protected long localDateTimeToEpoch(LocalDateTime time){
       return time.toEpochSecond(ZoneOffset.UTC);
    }

}

