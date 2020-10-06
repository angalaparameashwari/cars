/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model.tables.records;


import com.tej.JooQDemo.jooq.sample.model.tables.CarsMeta;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CarsMetaRecord extends UpdatableRecordImpl<CarsMetaRecord> implements Record8<Long, String, String, String, String, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = -1065898848;

    /**
     * Setter for <code>cars_app.cars_meta.id</code>.
     */
    public CarsMetaRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>cars_app.cars_meta.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cars_app.cars_meta.external_id</code>.
     */
    public CarsMetaRecord setExternalId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>cars_app.cars_meta.external_id</code>.
     */
    public String getExternalId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>cars_app.cars_meta.brand</code>.
     */
    public CarsMetaRecord setBrand(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>cars_app.cars_meta.brand</code>.
     */
    public String getBrand() {
        return (String) get(2);
    }

    /**
     * Setter for <code>cars_app.cars_meta.model</code>.
     */
    public CarsMetaRecord setModel(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>cars_app.cars_meta.model</code>.
     */
    public String getModel() {
        return (String) get(3);
    }

    /**
     * Setter for <code>cars_app.cars_meta.features</code>.
     */
    public CarsMetaRecord setFeatures(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>cars_app.cars_meta.features</code>.
     */
    public String getFeatures() {
        return (String) get(4);
    }

    /**
     * Setter for <code>cars_app.cars_meta.deleted</code>.
     */
    public CarsMetaRecord setDeleted(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>cars_app.cars_meta.deleted</code>.
     */
    public String getDeleted() {
        return (String) get(5);
    }

    /**
     * Setter for <code>cars_app.cars_meta.created_at</code>.
     */
    public CarsMetaRecord setCreatedAt(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>cars_app.cars_meta.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>cars_app.cars_meta.updated_at</code>.
     */
    public CarsMetaRecord setUpdatedAt(LocalDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>cars_app.cars_meta.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, String, String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Long, String, String, String, String, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return CarsMeta.CARS_META.ID;
    }

    @Override
    public Field<String> field2() {
        return CarsMeta.CARS_META.EXTERNAL_ID;
    }

    @Override
    public Field<String> field3() {
        return CarsMeta.CARS_META.BRAND;
    }

    @Override
    public Field<String> field4() {
        return CarsMeta.CARS_META.MODEL;
    }

    @Override
    public Field<String> field5() {
        return CarsMeta.CARS_META.FEATURES;
    }

    @Override
    public Field<String> field6() {
        return CarsMeta.CARS_META.DELETED;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return CarsMeta.CARS_META.CREATED_AT;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return CarsMeta.CARS_META.UPDATED_AT;
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
        return getFeatures();
    }

    @Override
    public String component6() {
        return getDeleted();
    }

    @Override
    public LocalDateTime component7() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime component8() {
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
        return getFeatures();
    }

    @Override
    public String value6() {
        return getDeleted();
    }

    @Override
    public LocalDateTime value7() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime value8() {
        return getUpdatedAt();
    }

    @Override
    public CarsMetaRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public CarsMetaRecord value2(String value) {
        setExternalId(value);
        return this;
    }

    @Override
    public CarsMetaRecord value3(String value) {
        setBrand(value);
        return this;
    }

    @Override
    public CarsMetaRecord value4(String value) {
        setModel(value);
        return this;
    }

    @Override
    public CarsMetaRecord value5(String value) {
        setFeatures(value);
        return this;
    }

    @Override
    public CarsMetaRecord value6(String value) {
        setDeleted(value);
        return this;
    }

    @Override
    public CarsMetaRecord value7(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public CarsMetaRecord value8(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public CarsMetaRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, LocalDateTime value7, LocalDateTime value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CarsMetaRecord
     */
    public CarsMetaRecord() {
        super(CarsMeta.CARS_META);
    }

    /**
     * Create a detached, initialised CarsMetaRecord
     */
    public CarsMetaRecord(Long id, String externalId, String brand, String model, String features, String deleted, LocalDateTime createdAt, LocalDateTime updatedAt) {
        super(CarsMeta.CARS_META);

        set(0, id);
        set(1, externalId);
        set(2, brand);
        set(3, model);
        set(4, features);
        set(5, deleted);
        set(6, createdAt);
        set(7, updatedAt);
    }
}
