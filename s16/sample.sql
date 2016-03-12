SELECT datediff('2040-12-31','2010-01-01');

CREATE DATABASE IF NOT EXISTS Calendar;
USE Calendar;

DROP TABLE IF EXISTS calendar_table;
CREATE TABLE calendar_table (
	dt date NOT NULL PRIMARY KEY,
	y smallint NULL,
	q tinyint NULL,
	m tinyint NULL,
	d tinyint NULL,
	dw tinyint NULL,
	monthName VARCHAR(9) NULL,
	dayName VARCHAR(9) NULL,
	w tinyint NULL,
	isWeekday BINARY(1) NULL,
	isHoliday BINARY(1) NULL,
	holidayDescr VARCHAR(32) NULL,
	isPayday BINARY(1) NULL
);

CREATE TABLE ints ( i tinyint );
 
INSERT INTO ints VALUES (0),(1),(2),(3),(4),(5),(6),(7),(8),(9);
 
INSERT INTO calendar_table (dt)
SELECT DATE('2010-01-01') + INTERVAL a.i*10000 + b.i*1000 + c.i*100 + d.i*10 + e.i DAY
FROM ints a JOIN ints b JOIN ints c JOIN ints d JOIN ints e
WHERE (a.i*10000 + b.i*1000 + c.i*100 + d.i*10 + e.i) <= 11322
ORDER BY 1;

UPDATE calendar_table
SET isWeekday = CASE WHEN dayofweek(dt) IN (1,7) THEN 0 ELSE 1 END,
	isHoliday = 0,
	isPayday = 0,
	y = YEAR(dt),
	q = quarter(dt),
	m = MONTH(dt),
	d = dayofmonth(dt),
	dw = dayofweek(dt),
	monthname = monthname(dt),
	dayname = dayname(dt),
	w = week(dt),
	holidayDescr = '';
    
UPDATE calendar_table SET isHoliday = 1, holidayDescr = 'New Year''s Day' WHERE m = 1 AND d = 1;
 
UPDATE calendar_table c1
LEFT JOIN calendar_table c2 ON c2.dt = c1.dt + INTERVAL 1 DAY
SET c1.isHoliday = 1, c1.holidayDescr = 'Holiday for New Year''s Day'
WHERE c1.dw = 6 AND c2.m = 1 AND c2.dw = 7 AND c2.isHoliday = 1;
 
UPDATE calendar_table c1
LEFT JOIN calendar_table c2 ON c2.dt = c1.dt - INTERVAL 1 DAY
SET c1.isHoliday = 1, c1.holidayDescr = 'Holiday for New Year''s Day'
WHERE c1.dw = 2 AND c2.m = 1 AND c2.dw = 1 AND c2.isHoliday = 1;

UPDATE calendar_table
SET isHoliday = 1, holidayDescr = 'Martin Luther King Day'
WHERE m = 1 AND dw = 2 AND d BETWEEN 15 AND 21;

UPDATE calendar_table
SET isHoliday = 1, holidayDescr = 'President''s Day'
WHERE m = 2 AND dw = 2 AND d BETWEEN 15 AND 21;

UPDATE calendar_table
SET isHoliday = 1, holidayDescr = 'Memorial Day'
WHERE m = 5 AND dw = 2 AND d BETWEEN 25 AND 31;

UPDATE calendar_table
SET isHoliday = 1, holidayDescr = 'Independence Day'
WHERE m = 7 AND d = 4;
 
UPDATE calendar_table c1
LEFT JOIN calendar_table c2 ON c2.dt = c1.dt + INTERVAL 1 DAY
SET c1.isHoliday = 1, c1.holidayDescr = 'Holiday for Independence Day'
WHERE c1.dw = 6 AND c2.m = 7 AND c2.d = 4 AND c2.dw = 7 AND c2.isHoliday = 1;
 
UPDATE calendar_table c1
LEFT JOIN calendar_table c2 ON c2.dt = c1.dt - INTERVAL 1 DAY
SET c1.isHoliday = 1, c1.holidayDescr = 'Holiday for Independence Day'
WHERE c1.dw = 2 AND c2.m = 7 AND c2.d = 4 AND c2.dw = 1 AND c2.isHoliday = 1;

UPDATE calendar_table
SET isHoliday = 1, holidayDescr = 'Labor Day'
WHERE m = 9 AND dw = 2 AND d BETWEEN 1 AND 7;


UPDATE calendar_table
SET isHoliday = 1, holidayDescr = 'Veteran''s Day'
WHERE m = 11 AND d = 11;
 
UPDATE calendar_table c1
LEFT JOIN calendar_table c2 ON c2.dt = c1.dt + INTERVAL 1 DAY
SET c1.isHoliday = 1, c1.holidayDescr = 'Holiday for Veteran''s Day'
WHERE c1.dw = 6 AND c2.m = 11 AND c2.d = 11 AND c2.dw = 7 AND c2.isHoliday = 1;
 
UPDATE calendar_table c1
LEFT JOIN calendar_table c2 ON c2.dt = c1.dt - INTERVAL 1 DAY
SET c1.isHoliday = 1, c1.holidayDescr = 'Holiday for Veteran''s Day'
WHERE c1.dw = 2 AND c2.m = 11 AND c2.d = 11 AND c2.dw = 1 AND c2.isHoliday = 1;

UPDATE calendar_table
SET isHoliday = 1, holidayDescr = 'Thanksgiving Day'
WHERE m = 11 AND dw = 5 AND d BETWEEN 22 AND 28;

UPDATE calendar_table
SET isHoliday = 1, holidayDescr = 'Friday After Thanksgiving'
WHERE m = 11 AND dw = 6 AND d BETWEEN 21 AND 29;

UPDATE calendar_table
SET isHoliday = 1, holidayDescr = 'Christmas Day'
WHERE m = 12 AND d = 25;
 
UPDATE calendar_table c1
LEFT JOIN calendar_table c2 ON c2.dt = c1.dt + INTERVAL 1 DAY
SET c1.isHoliday = 1, c1.holidayDescr = 'Holiday for Christmas Day'
WHERE c1.dw = 6 AND c2.m = 12 AND c2.d = 25 AND c2.dw = 7 AND c2.isHoliday = 1;
 
UPDATE calendar_table c1
LEFT JOIN calendar_table c2 ON c2.dt = c1.dt - INTERVAL 1 DAY
SET c1.isHoliday = 1, c1.holidayDescr = 'Holiday for Christmas Day'
WHERE c1.dw = 2 AND c2.m = 12 AND c2.d = 25 AND c2.dw = 1 AND c2.isHoliday = 1;


