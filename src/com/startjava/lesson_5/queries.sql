\echo 'Robots list'
SELECT * 
  FROM Jaegers;

\echo 'List of non-destroyed robots'
SELECT * 
  FROM jaegers 
 WHERE status = 'active';

\echo 'List of "Mark-1" and "Mark-4" series robots'
SELECT * 
  FROM jaegers 
 WHERE MARK IN ('Mark-1', 'Mark-4');

\echo 'List of robots excluding "Mark-1" and "Mark-4" series'
SELECT * 
  FROM jaegers 
 WHERE MARK NOT IN ('Mark-1', 'Mark-4');

\echo 'List of robots sorted by series descending'
SELECT * 
  FROM jaegers 
 ORDER BY mark DESC;

\echo 'The oldest robot'
SELECT * 
  FROM jaegers 
 WHERE launch = 
    (SELECT MIN(launch) 
       FROM jaegers);

\echo 'The robots that destroyed the most kaiju'
SELECT * 
  FROM jaegers 
 WHERE kaijukill > 5;

\echo 'Average weight of robots'
SELECT AVG(weight) 
  FROM jaegers;

\echo '+1 kaiju kill to all surviving robots'
UPDATE jaegers 
   SET kaijukill = kaijukill + 1 
 WHERE status = 'active';
 
\echo 'Removing destroyed robots'
DELETE 
  FROM jaegers 
 WHERE status = 'destroyed';