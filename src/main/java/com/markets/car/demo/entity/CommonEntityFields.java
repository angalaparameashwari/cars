package com.markets.car.demo.entity;

import lombok.*;

import javax.persistence.Entity;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class CommonEntityFields {
    private String deleted;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
