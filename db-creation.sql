CREATE DATABASE nombre_de_tu_bd;

USE nombre_de_tu_bd;

CREATE TABLE clientes (
  numero_cliente INT PRIMARY KEY,
  nombre_cliente VARCHAR(255),
  email VARCHAR(255),
  tipo_poliza VARCHAR(255),
  suma_asegurada FLOAT,
  fecha_inicio_poliza DATE
);
