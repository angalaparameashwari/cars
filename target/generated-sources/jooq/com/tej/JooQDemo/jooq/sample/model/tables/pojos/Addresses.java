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
public class Addresses implements Serializable {

    private static final long serialVersionUID = 104565942;

    private Long          id;
    private Long          customerId;
    private Boolean       isPrimary;
    private String        label;
    private String        firstName;
    private String        lastName;
    private String        email;
    private String        phone;
    private String        line1;
    private String        line2;
    private String        city;
    private String        statename;
    private String        country;
    private String        zipCode;
    private String        deleted;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Addresses() {}

    public Addresses(Addresses value) {
        this.id = value.id;
        this.customerId = value.customerId;
        this.isPrimary = value.isPrimary;
        this.label = value.label;
        this.firstName = value.firstName;
        this.lastName = value.lastName;
        this.email = value.email;
        this.phone = value.phone;
        this.line1 = value.line1;
        this.line2 = value.line2;
        this.city = value.city;
        this.statename = value.statename;
        this.country = value.country;
        this.zipCode = value.zipCode;
        this.deleted = value.deleted;
        this.createdAt = value.createdAt;
        this.updatedAt = value.updatedAt;
    }

    public Addresses(
        Long          id,
        Long          customerId,
        Boolean       isPrimary,
        String        label,
        String        firstName,
        String        lastName,
        String        email,
        String        phone,
        String        line1,
        String        line2,
        String        city,
        String        statename,
        String        country,
        String        zipCode,
        String        deleted,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
    ) {
        this.id = id;
        this.customerId = customerId;
        this.isPrimary = isPrimary;
        this.label = label;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.statename = statename;
        this.country = country;
        this.zipCode = zipCode;
        this.deleted = deleted;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return this.id;
    }

    public Addresses setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public Addresses setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    public Boolean getIsPrimary() {
        return this.isPrimary;
    }

    public Addresses setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
        return this;
    }

    public String getLabel() {
        return this.label;
    }

    public Addresses setLabel(String label) {
        this.label = label;
        return this;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public Addresses setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Addresses setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public Addresses setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return this.phone;
    }

    public Addresses setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getLine1() {
        return this.line1;
    }

    public Addresses setLine1(String line1) {
        this.line1 = line1;
        return this;
    }

    public String getLine2() {
        return this.line2;
    }

    public Addresses setLine2(String line2) {
        this.line2 = line2;
        return this;
    }

    public String getCity() {
        return this.city;
    }

    public Addresses setCity(String city) {
        this.city = city;
        return this;
    }

    public String getStatename() {
        return this.statename;
    }

    public Addresses setStatename(String statename) {
        this.statename = statename;
        return this;
    }

    public String getCountry() {
        return this.country;
    }

    public Addresses setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public Addresses setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public String getDeleted() {
        return this.deleted;
    }

    public Addresses setDeleted(String deleted) {
        this.deleted = deleted;
        return this;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public Addresses setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public Addresses setUpdatedAt(LocalDateTime updatedAt) {
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
        final Addresses other = (Addresses) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (customerId == null) {
            if (other.customerId != null)
                return false;
        }
        else if (!customerId.equals(other.customerId))
            return false;
        if (isPrimary == null) {
            if (other.isPrimary != null)
                return false;
        }
        else if (!isPrimary.equals(other.isPrimary))
            return false;
        if (label == null) {
            if (other.label != null)
                return false;
        }
        else if (!label.equals(other.label))
            return false;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        }
        else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        }
        else if (!lastName.equals(other.lastName))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        }
        else if (!email.equals(other.email))
            return false;
        if (phone == null) {
            if (other.phone != null)
                return false;
        }
        else if (!phone.equals(other.phone))
            return false;
        if (line1 == null) {
            if (other.line1 != null)
                return false;
        }
        else if (!line1.equals(other.line1))
            return false;
        if (line2 == null) {
            if (other.line2 != null)
                return false;
        }
        else if (!line2.equals(other.line2))
            return false;
        if (city == null) {
            if (other.city != null)
                return false;
        }
        else if (!city.equals(other.city))
            return false;
        if (statename == null) {
            if (other.statename != null)
                return false;
        }
        else if (!statename.equals(other.statename))
            return false;
        if (country == null) {
            if (other.country != null)
                return false;
        }
        else if (!country.equals(other.country))
            return false;
        if (zipCode == null) {
            if (other.zipCode != null)
                return false;
        }
        else if (!zipCode.equals(other.zipCode))
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
        result = prime * result + ((this.customerId == null) ? 0 : this.customerId.hashCode());
        result = prime * result + ((this.isPrimary == null) ? 0 : this.isPrimary.hashCode());
        result = prime * result + ((this.label == null) ? 0 : this.label.hashCode());
        result = prime * result + ((this.firstName == null) ? 0 : this.firstName.hashCode());
        result = prime * result + ((this.lastName == null) ? 0 : this.lastName.hashCode());
        result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
        result = prime * result + ((this.phone == null) ? 0 : this.phone.hashCode());
        result = prime * result + ((this.line1 == null) ? 0 : this.line1.hashCode());
        result = prime * result + ((this.line2 == null) ? 0 : this.line2.hashCode());
        result = prime * result + ((this.city == null) ? 0 : this.city.hashCode());
        result = prime * result + ((this.statename == null) ? 0 : this.statename.hashCode());
        result = prime * result + ((this.country == null) ? 0 : this.country.hashCode());
        result = prime * result + ((this.zipCode == null) ? 0 : this.zipCode.hashCode());
        result = prime * result + ((this.deleted == null) ? 0 : this.deleted.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Addresses (");

        sb.append(id);
        sb.append(", ").append(customerId);
        sb.append(", ").append(isPrimary);
        sb.append(", ").append(label);
        sb.append(", ").append(firstName);
        sb.append(", ").append(lastName);
        sb.append(", ").append(email);
        sb.append(", ").append(phone);
        sb.append(", ").append(line1);
        sb.append(", ").append(line2);
        sb.append(", ").append(city);
        sb.append(", ").append(statename);
        sb.append(", ").append(country);
        sb.append(", ").append(zipCode);
        sb.append(", ").append(deleted);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);

        sb.append(")");
        return sb.toString();
    }
}