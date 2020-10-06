/**
 * <a href="https://leetcode.com/problems/top-travellers/">1407. Top Travellers</a>
 */

/**
  Solution 1
 */
SELECT u.name, SUM(IFNULL(r.distance, 0)) AS travelled_distance
FROM Users AS u
         LEFT JOIN Rides AS r
                   ON u.id = r.user_id
GROUP BY u.id
ORDER BY travelled_distance DESC, u.name ASC

/**
  Solution 2
 */
SELECT DISTINCT u.name, SUM(IFNULL(r.distance, 0)) OVER (PARTITION BY u.id) AS travelled_distance
FROM Users u
    LEFT JOIN Rides r
ON u.id = r.user_id
ORDER BY travelled_distance DESC, u.name ASC