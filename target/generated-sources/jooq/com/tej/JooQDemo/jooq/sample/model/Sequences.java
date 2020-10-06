/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model;


import org.jooq.Sequence;
import org.jooq.impl.Internal;


/**
 * Convenience access to all sequences in cars_app
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>cars_app.addresses_id_seq</code>
     */
    public static final Sequence<Long> ADDRESSES_ID_SEQ = Internal.createSequence("addresses_id_seq", CarsApp.CARS_APP, org.jooq.impl.SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>cars_app.cars_id_seq</code>
     */
    public static final Sequence<Long> CARS_ID_SEQ = Internal.createSequence("cars_id_seq", CarsApp.CARS_APP, org.jooq.impl.SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>cars_app.cars_meta_id_seq</code>
     */
    public static final Sequence<Long> CARS_META_ID_SEQ = Internal.createSequence("cars_meta_id_seq", CarsApp.CARS_APP, org.jooq.impl.SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>cars_app.customer_rented_cars_id_seq</code>
     */
    public static final Sequence<Long> CUSTOMER_RENTED_CARS_ID_SEQ = Internal.createSequence("customer_rented_cars_id_seq", CarsApp.CARS_APP, org.jooq.impl.SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>cars_app.customers_id_seq</code>
     */
    public static final Sequence<Long> CUSTOMERS_ID_SEQ = Internal.createSequence("customers_id_seq", CarsApp.CARS_APP, org.jooq.impl.SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>cars_app.sales_id_seq</code>
     */
    public static final Sequence<Long> SALES_ID_SEQ = Internal.createSequence("sales_id_seq", CarsApp.CARS_APP, org.jooq.impl.SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>cars_app.services_availed_id_seq</code>
     */
    public static final Sequence<Long> SERVICES_AVAILED_ID_SEQ = Internal.createSequence("services_availed_id_seq", CarsApp.CARS_APP, org.jooq.impl.SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>cars_app.services_id_seq</code>
     */
    public static final Sequence<Long> SERVICES_ID_SEQ = Internal.createSequence("services_id_seq", CarsApp.CARS_APP, org.jooq.impl.SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);
}
