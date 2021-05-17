CREATE SCHEMA IF NOT EXISTS `dorofeiev_db_lab_4`;
USE `dorofeiev_db_lab_4`;

-- drop user 'meteostation'@'localhost';
-- CREATE USER 'meteostation'@'localhost' IDENTIFIED BY 'meteostation123';
-- GRANT ALL ON *.* TO 'meteostation'@'localhost';
-- FLUSH PRIVILEGES;

DROP TABLE IF EXISTS meteostation_service;
DROP TABLE IF EXISTS meteostation_data;
DROP TABLE IF EXISTS wind_direction;	
DROP TABLE IF EXISTS meteostation;
DROP TABLE IF EXISTS data_interval;
DROP TABLE IF EXISTS meteostation_manufacturer;
DROP TABLE IF EXISTS manufacturer_address; 
DROP TABLE IF EXISTS meteostation_location;
DROP TABLE IF EXISTS street;
DROP TABLE IF EXISTS city;

CREATE TABLE city (
  id INT AUTO_INCREMENT PRIMARY KEY,
  city_name VARCHAR(45) NULL
);

CREATE TABLE street (
  id INT AUTO_INCREMENT PRIMARY KEY,
  street_name VARCHAR(45) NULL,
  city_id INT NOT NULL
);

ALTER TABLE street
 ADD CONSTRAINT fk_street_city
 FOREIGN KEY (city_id)
 REFERENCES city(id);

CREATE TABLE meteostation_location (
  id INT AUTO_INCREMENT PRIMARY KEY,
  gps_location VARCHAR(45) NOT NULL,
  street_id INT NOT NULL
);

ALTER TABLE meteostation_location
 ADD CONSTRAINT fk_meteostation_location_street
 FOREIGN KEY (street_id)
 REFERENCES street(id);

CREATE TABLE manufacturer_address (
  id INT AUTO_INCREMENT PRIMARY KEY,
  building_number VARCHAR(20) NULL,
  street_id INT NOT NULL
);

ALTER TABLE manufacturer_address
 ADD CONSTRAINT fk_manufacturer_address_street
 FOREIGN KEY (street_id)
 REFERENCES street(id);
  
CREATE TABLE meteostation_manufacturer (
   id INT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(50) NOT NULL,
   phone VARCHAR(20) NOT NULL,
   email VARCHAR(45) NULL,
   address_id INT NOT NULL
);

ALTER TABLE meteostation_manufacturer
 ADD CONSTRAINT fk_meteostation_manufacturer_address
 FOREIGN KEY (address_id)
 REFERENCES manufacturer_address(id);

CREATE TABLE data_interval (
   id INT AUTO_INCREMENT PRIMARY KEY,
   hours INT NOT NULL DEFAULT 2,
   minutes INT NULL,
   seconds INT NULL
);

CREATE TABLE  meteostation (
   id INT AUTO_INCREMENT PRIMARY KEY,
   meteostation_code VARCHAR(10) NOT NULL,
   installation_date DATE NOT NULL,
   meteostation_location_id INT NOT NULL,
   meteostation_manufacturer_id INT NOT NULL,
   data_interval_id INT NOT NULL
);

ALTER TABLE meteostation
 ADD CONSTRAINT fk_meteostation_meteostation_location
 FOREIGN KEY (meteostation_location_id)
 REFERENCES meteostation_location(id),
 
 ADD CONSTRAINT fk_meteostation_meteostation_manufacturer
 FOREIGN KEY (meteostation_manufacturer_id) 
 REFERENCES meteostation_manufacturer(id),
 
 ADD CONSTRAINT fk_meteostation_data_interval
 FOREIGN KEY (data_interval_id)
 REFERENCES data_interval(id);

CREATE TABLE wind_direction(
	id INT AUTO_INCREMENT PRIMARY KEY,
    direction VARCHAR(3)
);

CREATE TABLE meteostation_data (
   id INT AUTO_INCREMENT PRIMARY KEY,
   temperature FLOAT NOT NULL,
   humidity FLOAT NOT NULL,
   wind_speed FLOAT NOT NULL,
   atmospheric_pressure FLOAT NOT NULL,
   wind_direction_id INT NOT NULL,
   meteostation_id INT NOT NULL
);

ALTER TABLE meteostation_data
 ADD CONSTRAINT fk_meteostation_data
 FOREIGN KEY (meteostation_id)
 REFERENCES meteostation(id),
 
 ADD CONSTRAINT fk_meteostation_data_wind_direction
 FOREIGN KEY (wind_direction_id)
 REFERENCES wind_direction(id);
 
CREATE TABLE meteostation_service (
   id INT AUTO_INCREMENT PRIMARY KEY,
   service_description MEDIUMTEXT NOT NULL,
   service_date DATE NOT NULL,
   is_regular TINYINT(1) NULL,
   meteostation_id INT NOT NULL
);

ALTER TABLE meteostation_service
 ADD CONSTRAINT fk_meteostation_service_meteostation
 FOREIGN KEY (meteostation_id)
 REFERENCES meteostation (id);
 
INSERT INTO city(city_name)
	VALUES("Lviv"),
	("Kyiv"),
    ("Ternopil"),
    ("Kharkiv"),
    ("Odesa"),
    ("Chernivtsi"),
    ("Boryslav"),
    ("Dnipro"),
    ("Stebnyk"),
    ("Stryi");

