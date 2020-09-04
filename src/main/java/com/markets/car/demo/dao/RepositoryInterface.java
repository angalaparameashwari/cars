package com.markets.car.demo.dao;

import org.jooq.DSLContext;
import org.jooq.impl.UpdatableRecordImpl;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class RepositoryInterface<R extends UpdatableRecordImpl>  {
        @Autowired
        DSLContext context;

        public R insert(R record) {
                record.attach(context.configuration());
                record.insert();
                return null;
        }

//
//        API ->  create -> Domain -> converter -> Domain Specific resource -> business -> DAO -> Entity
//
//                update ->
//
//                Resource ->
}
