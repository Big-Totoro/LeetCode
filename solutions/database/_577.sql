/**
 * <a href="https://leetcode.com/problems/employee-bonus/">577. Employee Bonus</a>
 */

/**
  Solution 1
 */
SELECT e.name AS name, b.bonus AS bonus
FROM Employee AS e
         LEFT JOIN Bonus AS b
                   ON e.empId = b.empId
WHERE IFNULL(b.bonus, 0) < 1000