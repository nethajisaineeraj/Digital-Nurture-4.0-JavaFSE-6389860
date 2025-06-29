--Scenario 2: A customer can be promoted to VIP status based on their balance.
--Question: Write a PL/SQL block that iterates through all customers and sets a flag IsVIP to TRUE for 
--          those with a balance over $10,000.


--DECLARE 
--    id INTEGER;
--    balance NUMBER(12, 2);
--BEGIN 
--    -- assuming the customer table has sequential id for the customers
--    SELECT COUNT(*) INTO id FROM CUSTOMERS;
--    WHILE id>0
--    LOOP
--        SELECT Balance INTO balance FROM CUSTOMERS WHERE CustomerID = id;
--        IF balance > 10000 THEN 
--            UPDATE CUSTOMERS SET IsVIP = 'YES' WHERE CustomerID = id;
--        END IF;
--        id := id - 1;
--    END LOOP;
--END;
--/

--or

DECLARE 
    customer_row CUSTOMERS%ROWTYPE;
BEGIN 
    FOR customer_row IN (SELECT * FROM CUSTOMERS WHERE Balance > 10000)
    LOOP
        UPDATE CUSTOMERS SET IsVIP = 'YES' WHERE CustomerID = customer_row.CustomerID;
    END LOOP;
END;
/