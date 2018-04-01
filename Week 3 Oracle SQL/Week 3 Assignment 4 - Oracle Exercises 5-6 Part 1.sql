-- PART 1

BEGIN 
dbms_output.put_line('Hello World');
END;


-- PART 2

Procedure print_primes
as
    declare is_prime boolean := true;
begin
    for x in 1..100 loop
        if (x = 1) then
            is_prime := false;
        end if;
        for y in 2..sqrt(x) loop
            if (mod(x, 2) = 0 OR (mod(x, y) = 0)) then
                is_prime := false;
            end if; 
        end loop;
        
        if (is_prime) then
            dbms_output.put_line(x);
        end if;
        is_prime := true;
    end loop;
    
end;


-- PART 3

create or replace FUNCTION FACTORIAL(fact_num number)
return number
is 
    total number := 1;
begin
    for x in reverse 1..fact_num loop
        total := total * x;
    end loop;
    return total;    
end;

/

declare 
    answer number;
begin
    answer := FACTORIAL(10);
    dbms_output.put_line(answer);
end;



-- From Week 3 Assignment 3 - Oracle Exercise 4
-- Creating the table EMP for PART 4

CREATE TABLE EMP (
  EMPLOYEE_ID Number(6,0),
  FIRST_NAME varchar(60),
  LAST_NAME varchar(60),
  PHONE_NUMBER Number(6,0),
  HIRE_DATE Date,
  SALARY Number(9,0),
  COMMISSION_PCT Number(6,2),
  MANAGER_ID Number(6,0),
  JOB_ID varchar(60),
  DEPARTMENT_ID Number(6,0)
);

INSERT ALL
INTO EMP(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, PHONE_NUMBER, HIRE_DATE, SALARY,
COMMISSION_PCT, MANAGER_ID, JOB_ID, DEPARTMENT_ID)
VALUES (10, 'Smith', 'Trenna', 7890, TO_DATE('29-Jan-97, 00:00:00', 'dd-month-yy hh24:mi:ss'),
20000, 0.5, 20, 'SA_REP', 10)

INTO EMP(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, PHONE_NUMBER, HIRE_DATE, SALARY,
COMMISSION_PCT, MANAGER_ID, JOB_ID, DEPARTMENT_ID)
VALUES (20, 'Sam', 'Peter', 3456, TO_DATE('15-Mar-98, 00:00:00', 'dd-month-yy hh24:mi:ss'),
30000, NULL, NULL, 'MKT_REP', 10)

INTO EMP(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, PHONE_NUMBER, HIRE_DATE, SALARY,
COMMISSION_PCT, MANAGER_ID, JOB_ID, DEPARTMENT_ID)
VALUES (30, 'Sekhar', 'Rao', 7632, TO_DATE('9-Jul-98, 00:00:00', 'dd-month-yy hh24:mi:ss'),
13000, 0.5, 20, 'ST_CLERK', 20)

INTO EMP(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, PHONE_NUMBER, HIRE_DATE, SALARY,
COMMISSION_PCT, MANAGER_ID, JOB_ID, DEPARTMENT_ID)
VALUES (40, 'Sourabh', 'Ghosh', 7812, TO_DATE('12-Feb-98, 00:00:00', 'dd-month-yy hh24:mi:ss'),
10000, NULL, 10, 'MKT_REP', 10)

INTO EMP(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, PHONE_NUMBER, HIRE_DATE, SALARY,
COMMISSION_PCT, MANAGER_ID, JOB_ID, DEPARTMENT_ID)
VALUES (50, 'Kanchan', 'Sen', 9000, TO_DATE('1-Oct-96, 00:00:00', 'dd-month-yy hh24:mi:ss'),
12000, 0.3, 10, 'ST_CLERK', 10)

INTO EMP(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, PHONE_NUMBER, HIRE_DATE, SALARY,
COMMISSION_PCT, MANAGER_ID, JOB_ID, DEPARTMENT_ID)
VALUES (60, 'Kushik', 'Bhatterjee', 2345, TO_DATE('5-Jan-97, 00:00:00', 'dd-month-yy hh24:mi:ss'),
9000, 0.6, 30, 'SA_MAN', 20)

INTO EMP(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, PHONE_NUMBER, HIRE_DATE, SALARY,
COMMISSION_PCT, MANAGER_ID, JOB_ID, DEPARTMENT_ID)
VALUES (70, 'Radha', 'Mukherjee', 2134, TO_DATE('10-Mar-97, 00:00:00', 'dd-month-yy hh24:mi:ss'),
15000, 0.6, 30, 'SA_MAN', 20)
SELECT * FROM DUAL;

-- PART 4


create or replace package employee as

procedure add_employee(EMPLOYEE_ID in Number, FIRST_NAME in varchar,
  LAST_NAME in varchar, PHONE_NUMBER in Number, HIRE_DATE in Date,
  SALARY in Number, COMMISSION_PCT in Number,
  MANAGER_ID in Number, JOB_ID in varchar,
  DEPARTMENT_ID in Number
);

procedure modify_employee(p_new_sal in Number, 
  p_new_comission_pct in Number, p_empid in Number);

end employee;

/


create or replace package body employee as
  procedure add_employee(EMPLOYEE_ID in Number, FIRST_NAME in varchar,
  LAST_NAME in varchar, PHONE_NUMBER in Number, HIRE_DATE in Date,
  SALARY in Number, COMMISSION_PCT in Number,
  MANAGER_ID in Number, JOB_ID in varchar,
  DEPARTMENT_ID in Number)
  as
  begin 
    INSERT INTO emp (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, PHONE_NUMBER,
    HIRE_DATE, SALARY, COMMISSION_PCT, MANAGER_ID, JOB_ID, DEPARTMENT_ID)
    VALUES (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, PHONE_NUMBER,
    HIRE_DATE, SALARY, COMMISSION_PCT, MANAGER_ID, JOB_ID, DEPARTMENT_ID);
  end add_employee;
  
  procedure modify_employee(p_new_sal Number, 
  p_new_comission_pct Number, p_empid Number)
  as
  begin
    update emp
    set SALARY = p_new_sal,
    COMMISSION_PCT = p_new_comission_pct
    where EMPLOYEE_ID = p_empid;
    
    commit;
  end modify_employee;
end employee;

begin
    EMPLOYEE.add_employee(80, 'Lucas', 'Mann', 7137, 
    TO_DATE('15-Oct-99, 00:00:00', 'dd-month-yy hh24:mi:ss'),
    17000, 0.35, 20, 'SA_REP', 10);
    EMPLOYEE.modify_employee(25000, 0.7, 40);
end;