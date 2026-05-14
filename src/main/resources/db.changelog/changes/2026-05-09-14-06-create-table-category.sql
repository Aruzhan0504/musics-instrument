--liquibase formatted sql

--changeset aruzhan:1

create table if not exists category(
    id bigserial primary key ,
    name varchar(100) not null ,
    code varchar(50) not null ,
    created_at timestamp default now(),
    updated_at timestamp
);
INSERT INTO category (name, code) VALUES
                                      ('Струнные', 'STR'),
                                      ('Гитары', 'GTR'),
                                      ('Клавишные', 'KEY'),
                                      ('Ударные', 'DRM'),
                                      ('Духовые', 'WND')
ON CONFLICT (id) DO NOTHING;
