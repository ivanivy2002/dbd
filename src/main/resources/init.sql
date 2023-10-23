CREATE TABLE IF NOT EXISTS room (
    kdno INT,
    kcno INT,
    ccno INT,
    kdname VARCHAR(255),
    exptime TIMESTAMP,
    papername VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS student (
    registno VARCHAR(10),
    name VARCHAR(255),
    kdno INT,
    kcno INT,
    ccno INT,
    seat INT
);

LOAD DATA INFILE '../../../data/room.csv'
INTO TABLE room
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 LINES;

LOAD DATA INFILE '../../../data/student.csv'
INTO TABLE room
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 LINES;