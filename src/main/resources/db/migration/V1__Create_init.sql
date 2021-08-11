create table member(
    id               bigint auto_increment not null,
    name             varchar(255) default null,
    email            varchar(255) default null,
    primary key (id)
);