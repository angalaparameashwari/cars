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
public class Services implements Serializable {

    private static final long serialVersionUID = -952845051;

    private Long          id;
    private String        externalId;
    private String        brand;
    private String        model;
    private String        name;
    private Integer       price;
    private String        package_;
    private String        deleted;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Services() {}

    public Services(Services value) {
        this.id = value.id;
        this.externalId = value.externalId;
        this.brand = value.brand;
        this.model = value.model;
        this.name = value.name;
        this.price = value.price;
        this.package_ = value.package_;
        this.deleted = value.deleted;
        this.createdAt = value.createdAt;
        this.updatedAt = value.updatedAt;
    }

    public Services(
        Long          id,
        String        externalId,
        String        brand,
        String        model,
        String        name,
        Integer       price,
        String        package_,
        String        deleted,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
    ) {
        this.id = id;
        this.externalId = externalId;
        this.brand = brand;
        this.model = model;
        this.name = name;
        this.price = price;
        this.package_ = package_;
        this.deleted = deleted;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return this.id;
    }

    public Services setId(Long id) {
        this.id = id;
        return this;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public Services setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getBrand() {
        return this.brand;
    }

    public Services setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return this.model;
    }

    public Services setModel(String model) {
        this.model = model;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Services setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getPrice() {
        return this.price;
    }

    public Services setPrice(Integer price) {
        this.price = price;
        return this;
    }

    public String getPackage() {
        return this.package_;
    }

    public Services setPackage(String package_) {
        this.package_ = package_;
        return this;
    }

    public String getDeleted() {
        return this.deleted;
    }

    public Services setDeleted(String deleted) {
        this.deleted = deleted;
        return this;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public Services setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public Services setUpdatedAt(LocalDateTime updatedAt) {
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
        final Services other = (Services) obj;
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
        if (brand == null) {
            if (other.brand != null)
                return false;
        }
        else if (!brand.equals(other.brand))
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        }
        else if (!model.equals(other.model))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (price == null) {
            if (other.price != null)
                return false;
        }
        else if (!price.equals(other.price))
            return false;
        if (package_ == null) {
            if (other.package_ != null)
                return false;
        }
        else if (!package_.equals(other.package_))
            return false;
        if (deleted == null) {
            if (other.deleted != null)
                return false;
        }
        else if (!deleted.equals(other.deleted))
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
        result = prime * result + ((this.brand == null) ? 0 : this.brand.hashCode());
        result = prime * result + ((this.model == null) ? 0 : this.model.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.price == null) ? 0 : this.price.hashCode());
        result = prime * result + ((this.package_ == null) ? 0 : this.package_.hashCode());
        result = prime * result + ((this.deleted == null) ? 0 : this.deleted.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Services (");

        sb.append(id);
        sb.append(", ").append(externalId);
        sb.append(", ").append(brand);
        sb.append(", ").append(model);
        sb.append(", ").append(name);
        sb.append(", ").append(price);
        sb.append(", ").append(package_);
        sb.append(", ").append(deleted);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);

        sb.append(")");
        return sb.toString();
    }
}
