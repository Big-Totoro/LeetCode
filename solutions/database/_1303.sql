/**
 * <a href="https://leetcode.com/problems/find-the-team-size/">1303. Find the Team Size</a>
 */

/**
  Solution 1
 */
SELECT employee_id, team_size
FROM Employee AS e
LEFT JOIN (
    SELECT team_id, COUNT(employee_id) AS team_size
    FROM Employee
    GROUP BY team_id) AS t
ON e.team_id = t.team_id

/**
  Solution 2 - Window Function
 */
SELECT employee_id, COUNT(team_id) OVER (PARTITION BY team_id) AS team_size
FROM Employee