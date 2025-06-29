--Scenario 1: Handle exceptions during fund transfers between accounts.
--Question: Write a stored procedure SafeTransferFunds that transfers funds between two accounts. Ensure that 
--          if any error occurs (e.g., insufficient funds), an appropriate error message is logged and the 
--          transaction is rolled back.

CREATE OR REPLACE PROCEDURE SafeTransferFunds(
    from_acc_id IN NUMBER,
    to_acc_id IN NUMBER,
    amount IN NUMBER)
IS
    insufficient_funds EXCEPTION;
    from_acc_balance NUMBER;
BEGIN

    SELECT balance INTO from_acc_balance FROM Accounts WHERE account_id = from_acc_id;

    IF from_acc_balance < amount THEN
        RAISE insufficient_funds;
    END IF;

    UPDATE Accounts SET balance = balance - amount WHERE account_id = from_acc_id;
    UPDATE Accounts SET balance = balance + amount WHERE account_id = to_acc_id;

    COMMIT;

EXCEPTION
    WHEN insufficient_funds THEN
        ROLLBACK;
        dbms_output.put_line('Insufficient funds for transfer from account ID ' || from_acc_id);

    WHEN OTHERS THEN
        ROLLBACK;
        dbms_output.put_line('Transfer Failed - some error occured...!');
END;
/
