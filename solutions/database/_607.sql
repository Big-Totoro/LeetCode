/**
 * <a href="https://leetcode.com/problems/sales-person/">607. Sales Person</a>
 */

/**
  Solution 1
 */
SELECT name
FROM SalesPerson s
WHERE s.sales_id NOT IN (
    SELECT o.sales_id
    FROM Company c
             INNER JOIN Orders o
                        ON c.com_id = o.com_id
    WHERE c.name = 'RED'
    );