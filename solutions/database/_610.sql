/**
 * <a href="https://leetcode.com/problems/triangle-judgement/">610. Triangle Judgement</a>
 */

/**
  Solution 1
 */
SELECT x, y, z,
       CASE
           WHEN (x + y > z) AND (x + z > y) AND (y + z > x) THEN 'Yes'
           ELSE 'No'
       END AS triangle
FROM triangle