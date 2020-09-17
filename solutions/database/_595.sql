/**
 * <a href="https://leetcode.com/problems/big-countries/">595. Big Countries</a>
 */

/**
  Solution 1
 */
SELECT name, population, area
FROM World
WHERE (area > 3000000) OR (population > 25000000)

/**
  Solution 2
 */
SELECT name, population, area
FROM World
WHERE area > 3000000
UNION
SELECT name, population, area
FROM World
WHERE population > 25000000