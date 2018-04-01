-- Create Tables for running package
CREATE TABLE STUDENTS(
  FIRST_NAME varchar(30),
  LAST_NAME varchar(30),
  EMAIL varchar(60),
  ADDRESS varchar(60),
  STATE varchar(60),
  PIN Number(6,0),
  PHONE_NO Number(10,0),
  S_ID varchar(60) PRIMARY KEY,
  DATE_OF_BIRTH Date,
  QUALIFICATION varchar(60),
  PERCENT_10 Number(6,0),
  PERCENT_12 Number(6,0),
  DATE_OF_PASSING_12 Date,
  SUBJECTS varchar(60)
);

INSERT ALL
INTO STUDENTS(FIRST_NAME, LAST_NAME, EMAIL, ADDRESS, STATE, 
      PIN, PHONE_NO, S_ID, DATE_OF_BIRTH, QUALIFICATION, PERCENT_10, 
      PERCENT_12, DATE_OF_PASSING_12, SUBJECTS)
VALUES ('Ranjit', 'Chatterjee', 'r_chatt@aaa.com', '2/10 ashok vihar', 'west bengal',
  700101, 9876578901, 'S1001', TO_DATE('22-Apr-1980 00:00:00', 'dd-month-yyyy hh24:mi:ss'), 
  'BE', 70, 69, TO_DATE('30-Mar-2002 00:00:00', 'dd-month-yyyy hh24:mi:ss'), 'Mechanical Engg.')

INTO STUDENTS(FIRST_NAME, LAST_NAME, EMAIL, ADDRESS, STATE, 
      PIN, PHONE_NO, S_ID, DATE_OF_BIRTH, QUALIFICATION, PERCENT_10, 
      PERCENT_12, DATE_OF_PASSING_12, SUBJECTS)
VALUES ('Kaushik', 'Bhatterjee', 'kaushik@bb.com', 'block A gagan vihar', 'west bengal',
  700096, 9812345643, 'S1002', TO_DATE('10-Aug-1980 00:00:00', 'dd-month-yyyy hh24:mi:ss'), 
  'BE', 65, 72, TO_DATE('30-Apr-2002 00:00:00', 'dd-month-yyyy hh24:mi:ss'), 'Civil Engg')

INTO STUDENTS(FIRST_NAME, LAST_NAME, EMAIL, ADDRESS, STATE, 
      PIN, PHONE_NO, S_ID, DATE_OF_BIRTH, QUALIFICATION, PERCENT_10, 
      PERCENT_12, DATE_OF_PASSING_12, SUBJECTS)
VALUES ('Kunal', 'Ghosh', 'Kunal@gmail.com', '1A Shivam Apt', 'west bengal',
  700096, 9678430987, 'S1003', TO_DATE('12-Dec-1979 00:00:00', 'dd-month-yyyy hh24:mi:ss'), 
  'BE', 77, 74, TO_DATE('12-Dec-1979 00:00:00', 'dd-month-yyyy hh24:mi:ss'), 'Mechanical Engg.')

INTO STUDENTS(FIRST_NAME, LAST_NAME, EMAIL, ADDRESS, STATE, 
      PIN, PHONE_NO, S_ID, DATE_OF_BIRTH, QUALIFICATION, PERCENT_10, 
      PERCENT_12, DATE_OF_PASSING_12, SUBJECTS)
VALUES ('Pradeep', 'R', 'Pradeep@gmail.com', '2B Trinity towers', 'west bengal',
  700107, 9234540987, 'S1004', TO_DATE('22-Sep-81 00:00:00', 'dd-month-yyyy hh24:mi:ss'), 
  'BE', 78, 70, TO_DATE('22-Sep-1981 00:00:00', 'dd-month-yyyy hh24:mi:ss'), 'Electrical Engg.')

INTO STUDENTS(FIRST_NAME, LAST_NAME, EMAIL, ADDRESS, STATE, 
      PIN, PHONE_NO, S_ID, DATE_OF_BIRTH, QUALIFICATION, PERCENT_10, 
      PERCENT_12, DATE_OF_PASSING_12, SUBJECTS)
VALUES ('Rakhi', 'Mukherjee', 'Rakhi@gmail.com', '8/12c ashoka', 'west bengal',
  700109, 9980768543, 'S1005', TO_DATE('3-May-1981 00:00:00', 'dd-month-yyyy hh24:mi:ss'), 
  'BE', 80, 82, TO_DATE('03-May-1981 00:00:00', 'dd-month-yyyy hh24:mi:ss'), 'Electrical Engg')

INTO STUDENTS(FIRST_NAME, LAST_NAME, EMAIL, ADDRESS, STATE, 
      PIN, PHONE_NO, S_ID, DATE_OF_BIRTH, QUALIFICATION, PERCENT_10, 
      PERCENT_12, DATE_OF_PASSING_12, SUBJECTS)
VALUES ('Sekhar', 'Rao', 's_rao@gmail.com', '22/10 A Vishal Apt', 'west bengal',
  700109, NULL, 'S1006', TO_DATE('3-May-1981 00:00:00', 'dd-month-yyyy hh24:mi:ss'), 
  'BE', 75, 80, TO_DATE('13-Jun-2003 00:00:00', 'dd-month-yyyy hh24:mi:ss'), 'Electrical Engg')

SELECT * FROM DUAL;


CREATE TABLE COURSES (
  C_NAME varchar(60),
  C_CODE Number(6,0) PRIMARY KEY,
  C_SUBJECTS varchar(60),
  C_DURATION Number(6,0),
  C_FEE Number(6,0),
  C_DESCRIPTION varchar(100)
);

