/**
 * <a href="https://leetcode.com/problems/shortest-distance-in-a-line/">613. Shortest Distance in a Line</a>
 */

/**
  Solution 1
 */
SELECT MIN(a.x - b.x) AS shortest
FROM point AS a, point AS b
WHERE a.x > b.x

/**
  Solution 2
 */
SELECT MIN(t1.x - t2.x) AS shortest
FROM point AS t1 CROSS JOIN point AS t2
    ON t1.x > t2.x