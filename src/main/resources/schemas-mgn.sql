IF NOT EXISTS (SELECT 1 FROM sys.databases WHERE name = 'reservation_mgm')
BEGIN
    CREATE DATABASE reservation_mgm;
END;

USE reservation_mgm;

CREATE TABLE Hotels (
    id VARCHAR(50) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    numberSuits INT,
    address VARCHAR(255),
    dateInit DATE
);



USE reservation_mgm;

CREATE TABLE Suites (
    id VARCHAR(50) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    number INT,
    status VARCHAR(255),
    hotelId VARCHAR(50), -- En este ejemplo, hotelId se almacena como una cadena de caracteres (VARCHAR)
    price INT,
    dateStatus DATE,
    FOREIGN KEY (hotelId) REFERENCES Hotels(id)
);

