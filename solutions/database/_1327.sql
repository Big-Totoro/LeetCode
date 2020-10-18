/**
 * <a href="https://leetcode.com/problems/list-the-products-ordered-in-a-period/">1327. List the Products Ordered in a Period</a>
 */

/**
  Solution 1
 */
SELECT p.product_name, SUM(o.unit) AS unit
FROM Products p
         INNER JOIN Orders o
                    ON p.product_id = o.product_id
WHERE MONTH(o.order_date) = 2 AND YEAR(o.order_date) = 2020
GROUP BY p.product_id
HAVING SUM(o.unit) >= 100;