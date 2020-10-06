/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model.tables;


import com.tej.JooQDemo.jooq.sample.model.CarsApp;
import com.tej.JooQDemo.jooq.sample.model.Keys;
import com.tej.JooQDemo.jooq.sample.model.tables.records.CustomersRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Customers extends TableImpl<CustomersRecord> {

    private static final long serialVersionUID = -464921055;

    /**
     * The reference instance of <code>cars_app.customers</code>
     */
    public static final Customers CUSTOMERS = new Customers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomersRecord> getRecordType() {
        return CustomersRecord.class;
    }

    /**
     * The column <code>cars_app.customers.id</code>.
     */
    public final TableField<CustomersRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('cars_app.customers_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>cars_app.customers.external_id</code>.
     */
    public final TableField<CustomersRecord, String> EXTERNAL_ID = createField(DSL.name("external_id"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>cars_app.customers.first_name</code>.
     */
    public final TableField<CustomersRecord, String> FIRST_NAME = createField(DSL.name("first_name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>cars_app.customers.last_name</code>.
     */
    public final TableField<CustomersRecord, String> LAST_NAME = createField(DSL.name("last_name"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>cars_app.customers.email</code>.
     */
    public final TableField<CustomersRecord, String> EMAIL = createField(DSL.name("email"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>cars_app.customers.phone</code>.
     */
    public final TableField<CustomersRecord, String> PHONE = createField(DSL.name("phone"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>cars_app.customers.deleted</code>.
     */
    public final TableField<CustomersRecord, String> DELETED = createField(DSL.name("deleted"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>cars_app.customers.created_at</code>.
     */
    public final TableField<CustomersRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>cars_app.customers.updated_at</code>.
     */
    public final TableField<CustomersRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * Create a <code>cars_app.customers</code> table reference
     */
    public Customers() {
        this(DSL.name("customers"), null);
    }

    /**
     * Create an aliased <code>cars_app.customers</code> table reference
     */
    public Customers(String alias) {
        this(DSL.name(alias), CUSTOMERS);
    }

    /**
     * Create an aliased <code>cars_app.customers</code> table reference
     */
    public Customers(Name alias) {
        this(alias, CUSTOMERS);
    }

    private Customers(Name alias, Table<CustomersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Customers(Name alias, Table<CustomersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Customers(Table<O> child, ForeignKey<O, CustomersRecord> key) {
        super(child, key, CUSTOMERS);
    }

    @Override
    public Schema getSchema() {
        return CarsApp.CARS_APP;
    }

    @Override
    public Identity<CustomersRecord, Long> getIdentity() {
        return Keys.IDENTITY_CUSTOMERS;
    }

    @Override
    public UniqueKey<CustomersRecord> getPrimaryKey() {
        return Keys.CUSTOMERS_PKEY;
    }

    @Override
    public List<UniqueKey<CustomersRecord>> getKeys() {
        return Arrays.<UniqueKey<CustomersRecord>>asList(Keys.CUSTOMERS_PKEY);
    }

    @Override
    public Customers as(String alias) {
        return new Customers(DSL.name(alias), this);
    }

    @Override
    public Customers as(Name alias) {
        return new Customers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Customers rename(String name) {
        return new Customers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Customers rename(Name name) {
        return new Customers(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, String, String, String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}