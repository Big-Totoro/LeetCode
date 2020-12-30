/**
 * <a href="https://leetcode.com/problems/number-of-comments-per-post/">1241. Number of Comments per Post</a>
 */

/**
  Solution 1
 */
SELECT p.sub_id AS post_id, COUNT(DISTINCT c.sub_id) AS number_of_comments
FROM Submissions p
         LEFT JOIN Submissions c
                   ON p.sub_id = c.parent_id
WHERE p.parent_id IS NULL
GROUP BY p.sub_id;