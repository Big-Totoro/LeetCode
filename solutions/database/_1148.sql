/**
 * <a href="https://leetcode.com/problems/article-views-i/">1148. Article Views I</a>
 */

/**
  Solution 1
 */
SELECT DISTINCT v.author_id AS id
FROM Views v
WHERE v.author_id = v.viewer_id
ORDER BY v.author_id ASC