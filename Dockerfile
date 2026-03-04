FROM postgres:latest

COPY Book/src/main/resources/sql/01-initial-script.sql /docker-entrypoint-initdb.d/01-initial-script.sql
COPY Book/src/main/resources/sql/02-initial-data-script.sql /docker-entrypoint-initdb.d/02-initial-data-script.sql

RUN chmod +x /docker-entrypoint-initdb.d/*.sql