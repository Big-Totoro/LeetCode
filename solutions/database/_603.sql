/**
 * <a href="https://leetcode.com/problems/consecutive-available-seats/">Consecutive Available Seats</a>
 */

/**
  Solution 1
 */
SELECT DISTINCT a.seat_id
FROM cinema a, cinema b
WHERE ABS(a.seat_id - b.seat_id) = 1 AND a.free = 1 AND b.free = 1
ORDER BY a.seat_id;