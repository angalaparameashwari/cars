CREATE TABLE cars_meta (
   id BIGSERIAL PRIMARY KEY,
   external_id VARCHAR (255) NOT NULL,
   brand VARCHAR (255) NOT NULL,
   model VARCHAR (255) ,
   features VARCHAR (400),
   deleted VARCHAR (255),
   created_at TIMESTAMP ,
   updated_at TIMESTAMP
);

CREATE TABLE cars (
   id BIGSERIAL PRIMARY KEY,
   car_id BIGINT REFERENCES cars_meta(id) ON DELETE CASCADE,
   registration_no VARCHAR (55),
   engine_no VARCHAR (55),
   is_rentable BOOL DEFAULT false,
   deleted VARCHAR (255),
   created_at TIMESTAMP ,
   updated_at TIMESTAMP
);

CREATE TABLE customers (
   id BIGSERIAL PRIMARY KEY,
   external_id VARCHAR (255) NOT NULL,
   first_name VARCHAR (255) NOT NULL,
   last_name VARCHAR (255),
   email VARCHAR (255),
   phone VARCHAR (255),
   deleted VARCHAR (255),
   created_at TIMESTAMP ,
   updated_at TIMESTAMP
);

CREATE TABLE addresses (
   id BIGSERIAL PRIMARY KEY,
   customer_id BIGINT REFERENCES customers(id) ON DELETE CASCADE,
   is_primary BOOL DEFAULT false ,
   label VARCHAR (255),
   first_name VARCHAR (255),
   last_name VARCHAR (255) ,
   email VARCHAR (255),
   phone VARCHAR (255),
   line1 VARCHAR (255),
   line2 VARCHAR (255),
   city VARCHAR (55),
   stateName VARCHAR (55),
   country VARCHAR (55),
   zip_code VARCHAR (55),
   deleted VARCHAR (255),
   created_at TIMESTAMP ,
   updated_at TIMESTAMP
);

CREATE TABLE customer_rented_cars (
   id BIGSERIAL PRIMARY KEY,
   customer_id BIGINT REFERENCES customers(id) ON DELETE CASCADE,
   car_id BIGINT REFERENCES cars_meta(id) ON DELETE CASCADE,
   start_time TIMESTAMP,
   end_time TIMESTAMP,
   deleted VARCHAR (255),
   created_at TIMESTAMP ,
   updated_at TIMESTAMP
);

CREATE TABLE services (
   id BIGSERIAL PRIMARY KEY,
   external_id VARCHAR (255) NOT NULL,
   brand VARCHAR (255) NOT NULL,
   model VARCHAR (255),
   name VARCHAR (255) ,
   price INTEGER,
   package VARCHAR (400),
   deleted VARCHAR (255),
   created_at TIMESTAMP ,
   updated_at TIMESTAMP
);

CREATE TABLE services_availed (
   id BIGSERIAL PRIMARY KEY,
   customer_id BIGINT REFERENCES customers(id) ON DELETE CASCADE,
   car_id BIGINT REFERENCES services(id) ON DELETE CASCADE,
   start_time TIMESTAMP,
   end_time TIMESTAMP,
   deleted VARCHAR ( 255 ),
   created_at TIMESTAMP ,
   updated_at TIMESTAMP
);

CREATE TABLE sales (
   id BIGSERIAL NOT NULL,
   external_id VARCHAR (255) NOT NULL,
   customer_id BIGINT REFERENCES customers(id) ON DELETE CASCADE,
   car_id BIGINT REFERENCES cars_meta(id) ON DELETE CASCADE,
   dates TIMESTAMP,
   status VARCHAR ( 255 ),
   created_at TIMESTAMP ,
   updated_at TIMESTAMP
);