/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sales implements Serializable {

    private static final long serialVersionUID = 2062584544;

    private Long          id;
    private String        externalId;
    private Long          customerId;
    private Long          carId;
    private LocalDateTime dates;
    private String        status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Sales() {}

    public Sales(Sales value) {
        this.id = value.id;
        this.externalId = value.externalId;
        this.customerId = value.customerId;
        this.carId = value.carId;
        this.dates = value.dates;
        this.status = value.status;
        this.createdAt = value.createdAt;
        this.updatedAt = value.updatedAt;
    }

    public Sales(
        Long          id,
        String        externalId,
        Long          customerId,
        Long          carId,
        LocalDateTime dates,
        String        status,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
    ) {
        this.id = id;
        this.externalId = externalId;
        this.customerId = customerId;
        this.carId = carId;
        this.dates = dates;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return this.id;
    }

    public Sales setId(Long id) {
        this.id = id;
        return this;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public Sales setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public Sales setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    public Long getCarId() {
        return this.carId;
    }

    public Sales setCarId(Long carId) {
        this.carId = carId;
        return this;
    }

    public LocalDateTime getDates() {
        return this.dates;
    }

    public Sales setDates(LocalDateTime dates) {
        this.dates = dates;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public Sales setStatus(String status) {
        this.status = status;
        return this;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public Sales setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public Sales setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Sales other = (Sales) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (externalId == null) {
            if (other.externalId != null)
                return false;
        }
        else if (!externalId.equals(other.externalId))
            return false;
        if (customerId == null) {
            if (other.customerId != null)
                return false;
        }
        else if (!customerId.equals(other.customerId))
            return false;
        if (carId == null) {
            if (other.carId != null)
                return false;
        }
        else if (!carId.equals(other.carId))
            return false;
        if (dates == null) {
            if (other.dates != null)
                return false;
        }
        else if (!dates.equals(other.dates))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        if (createdAt == null) {
            if (other.createdAt != null)
                return false;
        }
        else if (!createdAt.equals(other.createdAt))
            return false;
        if (updatedAt == null) {
            if (other.updatedAt != null)
                return false;
        }
        else if (!updatedAt.equals(other.updatedAt))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.externalId == null) ? 0 : this.externalId.hashCode());
        result = prime * result + ((this.customerId == null) ? 0 : this.customerId.hashCode());
        result = prime * result + ((this.carId == null) ? 0 : this.carId.hashCode());
        result = prime * result + ((this.dates == null) ? 0 : this.dates.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Sales (");

        sb.append(id);
        sb.append(", ").append(externalId);
        sb.append(", ").append(customerId);
        sb.append(", ").append(carId);
        sb.append(", ").append(dates);
        sb.append(", ").append(status);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);

        sb.append(")");
        return sb.toString();
    }
}
