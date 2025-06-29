--Scenario 1: The bank wants to apply a discount to loan interest rates for customers above 60 years old.
--Question: Write a PL/SQL block that loops through all customers, checks their age, and if they are 
--          above 60, apply a 1% discount to their current loan interest rates.

--DECLARE 
--    id INTEGER;
--    age NUMBER;
--    oldIntrestRate NUMBER(5, 2);
--BEGIN 
--    -- assuming the customer table has sequential id for the customers
--    SELECT COUNT(*) INTO id FROM CUSTOMERS;
--    WHILE id>0
--    LOOP
--        SELECT Age INTO age FROM CUSTOMERS WHERE CustomerID = id;
--        IF age > 60 THEN 
--            SELECT InterestRate INTO oldIntrestRate FROM LOANS WHERE CustomerID = id;
--            UPDATE LOANS SET InterestRate = oldIntrestRate - 1 WHERE CustomerID = id;
--        END IF;
--        id := id - 1;
--    END LOOP;
--END;
--/
--
--or 

DECLARE 
    customer_row CUSTOMERS%ROWTYPE;
    oldIntrestRate NUMBER(5, 2);
BEGIN 
    FOR customer_row IN (SELECT * FROM CUSTOMERS WHERE Age > 60)
    LOOP
        SELECT InterestRate INTO oldIntrestRate FROM LOANS WHERE CustomerID = customer_row.CustomerID;
        UPDATE LOANS SET InterestRate = oldIntrestRate - 1 WHERE CustomerID = customer_row.CustomerID;
    END LOOP;
END;
/



        
    
