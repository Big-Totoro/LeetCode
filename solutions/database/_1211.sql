/**
 * <a href="https://leetcode.com/problems/queries-quality-and-percentage/">1211. Queries Quality and Percentage</a>
 */

/**
  Solution 1
 */
SELECT q.query_name,
       ROUND(AVG(q.rating / q.position), 2) AS quality,
       ROUND(SUM(q.rating < 3) / COUNT(q.rating) * 100, 2) AS poor_query_percentage
FROM Queries q
GROUP BY query_name;