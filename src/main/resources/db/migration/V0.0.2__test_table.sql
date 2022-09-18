-- -- ==============================================================
-- -- Flyway Migration -
-- -- ==============================================================
-- --
-- -- create shedlock PostgreSQL database tables.
-- --
-- -- ==============================================================
--
-- -- create table
--

create table test
(
    id varchar(255) not null,
    name VARCHAR(64),
    PRIMARY KEY (id)
);