/**
 * <a href="https://leetcode.com/problems/sales-analysis-i/">Sales Analysis I</a>
 */

/**
  Solution 1
 */
SELECT seller_id
FROM (
    SELECT *, RANK() OVER (ORDER BY SUM(price) DESC) AS total
    FROM Sales
    GROUP BY seller_id
    ) AS t
WHERE t.total = 1;