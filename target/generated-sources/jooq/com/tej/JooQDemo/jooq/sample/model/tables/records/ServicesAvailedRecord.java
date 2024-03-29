/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model.tables.records;


import com.tej.JooQDemo.jooq.sample.model.tables.ServicesAvailed;

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
public class ServicesAvailedRecord extends UpdatableRecordImpl<ServicesAvailedRecord> implements Record8<Long, Long, Long, LocalDateTime, LocalDateTime, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 50141983;

    /**
     * Setter for <code>cars_app.services_availed.id</code>.
     */
    public ServicesAvailedRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>cars_app.services_availed.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cars_app.services_availed.customer_id</code>.
     */
    public ServicesAvailedRecord setCustomerId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>cars_app.services_availed.customer_id</code>.
     */
    public Long getCustomerId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>cars_app.services_availed.car_id</code>.
     */
    public ServicesAvailedRecord setCarId(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>cars_app.services_availed.car_id</code>.
     */
    public Long getCarId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>cars_app.services_availed.start_time</code>.
     */
    public ServicesAvailedRecord setStartTime(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>cars_app.services_availed.start_time</code>.
     */
    public LocalDateTime getStartTime() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>cars_app.services_availed.end_time</code>.
     */
    public ServicesAvailedRecord setEndTime(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>cars_app.services_availed.end_time</code>.
     */
    public LocalDateTime getEndTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>cars_app.services_availed.deleted</code>.
     */
    public ServicesAvailedRecord setDeleted(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>cars_app.services_availed.deleted</code>.
     */
    public String getDeleted() {
        return (String) get(5);
    }

    /**
     * Setter for <code>cars_app.services_availed.created_at</code>.
     */
    public ServicesAvailedRecord setCreatedAt(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>cars_app.services_availed.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>cars_app.services_availed.updated_at</code>.
     */
    public ServicesAvailedRecord setUpdatedAt(LocalDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>cars_app.services_availed.updated_at</code>.
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
    public Row8<Long, Long, Long, LocalDateTime, LocalDateTime, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Long, Long, Long, LocalDateTime, LocalDateTime, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return ServicesAvailed.SERVICES_AVAILED.ID;
    }

    @Override
    public Field<Long> field2() {
        return ServicesAvailed.SERVICES_AVAILED.CUSTOMER_ID;
    }

    @Override
    public Field<Long> field3() {
        return ServicesAvailed.SERVICES_AVAILED.CAR_ID;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return ServicesAvailed.SERVICES_AVAILED.START_TIME;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return ServicesAvailed.SERVICES_AVAILED.END_TIME;
    }

    @Override
    public Field<String> field6() {
        return ServicesAvailed.SERVICES_AVAILED.DELETED;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return ServicesAvailed.SERVICES_AVAILED.CREATED_AT;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return ServicesAvailed.SERVICES_AVAILED.UPDATED_AT;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getCustomerId();
    }

    @Override
    public Long component3() {
        return getCarId();
    }

    @Override
    public LocalDateTime component4() {
        return getStartTime();
    }

    @Override
    public LocalDateTime component5() {
        return getEndTime();
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
    public Long value2() {
        return getCustomerId();
    }

    @Override
    public Long value3() {
        return getCarId();
    }

    @Override
    public LocalDateTime value4() {
        return getStartTime();
    }

    @Override
    public LocalDateTime value5() {
        return getEndTime();
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
    public ServicesAvailedRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public ServicesAvailedRecord value2(Long value) {
        setCustomerId(value);
        return this;
    }

    @Override
    public ServicesAvailedRecord value3(Long value) {
        setCarId(value);
        return this;
    }

    @Override
    public ServicesAvailedRecord value4(LocalDateTime value) {
        setStartTime(value);
        return this;
    }

    @Override
    public ServicesAvailedRecord value5(LocalDateTime value) {
        setEndTime(value);
        return this;
    }

    @Override
    public ServicesAvailedRecord value6(String value) {
        setDeleted(value);
        return this;
    }

    @Override
    public ServicesAvailedRecord value7(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public ServicesAvailedRecord value8(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public ServicesAvailedRecord values(Long value1, Long value2, Long value3, LocalDateTime value4, LocalDateTime value5, String value6, LocalDateTime value7, LocalDateTime value8) {
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
     * Create a detached ServicesAvailedRecord
     */
    public ServicesAvailedRecord() {
        super(ServicesAvailed.SERVICES_AVAILED);
    }

    /**
     * Create a detached, initialised ServicesAvailedRecord
     */
    public ServicesAvailedRecord(Long id, Long customerId, Long carId, LocalDateTime startTime, LocalDateTime endTime, String deleted, LocalDateTime createdAt, LocalDateTime updatedAt) {
        super(ServicesAvailed.SERVICES_AVAILED);

        set(0, id);
        set(1, customerId);
        set(2, carId);
        set(3, startTime);
        set(4, endTime);
        set(5, deleted);
        set(6, createdAt);
        set(7, updatedAt);
    }
}
