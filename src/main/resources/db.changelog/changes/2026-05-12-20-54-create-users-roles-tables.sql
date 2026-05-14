--liquibase formatted sql
-- changeset Aruzhan:01

create table if not exists roles
(
    id bigserial primary key ,
    name  varchar(100) not null unique,
    description text,
    created_at timestamp default now(),
    updated_at timestamp
);

create table if not exists users(
    id bigserial primary key ,
    full_name varchar not null ,
    email varchar not null unique ,
    password varchar not null ,
    birthdate date,
    created_at timestamp default now(),
    updated_at timestamp
);

create table if not exists user_roles(
    user_id bigint not null ,
    role_id bigint not null ,
    constraint  fk_user foreign key (user_id) references users(id),
    constraint fk_role foreign key (role_id) references roles(id)
);

INSERT INTO roles(name,description)
values ('ADMIN',NULL),
       ('USER',NULL),
       ('MANAGER',NULL);

--changeset aruzhan:02
alter table users
add column phone_number varchar(20) not null unique default '0';

alter table users
add column address varchar;
