DROP TABLE IF EXISTS CITY;
    CREATE TABLE CITY (
    City_code int auto_increment primary key,
    city_name VARCHAR(50) NOT NULL,
    city_pincode INT(8) NOT NULL
    );