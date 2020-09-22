/**
 * <a href="https://leetcode.com/problems/swap-salary/">627. Swap Salary</a>
 */

/**
  Solution 1
 */
UPDATE salary
SET sex =
        CASE
            WHEN sex = 'm' THEN 'f'
            WHEN sex = 'f' THEN 'm'
        END