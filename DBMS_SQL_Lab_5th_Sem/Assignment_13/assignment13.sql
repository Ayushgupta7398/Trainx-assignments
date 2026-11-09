-- Assignment 13: UNION and INTERSECT
-- Run this script in a MySQL database.
-- INTERSECT requires MySQL 8.0.31 or later.

-- Set-up data from the assignment brief.
CREATE TABLE club_a (student_name VARCHAR(30));
INSERT INTO club_a (student_name) VALUES ('Asha'), ('Rohan'), ('Neha');
CREATE TABLE club_b (student_name VARCHAR(30));
INSERT INTO club_b (student_name) VALUES ('Neha'), ('Pooja'), ('Meera');

-- Task 1
SELECT student_name FROM club_a UNION SELECT student_name FROM club_b ORDER BY student_name;

-- Task 2
SELECT student_name FROM club_a INTERSECT SELECT student_name FROM club_b ORDER BY student_name;

-- Task 3
SELECT student_name FROM club_a UNION ALL SELECT student_name FROM club_b ORDER BY student_name;
