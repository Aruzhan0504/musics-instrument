--liquibase formatted sql
--changeset aruzhan:1

create table if not exists countries(
    id bigserial primary key ,
    name varchar(100) not null ,
    city varchar(100) not null
);

INSERT INTO countries (id, name, city) VALUES
                                         (1, 'Казахстан', 'Астана'),
                                         (2, 'США', 'Вашингтон'),
                                         (3, 'Германия', 'Берлин'),
                                         (4, 'Франция', 'Париж'),
                                         (5, 'Япония', 'Токио'),
                                         (6, 'Италия', 'Рим')
ON CONFLICT (id) DO NOTHING;