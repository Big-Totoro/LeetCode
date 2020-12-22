/**
 * <a href="https://leetcode.com/problems/find-users-with-valid-e-mails/">1517. Find Users With Valid E-Mails</a>
 */

/**
  Solution 1
 */
SELECT *
FROM Users u
WHERE mail REGEXP '^[A-Za-z][A-Za-z0-9\_\.\-]*@leetcode\.com$';