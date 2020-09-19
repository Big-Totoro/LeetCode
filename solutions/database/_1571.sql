/**
 * <a href="https://leetcode.com/problems/warehouse-manager/">1571. Warehouse Manager</a>
 */

/**
  Solution 1
 */
SELECT w.name AS warehouse_name, SUM(w.units * p.Width * p.Length * p.Height) AS volume
FROM Warehouse AS w
         INNER JOIN Products AS p
                    ON w.product_id = p.product_id
GROUP BY w.name