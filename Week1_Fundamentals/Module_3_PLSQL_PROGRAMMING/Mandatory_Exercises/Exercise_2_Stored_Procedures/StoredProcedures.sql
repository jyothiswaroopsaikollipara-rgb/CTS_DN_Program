SET SERVEROUTPUT ON;

CREATE TABLE Employees (

    employee_id NUMBER,

    employee_name VARCHAR2(50),

    salary NUMBER

);

INSERT INTO Employees VALUES (101, 'Swaroop', 50000);

INSERT INTO Employees VALUES (102, 'Sai', 60000);

COMMIT;

CREATE OR REPLACE PROCEDURE GetEmployeeSalary(

    emp_id IN NUMBER

)
IS

    emp_salary NUMBER;

BEGIN

    SELECT salary
    INTO emp_salary
    FROM Employees
    WHERE employee_id = emp_id;

    DBMS_OUTPUT.PUT_LINE(
        'Salary : ' || emp_salary
    );

END;
/

BEGIN

    GetEmployeeSalary(101);

END;
/