-- Assignment 11: Other Kinds of Joins
-- Run this script in a MySQL database.

-- Set-up data from the assignment brief.
CREATE TABLE team (team_id INT, team_name VARCHAR(20));
INSERT INTO team (team_id, team_name) VALUES (1, 'Eagles'), (2, 'Tigers'), (3, 'Lions');
CREATE TABLE player (player_name VARCHAR(30), team_id INT, age INT);
INSERT INTO player (player_name, team_id, age) VALUES ('Asha', 1, 24), ('Meera', 1, 22), ('Arjun', 2, 27);

-- Task 1
SELECT t.team_name, p.player_name FROM team AS t LEFT JOIN player AS p ON t.team_id = p.team_id ORDER BY t.team_name, p.player_name;

-- Task 2
SELECT t.team_name, p.player_name FROM team AS t CROSS JOIN player AS p ORDER BY t.team_name, p.player_name;

-- Task 3
SELECT player_name, team_name FROM player NATURAL JOIN team ORDER BY player_name;
