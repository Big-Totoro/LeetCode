/**
 * <a href="https://leetcode.com/problems/duplicate-emails/">182. Duplicate Emails</a>
 */

/**
  Solution 1
 */
SELECT p.email
FROM Person p
GROUP BY p.email
HAVING COUNT(p.email) >= 2;

/**
  Solution 2
 */
SELECT email
FROM (
    SELECT DISTINCT p.email, COUNT(p.email) OVER (PARTITION BY p.email) AS count_emails
    FROM Person p
) AS u
WHERE u.count_emails > 1;