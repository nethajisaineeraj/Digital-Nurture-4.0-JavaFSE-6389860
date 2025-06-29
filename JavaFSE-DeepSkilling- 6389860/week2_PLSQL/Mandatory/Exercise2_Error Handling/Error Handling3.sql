--BEGIN
--    DBMS_OUTPUT.PUT_LINE('--- Test Case 1: Successful Transfer ---');
--    SafeTransferFunds(101, 102, 200); -- success
--    DBMS_OUTPUT.PUT_LINE('----------------------------------------');
--
--    DBMS_OUTPUT.PUT_LINE('--- Test Case 2: Insufficient Funds ---');
--    SafeTransferFunds(103, 102, 1000); -- insufficient funds
--    DBMS_OUTPUT.PUT_LINE('----------------------------------------');
--END;
--/


--BEGIN
--    DBMS_OUTPUT.PUT_LINE('-- Test Case 1: Valid employee --');
--    UpdateSalary(1001, 10);  -- Increases salary by 10%
--
--    DBMS_OUTPUT.PUT_LINE('-- Test Case 2: Invalid employee ID --');
--    UpdateSalary(9999, 15);  -- logs error
--END;
--/


-- Test Block
SET SERVEROUTPUT ON;

BEGIN
    DBMS_OUTPUT.PUT_LINE('-- Test Case 1: Add new customer --');
    AddNewCustomer(6, 'Anjali', 52, 10000, 'NO');

    DBMS_OUTPUT.PUT_LINE('-- Test Case 2: Try duplicate customer ID (2) --');
    AddNewCustomer(2, 'DuplicateTest', 40, 8800, 'YES');
END;
/

