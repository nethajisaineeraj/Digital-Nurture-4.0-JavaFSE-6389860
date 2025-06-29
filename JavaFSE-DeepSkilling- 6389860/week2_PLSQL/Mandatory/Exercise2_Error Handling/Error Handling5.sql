--Scenario 3: Ensure data integrity when adding a new customer.
--Question: Write a stored procedure AddNewCustomer that inserts a new customer into the Customers table. If a 
--          customer with the same ID already exists, handle the exception by logging an error and preventing 
--          the insertion.
CREATE OR REPLACE PROCEDURE AddNewCustomer (
    customerid IN NUMBER,
    name IN VARCHAR2,
    age IN NUMBER,
    balance IN NUMBER,
    isvip IN VARCHAR2
) IS
    v_count NUMBER := 0;
    customer_exists EXCEPTION;
BEGIN
    -- Check if customer with the same ID already exists
    SELECT COUNT(*) INTO v_count FROM Customers WHERE customerid = AddNewCustomer.customerid;

    IF v_count > 0 THEN
        RAISE customer_exists;
    END IF;

    -- Proceed to insert
    INSERT INTO Customers VALUES (customerid, name, age, balance, isvip);

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Customer added successfully: ' || name);

EXCEPTION
    WHEN customer_exists THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error: Customer ID ' || customerid || ' already exists.');

    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Unexpected error: ' || SQLERRM);
END;
/
