/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model.tables.records;


import com.tej.JooQDemo.jooq.sample.model.tables.Services;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ServicesRecord extends UpdatableRecordImpl<ServicesRecord> implements Record10<Long, String, String, String, String, Integer, String, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 123070485;

    /**
     * Setter for <code>cars_app.services.id</code>.
     */
    public ServicesRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>cars_app.services.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cars_app.services.external_id</code>.
     */
    public ServicesRecord setExternalId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>cars_app.services.external_id</code>.
     */
    public String getExternalId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>cars_app.services.brand</code>.
     */
    public ServicesRecord setBrand(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>cars_app.services.brand</code>.
     */
    public String getBrand() {
        return (String) get(2);
    }

    /**
     * Setter for <code>cars_app.services.model</code>.
     */
    public ServicesRecord setModel(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>cars_app.services.model</code>.
     */
    public String getModel() {
        return (String) get(3);
    }

    /**
     * Setter for <code>cars_app.services.name</code>.
     */
    public ServicesRecord setName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>cars_app.services.name</code>.
     */
    public String getName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>cars_app.services.price</code>.
     */
    public ServicesRecord setPrice(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>cars_app.services.price</code>.
     */
    public Integer getPrice() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>cars_app.services.package</code>.
     */
    public ServicesRecord setPackage(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>cars_app.services.package</code>.
     */
    public String getPackage() {
        return (String) get(6);
    }

    /**
     * Setter for <code>cars_app.services.deleted</code>.
     */
    public ServicesRecord setDeleted(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>cars_app.services.deleted</code>.
     */
    public String getDeleted() {
        return (String) get(7);
    }

    /**
     * Setter for <code>cars_app.services.created_at</code>.
     */
    public ServicesRecord setCreatedAt(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>cars_app.services.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>cars_app.services.updated_at</code>.
     */
    public ServicesRecord setUpdatedAt(LocalDateTime value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>cars_app.services.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, String, String, String, String, Integer, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Long, String, String, String, String, Integer, String, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Services.SERVICES.ID;
    }

    @Override
    public Field<String> field2() {
        return Services.SERVICES.EXTERNAL_ID;
    }

    @Override
    public Field<String> field3() {
        return Services.SERVICES.BRAND;
    }

    @Override
    public Field<String> field4() {
        return Services.SERVICES.MODEL;
    }

    @Override
    public Field<String> field5() {
        return Services.SERVICES.NAME;
    }

    @Override
    public Field<Integer> field6() {
        return Services.SERVICES.PRICE;
    }

    @Override
    public Field<String> field7() {
        return Services.SERVICES.PACKAGE;
    }

    @Override
    public Field<String> field8() {
        return Services.SERVICES.DELETED;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return Services.SERVICES.CREATED_AT;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return Services.SERVICES.UPDATED_AT;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getExternalId();
    }

    @Override
    public String component3() {
        return getBrand();
    }

    @Override
    public String component4() {
        return getModel();
    }

    @Override
    public String component5() {
        return getName();
    }

    @Override
    public Integer component6() {
        return getPrice();
    }

    @Override
    public String component7() {
        return getPackage();
    }

    @Override
    public String component8() {
        return getDeleted();
    }

    @Override
    public LocalDateTime component9() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime component10() {
        return getUpdatedAt();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getExternalId();
    }

    @Override
    public String value3() {
        return getBrand();
    }

    @Override
    public String value4() {
        return getModel();
    }

    @Override
    public String value5() {
        return getName();
    }

    @Override
    public Integer value6() {
        return getPrice();
    }

    @Override
    public String value7() {
        return getPackage();
    }

    @Override
    public String value8() {
        return getDeleted();
    }

    @Override
    public LocalDateTime value9() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime value10() {
        return getUpdatedAt();
    }

    @Override
    public ServicesRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public ServicesRecord value2(String value) {
        setExternalId(value);
        return this;
    }

    @Override
    public ServicesRecord value3(String value) {
        setBrand(value);
        return this;
    }

    @Override
    public ServicesRecord value4(String value) {
        setModel(value);
        return this;
    }

    @Override
    public ServicesRecord value5(String value) {
        setName(value);
        return this;
    }

    @Override
    public ServicesRecord value6(Integer value) {
        setPrice(value);
        return this;
    }

    @Override
    public ServicesRecord value7(String value) {
        setPackage(value);
        return this;
    }

    @Override
    public ServicesRecord value8(String value) {
        setDeleted(value);
        return this;
    }

    @Override
    public ServicesRecord value9(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public ServicesRecord value10(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public ServicesRecord values(Long value1, String value2, String value3, String value4, String value5, Integer value6, String value7, String value8, LocalDateTime value9, LocalDateTime value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ServicesRecord
     */
    public ServicesRecord() {
        super(Services.SERVICES);
    }

    /**
     * Create a detached, initialised ServicesRecord
     */
    public ServicesRecord(Long id, String externalId, String brand, String model, String name, Integer price, String package_, String deleted, LocalDateTime createdAt, LocalDateTime updatedAt) {
        super(Services.SERVICES);

        set(0, id);
        set(1, externalId);
        set(2, brand);
        set(3, model);
        set(4, name);
        set(5, price);
        set(6, package_);
        set(7, deleted);
        set(8, createdAt);
        set(9, updatedAt);
    }
}
