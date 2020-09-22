/**
 * <a href="https://leetcode.com/problems/product-sales-analysis-i/">1068. Product Sales Analysis IПрекрас</a>
 */

/**
  Solution 1
 */
SELECT p.product_name, s.year, s.price
FROM Sales AS s
INNER JOIN Product AS p
ON s.product_id = p.product_id