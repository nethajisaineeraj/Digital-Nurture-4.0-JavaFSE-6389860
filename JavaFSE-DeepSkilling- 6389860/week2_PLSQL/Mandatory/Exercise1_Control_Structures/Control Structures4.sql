--Scenario 3: The bank wants to send reminders to customers whose loans are due within the next 30 days.
--Question: Write a PL/SQL block that fetches all loans due in the next 30 days and prints a reminder message 
--          for each customer.
set SERVEROUTPUT ON;
--DECLARE 
--    targetDueDate DATE:= SYSDATE+30;
--    id INTEGER;
--    dueDate DATE;
--    name VARCHAR2(100);
--BEGIN 
--    -- assuming the customer table has sequential id for the customers
--    SELECT COUNT(*) INTO id FROM CUSTOMERS;
--    WHILE id>0
--    LOOP
--        SELECT DueDate INTO dueDate FROM LOANS WHERE CustomerID = id;
--        IF dueDate <= targetDueDate THEN 
--            SELECT Name INTO name FROM CUSTOMERS WHERE CustomerID = id;
--            dbms_output.put_line('Dear '||name||',your due date is within the next 30 days(remainder!).');
--        END IF;
--        id := id - 1;
--    END LOOP;
--END;
--/

-- or

DECLARE 
    loan_row LOANS%ROWTYPE;
    name VARCHAR2(100);
BEGIN 
    FOR loan_row IN (SELECT * FROM LOANS WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30)
    LOOP
        SELECT Name INTO name FROM CUSTOMERS WHERE CustomerID = loan_row.CustomerID;
        dbms_output.put_line('Dear '||Name||',your due date is within the next 30 days(remainder!).');
    END LOOP;
END;
/