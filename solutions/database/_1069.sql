/**
 * <a href="https://leetcode.com/problems/product-sales-analysis-ii/">1069. Product Sales Analysis II</a>
 */

/**
  Solution 1
 */
SELECT p.product_id, SUM(s.quantity) AS total_quantity
FROM Sales AS s
INNER JOIN Product AS p
ON s.product_id = p.product_id
GROUP BY p.product_id

/**
  Solution 2Боль
 */
SELECT s.product_id, SUM(s.quantity) AS total_quantity
FROM Sales AS s
GROUP BY s.product_id