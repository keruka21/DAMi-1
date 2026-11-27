DROP DATABASE fines_collection;
CREATE DATABASE fines_collection;
USE fines_collection;

CREATE TABLE vehicle (
    plate_no CHAR(7) PRIMARY KEY,
    make_model VARCHAR(30) NOT NULL,
    tax DOUBLE NOT NULL DEFAULT 50 CHECK (tax >= 10)
);

CREATE TABLE police (
    police_code VARCHAR(5) PRIMARY KEY,
    police_officer_code VARCHAR(5),
    name VARCHAR(30) NOT NULL,
    FOREIGN KEY (police_officer_code)
        REFERENCES police (police_code)
);

CREATE TABLE fine (
    fine_no INT AUTO_INCREMENT PRIMARY KEY,
    police_code VARCHAR(5) NOT NULL,
    plate_no CHAR(7) NOT NULL,
    fine_date DATE NOT NULL DEFAULT (CURRENT_DATE),
    place VARCHAR(20) NOT NULL,
    amount DOUBLE NOT NULL CHECK (amount >= 15 AND amount <= 600),
    description VARCHAR(50) NOT NULL,
    paid VARCHAR(3) NOT NULL CHECK (paid IN ('Sí', 'No')),
    FOREIGN KEY (police_code) REFERENCES police (police_code),
    FOREIGN KEY (plate_no) REFERENCES vehicle (plate_no)
);   