-- liquibase formatted sql
--changeset Andrey:1
creatye table "users"(
        id serial primary key,
        full_name text,
        login text,
        password text
);