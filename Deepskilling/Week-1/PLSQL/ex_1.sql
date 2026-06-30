-- Scenario 1: Apply 1% Discount to Loan Interest Rate

DECLARE
    CURSOR c IS
        SELECT l.LoanID
        FROM Loans l
        JOIN Customers c
        ON l.CustomerID = c.CustomerID
        WHERE FLOOR(MONTHS_BETWEEN(SYSDATE, c.DOB) / 12) > 60;
BEGIN
    FOR r IN c LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE LoanID = r.LoanID;
    END LOOP;

    COMMIT;
END;
/

-- Scenario 2: Set VIP Status for Customers

ALTER TABLE Customers ADD IsVIP VARCHAR2(5);

BEGIN
    UPDATE Customers
    SET IsVIP = 'TRUE'
    WHERE Balance > 10000;

    COMMIT;
END;
/

-- Scenario 3: Print Loan Due Reminders

BEGIN
    FOR r IN (
        SELECT c.Name, l.EndDate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: ' || r.Name ||
                             ' Loan due on ' || TO_CHAR(r.EndDate, 'DD-MON-YYYY'));
    END LOOP;
END;
/