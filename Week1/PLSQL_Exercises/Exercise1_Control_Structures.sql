-- PL/SQL Exercise 1: Control Structures
DECLARE
    v_number NUMBER := 10;
BEGIN
    IF v_number > 0 THEN
        DBMS_OUTPUT.PUT_LINE('Number is positive');
    ELSIF v_number < 0 THEN
        DBMS_OUTPUT.PUT_LINE('Number is negative');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Number is zero');
    END IF;
    
    -- Basic loop
    FOR i IN 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE('Iteration ' || i);
    END LOOP;
END;
/
