#!/bin/bash
psql -U root -d sampledb << "EOSQL"

CREATE TABLE person (
id SERIAL PRIMARY KEY
, name VARCHAR(16)
, age INT);

INSERT INTO person VALUES
 (1,'taro',19)
 , (2,'tadokoro',24)
 , (3,'hanako',14);

EOSQL