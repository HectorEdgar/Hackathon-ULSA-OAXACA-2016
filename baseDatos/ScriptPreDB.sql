DROP DATABASE IF EXISTS dbsuccessful;
CREATE DATABASE dbsuccessful;

USE dbsuccessful;

CREATE USER IF NOT EXISTS 'successful'@'localhost' IDENTIFIED BY 'Mexico.2017';
GRANT ALL ON dbsuccessful.* to 'successful'@'localhost';