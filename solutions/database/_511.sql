/**
 * <a href="https://leetcode.com/problems/game-play-analysis-i/">511. Game Play Analysis I</a>
 */
SELECT DISTINCT player_id, MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;