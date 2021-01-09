/**
 * <a href="https://leetcode.com/problems/game-play-analysis-ii/">512. Game Play Analysis II</a>
 */

/**
  Solution 1
 */
SELECT player_id, device_id
FROM Activity
WHERE (player_id, event_date) IN (
    SELECT a.player_id, MIN(a.event_date)
    FROM Activity a
    GROUP BY a.player_id);