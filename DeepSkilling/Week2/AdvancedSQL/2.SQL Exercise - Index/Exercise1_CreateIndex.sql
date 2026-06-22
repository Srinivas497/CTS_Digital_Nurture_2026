USE CognizantSQL;

CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    CustomerName VARCHAR(50),
    City VARCHAR(50)
);

INSERT INTO Customers VALUES
(1,'Srinivas','Hyderabad'),
(2,'Yasarapu','Chennai'),
(3,'Rawhan','Mumbai'),
(4,'David','Delhi');

CREATE INDEX idx_customername
ON Customers(CustomerName);

SELECT *
FROM Customers
WHERE CustomerName='Srinivas';