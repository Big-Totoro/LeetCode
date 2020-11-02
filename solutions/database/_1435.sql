/**
 * <a href="https://leetcode.com/problems/create-a-session-bar-chart/">1435. Create a Session Bar Chart</a>
 */

/**
  Solution 1
 */
WITH cte AS (
    SELECT '[0-5>' AS bin, 0 AS min_duration, 5 * 60 AS max_duration
    UNION ALL
    SELECT '[5-10>' AS bin, 5 * 60 AS min_duration, 10 * 60 AS max_duration
    UNION ALL
    SELECT '[10-15>' AS bin, 10 * 60 AS min_duration, 15 * 60 AS max_duration
    UNION ALL
    SELECT '15 or more' AS bin, 15 * 60 AS min_duration, 2147483647 AS max_duration
)
SELECT cte.bin, COUNT(s.duration) AS total
FROM Sessions AS s
         RIGHT JOIN cte
                    ON s.duration >= min_duration AND s.duration < max_duration
GROUP BY cte.bin;