INSERT INTO street(street_name,city_id)
	VALUES("Грушевського", 1),
	("Б.Хмельницького", 2),
    ("Франка", 3),
    ("Дорошенка", 4),
    ("Героїв УПА", 5),
    ("Симоненка", 6),
    ("Осади", 7),
    ("Сумська", 8),
    ("Винниченка", 9),
    ("Шевченка", 10);

INSERT INTO meteostation_location(gps_location,street_id)
	VALUES("49° 17' 5.748'' N", 2),
    ("23° 25' 23.7'' E", 1),
    ("49° 50' 22.8624'' N", 5),
    ("24° 1' 46.9776'' E", 4),
    ("40° 42' 45.9936'' N", 3),
    ("74° 0' 21.5064'' W", 8),
    ("74° 0' 21.5064'' W", 7),
    ("40° 42' 45.9936'' N", 6),
    ("74° 0' 21.5064'' W", 9),
    ("49° 50' 22.8624'' N", 10);

INSERT INTO manufacturer_address(building_number,street_id)
	VALUES("10", 2),
    (10, 1),
    (11, 3),
    (16, 6),
    (20, 5),
    (73, 4),
    (12, 7),
    (14, 8),
    (86, 9),
    (120, 10);

INSERT INTO meteostation_manufacturer(name,phone,email,address_id)
	VALUES("LX","0693396382","lx@gmail.com", 1),
    ("SIP","0693396382","sip@gmail.com", 5),
    ("LOP","0633396382","lop@gmail.com", 4),
    ("NRUS","0793396382","nrus@gmail.com", 3),
    ("ADAD","0993396382","adad@gmail.com", 2),
    ("BOLIL","0269362618","bolil@gmail.com", 10),
    ("SUPER","0793896382","super@gmail.com", 9),
    ("VIX","0893496382","vix@gmail.com", 8),
    ("XXX","0298396382","xxx@gmail.com", 7),
    ("ZIC","0633396382","zic@gmail.com", 6);

INSERT INTO data_interval(hours, minutes, seconds)
	VALUES(2, 10, 00),
    (1, 00, 00),
    (3, 15, 00),
    (2, 12, 10),
    (DEFAULT,NULL,NULL),
    (2, 30, 00),
    (2, 40, 00),
    (2, 22, 22),
    (1, 40, 00),
    (1, 40, 00);

INSERT INTO meteostation(meteostation_code, installation_date, meteostation_location_id, meteostation_manufacturer_id, data_interval_id)   
    VALUES("#121312", "2016-02-01", 1, 1, 1),
    ("#12122", "2016-12-02", 2, 2, 2),
    ("#122623312", "2019-05-01", 3, 3, 3),
    ("#111312", "2016-07-21", 4, 4, 4),
    ("#1331262", "2014-12-16", 5, 5, 5),
    ("#231313", "2013-03-31", 6, 6, 6),
    ("#121252", "2018-06-12", 7, 7, 7),
    ("#121442", "2017-07-04", 8, 8, 8),
    ("#511331", "2016-03-26", 9, 9, 9),
    ("#422312", "2015-01-02", 10, 10, 10);

INSERT INTO wind_direction(direction)
	VALUES("W"),
    ("E"),
    ("N"),
    ("S"),
    ("NW"),
    ("NE"),
    ("SW"),
    ("SE");
    
INSERT INTO meteostation_data(temperature, humidity, wind_speed, wind_direction_id, atmospheric_pressure, meteostation_id)
	VALUES(21, 90, 12, 1, 715, 1),
    (70, 100, 1, 2, 715, 2),
    (34, 57, 2, 3, 765, 3),
    (21, 87, 7, 5,721, 4),
    (23, 68, 0, 4, 735, 3),
    (22, 96, 8, 7, 762, 5),
    (21, 42, 4, 7, 725, 5),
    (20, 87, 3, 8, 761, 6),
    (30, 65, 56, 6, 723, 7),
    (53, 47, 3, 1, 65, 2),
    (99, 86, 7, 2, 735, 1),
    (21, 45, 2, 6, 765, 5),
    (32, 21, 1, 4, 735, 5);

INSERT INTO meteostation_service(service_description,service_date,is_regular,meteostation_id)
	VALUES("netus et malesuada fames ac", "2015-01-01", 1, 1),
    ("netus et malesuada fames ac", "2015-02-12", 1, 2),
    ("netus et malesuada fames ac", "2016-03-22", 1, 3),
    ("netus et malesuada fames ac", "2017-04-30", 0, 4),
    ("netus et malesuada fames ac", "2012-07-29", 0, 5),
    ("netus et malesuada fames ac", "2013-06-28", 1, 6),
    ("netus et malesuada fames ac", "2018-07-27", 0, 7),
    ("netus et malesuada fames ac", "2017-02-26", 1, 8),
    ("netus et malesuada fames ac", "2018-11-17", 0, 9),
    ("netus et malesuada fames ac", "2019-12-18", 1, 10);
    
CREATE INDEX meteostation_code_idx ON meteostation(meteostation_code);
CREATE INDEX meteostation_gps_location_idx ON meteostation_location(gps_location);
CREATE INDEX meteostation_manufacturer_name_idx ON meteostation_manufacturer(name);    