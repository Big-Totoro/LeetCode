/**
 * <a href="https://leetcode.com/problems/unique-orders-and-customers-per-month/">1565. Unique Orders and Customers Per Month</a>
 */

/**
  Solution 1
 */
SELECT SUBSTRING(o.order_date, 1, 7) AS month,
       COUNT(DISTINCT o.order_id) AS order_count,
       COUNT(DISTINCT o.customer_id) AS customer_count
FROM Orders o
WHERE o.invoice > 20
GROUP BY month