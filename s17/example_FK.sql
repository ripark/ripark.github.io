CREATE DATABASE TestFK;
USE TestFK;

CREATE TABLE employee (
	id smallint(5) unsigned NOT NULL,
	firstname varchar(30),
	lastname varchar(30),
	birthdate date,
	PRIMARY KEY (id),
	KEY idx_lastname (lastname)
) ENGINE=InnoDB;

CREATE TABLE borrowed (
	ref int(10) unsigned NOT NULL auto_increment,
	employeeid smallint(5) unsigned NOT NULL,
	book varchar(50),
	PRIMARY KEY (ref)
) ENGINE=InnoDB;

INSERT	INTO	`employee`	(`id`,	`firstname`, `lastname`, `birthdate`)	VALUES
(1,	'John', 'Smith', '1995-03-10');
INSERT	INTO	`employee`	(`id`,	`firstname`, `lastname`, `birthdate`)	VALUES
(2,	'Some', 'Guy', '1980-12-28');

INSERT	INTO	`borrowed`	(`ref`,	`employeeID`, `book`)	VALUES
(85,	'1', 'Space Adventure 101');
INSERT	INTO	`borrowed`	(`ref`,	`employeeID`, `book`)	VALUES
(47,	'1', 'Make Potatoes Great Again!');
INSERT	INTO	`borrowed`	(`ref`,	`employeeID`, `book`)	VALUES
(33,	'2', 'How to Trump, by Donald');

ALTER TABLE borrowed 
ADD CONSTRAINT FK_borrowed 
FOREIGN KEY (employeeid) REFERENCES employee(id) 
ON UPDATE CASCADE
ON DELETE CASCADE;

SELECT * FROM employee;
SELECT * FROM borrowed;

SELECT book FROM borrowed 
JOIN employee ON employee.id=borrowed.employeeid 
WHERE employee.lastname='Smith';

UPDATE employee SET id=22 WHERE id=2;

SELECT * FROM employee;
SELECT * FROM borrowed;

DELETE FROM employee WHERE id=1;

SELECT * FROM employee;
SELECT * FROM borrowed;