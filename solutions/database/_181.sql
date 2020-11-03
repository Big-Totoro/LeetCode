/**
 * <a href="https://leetcode.com/problems/duplicate-emails/">182. Duplicate Emails</a>
 */

/**
  Solution 1
 */
SELECT e.name AS Employee
FROM Employee e
         INNER JOIN Employee m
                    ON e.managerId = m.id
WHERE e.salary > m.salary;