--liquibase formatted sql

--changeset aruzhan:01

create table if not exists musics(
    id bigserial primary key ,
    name varchar not null ,
    brand_id bigint,
    model varchar(250),
    category_id bigint,
    country_id bigint,
    material varchar(100) not null ,
    price double precision not null ,
    description text not null,

    created_at timestamp default now(),
    updated_at timestamp
);

alter table musics
add constraint fk_music_brand foreign key (brand_id) references brand(id) on DELETE set null ;
    alter table musics
    add constraint fk_music_category foreign key (category_id) references category(id) on delete set null ;
alter table musics
add constraint fk_music_country foreign key (country_id) references countries(id) on DELETE set null ;


INSERT INTO musics (name, brand_id, model, category_id, country_id, material, price, description, created_at, updated_at)
VALUES  ('Скрипка', 1, 'Stradivarius Model', 1, 1, 'Дерево', 1500.00, 'Профессиональная скрипка ручной работы', NOW(), NOW()),
        ('Электрогитара', 2, 'Stratocaster', 2, 2, 'Ольха', 850.00, 'Классическая электрогитара с звукоснимателями single-coil', NOW(), NOW()),
        ('Акустическая гитара', 3, 'Dreadnought', 2, 3, 'Красное дерево', 450.00, 'Звучная акустика для начинающих', NOW(), NOW()),
        ('Пианино', 1, 'Upright', 3, 1, 'Сталь/дерево', 3200.00, 'Кабинетное пианино с полным механизмом', NOW(), NOW()),
        ('Ударная установка', 2, 'Standard 5-piece', 4, 2, 'Берёза/латунь', 1200.00, 'Набор из 5 барабанов и тарелок', NOW(), NOW()),
        ('Флейта', 3, 'Silver', 5, 4, 'Серебро', 600.00, 'Концертная флейта с открытыми клапанами', NOW(), NOW());


