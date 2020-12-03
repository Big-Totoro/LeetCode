/**
 * <a href="https://leetcode.com/problems/customers-who-never-order/">183. Customers Who Never Order</a>
 */

/**
  Solution 1
 */
SELECT c.name AS Customers
FROM Customers c
WHERE c.id NOT IN (
    SELECT DISTINCT customerId
    FROM Orders o);

/**
  Solution 2
 */
SELECT c.name AS Customers
FROM Customers c
         LEFT JOIN Orders o
                   ON c.id = o.customerId
WHERE o.customerId IS NULL;