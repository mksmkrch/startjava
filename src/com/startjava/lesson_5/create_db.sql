DROP TABLE IF EXISTS jaegers;

CREATE DATABASE lesson_5
    WITH OWNER "postgres"
    ENCODING 'UTF8'
    LC_COLLATE = 'ru_RU.UTF-8'
    LC_CTYPE = 'ru_RU.UTF-8'
    TEMPLATE = template0;

\c lesson_5;

CREATE TABLE jaegers (
    id        SERIAL PRIMARY KEY,
    modelName TEXT,
    mark      TEXT,
    height    REAL,
    weight    REAL,
    status    TEXT,
    origin    TEXT,
    launch    DATE,
    kaijuKill INT
);

\ir init_db.sql;
\ir queries.sql;