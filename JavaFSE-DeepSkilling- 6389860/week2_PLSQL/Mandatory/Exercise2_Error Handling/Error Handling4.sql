--Scenario 2: Manage errors when updating employee salaries.
--Question: Write a stored procedure UpdateSalary that increases the salary of an employee by a given percentage. 
--          If the employee ID does not exist, handle the exception and log an error message.

CREATE OR REPLACE PROCEDURE UpdateSalary(
    emp_id IN NUMBER,
    percent_inc IN NUMBER
)
IS
    employee_not_found EXCEPTION;
BEGIN
    UPDATE Employees SET salary = salary + (salary * percent_inc / 100) WHERE emp_id = emp_id;

    IF SQL%ROWCOUNT = 0 THEN
        RAISE employee_not_found;
    ELSE
        COMMIT;
        DBMS_OUTPUT.PUT_LINE('Salary updated successfully for Employee ID ' || emp_id);
    END IF;

EXCEPTION
    WHEN employee_not_found THEN 
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error: Employee ID ' || emp_id || ' not found.');
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error updating salary for Employee ID ' || emp_id || ': ' || SQLERRM);
END;
/
