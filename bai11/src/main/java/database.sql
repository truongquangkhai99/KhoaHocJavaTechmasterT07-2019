USE javatutorials;
DROP TABLE tblDepartment;

CREATE TABLE tblDepartment(
    departmentId INT AUTO_INCREMENT,
    name VARCHAR(500),
    description TEXT,
    PRIMARY KEY (departmentId)
);
INSERT INTO tblDepartment(name, description)
VALUES('IT', "This is IT Department");

INSERT INTO tblDepartment(name, description)
VALUES('Sales', "Day la phong Sales");

SELECT * FROM tblDepartment;

CREATE TABLE tblEmployee(
    employeeId INT AUTO_INCREMENT,
    name varchar(500),
    age INT,
    email varchar(200),
    departmentId INT,
    PRIMARY KEY (employeeId)
);
SHOW TABLES;