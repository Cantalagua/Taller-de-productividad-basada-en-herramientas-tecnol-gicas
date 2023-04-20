CREATE DATABASE toolsql-Clientes-Seguro;

USE toolsql-Clientes-Seguro;

CREATE TABLE clientes (
  numero_cliente INT PRIMARY KEY,
  nombre_cliente VARCHAR(255),
  email VARCHAR(255),
  tipo_poliza VARCHAR(255),
  suma_asegurada FLOAT,
  fecha_inicio_poliza DATE
);
