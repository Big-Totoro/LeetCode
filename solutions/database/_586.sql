/**
 * <a href="https://leetcode.com/problems/customer-placing-the-largest-number-of-orders/">586. Customer Placing the Largest Number of Orders</a>
 */

/**
  Solution 1
 */
SELECT customer_number
FROM Orders AS o
GROUP BY customer_number
ORDER BY COUNT(customer_number) DESC
LIMIT 1;

/**
  Solution 2
 */
SELECT customer_number
FROM Orders
GROUP BY customer_number
HAVING COUNT(order_number) = (
    SELECT COUNT(order_number) AS order_num
    FROM Orders
    GROUP BY customer_number
    ORDER BY order_num DESC
    LIMIT 1
);

/**
  Solution 3
 */
SELECT o.customer_number
FROM (
        SELECT customer_number, DENSE_RANK() OVER (ORDER BY customer_number DESC) AS rnk
        FROM Orders
    ) AS o
WHERE o.rnk = 1
LIMIT 1