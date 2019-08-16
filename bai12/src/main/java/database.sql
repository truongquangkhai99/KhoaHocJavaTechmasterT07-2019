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

INSERT INTO tblDepartment(name, description)
VALUES('Doan the', "An choi hoi hop");

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


SELECT Categories.*, Products.* FROM Categories
INNER JOIN Categories
ON Categories.CategoryID = Products.CategoryID
ORDER BY Products.ProductID
