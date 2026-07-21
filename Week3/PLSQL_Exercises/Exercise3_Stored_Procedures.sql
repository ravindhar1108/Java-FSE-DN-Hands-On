-- Exercise 3: Stored Procedures
-- A simple example of a PL/SQL stored procedure that adds a new employee

CREATE OR REPLACE PROCEDURE add_employee (
    p_emp_id IN NUMBER,
    p_emp_name IN VARCHAR2,
    p_department IN VARCHAR2
) 
IS
BEGIN
    INSERT INTO employees (employee_id, employee_name, department)
    VALUES (p_emp_id, p_emp_name, p_department);
    
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Employee added successfully!');
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
        ROLLBACK;
END add_employee;
/
