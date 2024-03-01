DROP SCHEMA IF EXISTS malprosjekt CASCADE;

CREATE SCHEMA malprosjekt;

SET search_path TO malprosjekt;

CREATE TABLE teststringtablename
(
    id SERIAL PRIMARY KEY,
    --data variables below
    string VARCHAR
);

