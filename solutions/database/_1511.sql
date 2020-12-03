/**
 * <a href="https://leetcode.com/problems/customer-order-frequency/">1511. Customer Order Frequency</a>
 */

/**
  Solution 1
 */
WITH cte AS (SELECT o.customer_id, c.name, SUM(o.quantity * p.price) AS spent
             FROM Orders o
                      INNER JOIN Product p
                                 ON o.product_id = p.product_id
                      LEFT JOIN Customers c
                                ON o.customer_id = c.customer_id
             WHERE MONTH(o.order_date) IN (6, 7) AND YEAR(o.order_date) = 2020
             GROUP BY c.customer_id, MONTH(o.order_date), YEAR(o.order_date)
             HAVING spent >= 100)

SELECT customer_id, name
FROM cte
GROUP BY customer_id
HAVING COUNT(*) > 1