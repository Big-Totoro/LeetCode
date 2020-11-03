/**
 * <a href="https://leetcode.com/problems/employees-earning-more-than-their-managers/">181. Employees Earning More Than Their Managers</a>
 */

/**
  Solution 1
 */
SELECT e.name AS Employee
FROM Employee e
         INNER JOIN Employee m
                    ON e.managerId = m.id
WHERE e.salary > m.salary;