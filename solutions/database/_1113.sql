/**
 * <a href="https://leetcode.com/problems/reported-posts/">Reported Posts</a>
 */

/**
  Solution 1
 */
SELECT a.extra AS report_reason, COUNT(DISTINCT a.post_id) AS report_count
FROM Actions a
WHERE a.action_date = '2019-07-04' AND a.action = 'report'
GROUP BY a.extra;