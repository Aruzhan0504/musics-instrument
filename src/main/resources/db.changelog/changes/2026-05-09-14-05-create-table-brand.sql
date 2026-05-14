--liquibase formatted sql
--changeset aruzhan:1

create table if not exists brand (
    id bigserial primary key ,
    name varchar(100) not null ,
    description text
);

INSERT INTO brand (name, description) VALUES
                                          ('Yamaha', 'Японский производитель музыкальных инструментов и электроники'),
                                          ('Fender', 'Американский производитель гитар и усилителей'),
                                          ('Gibson', 'Американский производитель гитар, известен моделями Les Paul и SG'),
                                          ('Roland', 'Японский производитель электронных музыкальных инструментов'),
                                          ('Steinway & Sons', 'Немецко-американский производитель пианино и роялей'),
                                          ('Shure', 'Американский производитель микрофонов и звукового оборудования');