INSERT ALL
INTO COURSES(C_NAME, C_CODE, C_SUBJECTS, C_DURATION, C_FEE, C_DESCRIPTION)
VALUES ('C &' || ' Data Structure', 100, 'c, ds', 40, 4000, 'Deatiled c and datastructure concepts')

INTO COURSES(C_NAME, C_CODE, C_SUBJECTS, C_DURATION, C_FEE, C_DESCRIPTION)
VALUES ('HTML &' || ' JS', 101, 'html, js', 20, 3500, 'Detailed HTML and JAVA SCRIPT')

INTO COURSES(C_NAME, C_CODE, C_SUBJECTS, C_DURATION, C_FEE, C_DESCRIPTION)
VALUES ('Java', 102, 'java', 90, 6000, 'Core Java')

INTO COURSES(C_NAME, C_CODE, C_SUBJECTS, C_DURATION, C_FEE, C_DESCRIPTION)
VALUES ('Database', 103, 'rdbms, oracle', 40, 6000, 'Database Concepts')

INTO COURSES(C_NAME, C_CODE, C_SUBJECTS, C_DURATION, C_FEE, C_DESCRIPTION)
VALUES ('Cobol', 104, 'PL,Cobol', 40, 6000, 'Programming Logic and Cobol')
SELECT * FROM DUAL;




CREATE TABLE STUDENT_COURSE (
  S_ID varchar(60) REFERENCES STUDENTS(S_ID),
  C_CODE Number(6,0) REFERENCES COURSES(C_CODE) ,
  REG_NO varchar(60) PRIMARY KEY,
  COURSE_STATUS varchar(60)
);

INSERT ALL
INTO STUDENT_COURSE(S_ID, C_CODE, REG_NO, COURSE_STATUS)
VALUES ('S1001', 100, 'R1001', 'COMPL')

INTO STUDENT_COURSE(S_ID, C_CODE, REG_NO, COURSE_STATUS)
VALUES ('S1001', 101, 'R1002', 'VALID')

INTO STUDENT_COURSE(S_ID, C_CODE, REG_NO, COURSE_STATUS)
VALUES ('S1002', 102, 'R1003', 'VALID')

INTO STUDENT_COURSE(S_ID, C_CODE, REG_NO, COURSE_STATUS)
VALUES ('S1003', 103, 'R1004', 'BREAK')

INTO STUDENT_COURSE(S_ID, C_CODE, REG_NO, COURSE_STATUS)
VALUES ('S1004', 103, 'R1005', 'COMPL')

INTO STUDENT_COURSE(S_ID, C_CODE, REG_NO, COURSE_STATUS)
VALUES ('S1005', 103, 'R1006', 'COMPL')
SELECT * FROM DUAL;








-- HW assignment

create or replace package UMS_PACKAGE_employee_id as
-- Error(2,15): PLS-00114: identifier 'UPDATE_STUDENT_CONTACT_INFO_EM' too long
-- Will use a shorter version

    procedure Update_Stu_Cont_Info_emp_id(registration_no in varchar,
    new_email in varchar, new_contact_num in Number);
    
    procedure search_student_id(char_to_search in varchar);
    
    function get_age(registration_no in varchar) return Number;
    
    function get_years_at_college(registration_no in varchar) return Number;
    
end UMS_PACKAGE_employee_id;

/

create or replace package body UMS_PACKAGE_employee_id as

    procedure Update_Stu_Cont_Info_emp_id(registration_no in varchar,
    new_email in varchar, new_contact_num in Number)
    as
    begin
      update students
        set EMAIL = new_email,
        PHONE_NO = new_contact_num  
      WHERE EXISTS (SELECT * FROM student_course 
      WHERE students.S_ID = student_course.S_ID
      AND student_course.REG_NO = registration_no);
      
    end;
    
    procedure search_student_id(char_to_search in varchar)
    as
      fname varchar(100);
      lname varchar(100);
      phone_number Number;
    begin
        select FIRST_NAME into fname 
        FROM students where first_name like char_to_search || '%';
        select LAST_NAME into lname 
        FROM students where first_name like char_to_search || '%';
        select PHONE_NO into phone_number 
        FROM students where first_name like char_to_search || '%';
        dbms_output.put_line(fname || ' ' || lname);
        dbms_output.put_line(fname || '''s phone number: ' || phone_number);
    end;
    
    function get_age(registration_no in varchar) return Number
    as
      age Number;
    begin
      select Round((sysdate - DATE_OF_BIRTH) / 365.256) into age 
      FROM students JOIN student_course ON students.S_ID = student_course.S_ID
      where REG_NO = registration_no;
      return age;
    end;
    
    function get_years_at_college(registration_no in varchar) return Number
    as
      years_at_college Number;
    begin
      select Round((sysdate - DATE_OF_PASSING_12) / 365.256) into years_at_college 
      FROM students JOIN student_course ON students.S_ID = student_course.S_ID
      where REG_NO = registration_no;
      return years_at_college;
    end;
end UMS_PACKAGE_employee_id;

/

declare
    student_age Number;
    student_years_at_college Number;
begin
    UMS_PACKAGE_employee_id.Update_Stu_Cont_Info_emp_id('R1003', 'kbhatter@gmail.com', 9214385672);
    
    UMS_PACKAGE_employee_id.search_student_id('Pra');
    
    student_age := UMS_PACKAGE_employee_id.get_age('R1003');
    dbms_output.put_line('This person is ' || student_age || ' years old.');
    
    student_years_at_college := UMS_PACKAGE_employee_id.get_years_at_college('R1003');
    dbms_output.put_line('This person has been at this college for ' || student_years_at_college || ' years.');
end;
