/**
 * <a href="https://leetcode.com/problems/not-boring-movies/">620. Not Boring Movies</a>
 */

/**
  Solution 1
 */
SELECT *
FROM cinema c
WHERE c.id MOD 2 != 0 AND c.description != 'boring'
ORDER BY c.rating DESC
