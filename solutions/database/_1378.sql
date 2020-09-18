/**
 * <a href="https://leetcode.com/problems/replace-employee-id-with-the-unique-identifier/">1378. Replace Employee ID With The Unique Identifier</a>
 */

/**
  Solution 1
 */
SELECT ei.unique_id, e.name
FROM Employees AS e
    LEFT JOIN EmployeeUNI AS ei
    ON e.id = ei.id
