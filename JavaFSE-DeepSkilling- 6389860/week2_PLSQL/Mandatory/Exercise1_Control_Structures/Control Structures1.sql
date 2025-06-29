--creating customers table

--CREATE TABLE CUSTOMERS (
--    CustomerID NUMBER PRIMARY KEY,
--    Name VARCHAR2(100),
--    Age NUMBER,
--    Balance NUMBER(12, 2),
--    IsVIP VARCHAR2(10) DEFAULT 'NO'
--);

--creating loans table

--CREATE TABLE LOANS (
--    LoanID NUMBER PRIMARY KEY,
--    CustomerID NUMBER,
--    LoanAmount NUMBER(12, 2),
--    InterestRate NUMBER(5, 2),
--    DueDate DATE,
--    CONSTRAINT fk_customer FOREIGN KEY (CustomerID) REFERENCES CUSTOMERS(CustomerID)
--);

-- inserting data into customers table

--INSERT INTO CUSTOMERS (CustomerID, Name, Age, Balance) VALUES (1, 'Amar', 65, 12000.00);
--INSERT INTO CUSTOMERS (CustomerID, Name, Age, Balance) VALUES (2, 'Neeraj', 45, 9000.00);
--INSERT INTO CUSTOMERS (CustomerID, Name, Age, Balance) VALUES (3, 'Uday', 70, 15000.00);
--INSERT INTO CUSTOMERS (CustomerID, Name, Age, Balance) VALUES (4, 'Harsha', 58, 8000.00);
--INSERT INTO CUSTOMERS (CustomerID, Name, Age, Balance) VALUES (5, 'Rajesh', 62, 10500.00);

--SELECT * FROM CUSTOMERS;


-- inserting data into loans table

--INSERT INTO LOANS VALUES (101, 1, 50000.00, 8.5, SYSDATE + 10);
--INSERT INTO LOANS VALUES (102, 2, 30000.00, 9.0, SYSDATE + 40);
--INSERT INTO LOANS VALUES (103, 3, 45000.00, 7.5, SYSDATE + 25);
--INSERT INTO LOANS VALUES (104, 4, 20000.00, 10.0, SYSDATE + 15);
--INSERT INTO LOANS VALUES (105, 5, 40000.00, 8.0, SYSDATE + 5);

--SELECT * FROM LOANS;


-- checking scenario1

--SELECT 
--    c.CustomerID, c.Name, c.Age, l.LoanID, l.InterestRate 
--FROM 
--    (CUSTOMERS C INNER JOIN LOANS l ON C.CustomerID = l.CustomerID);

-- for customers with id's 1 & 3 the intrest rate is discounted by 1% since their age is >60


-- checking scenario2
--SELECT * FROM CUSTOMERS;



