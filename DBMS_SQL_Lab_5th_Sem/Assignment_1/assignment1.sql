-- Assignment 1: Creating a Table and Adding Rows
-- Run this script in a MySQL database.

-- Task 1
CREATE TABLE student (roll_no INT, name VARCHAR(30), marks INT);

-- Task 2
INSERT INTO student (roll_no, name, marks) VALUES (101, 'Asha', 78), (102, 'Rohan', 64), (103, 'Neha', 88);

-- Task 3
SELECT roll_no, name, marks FROM student;
