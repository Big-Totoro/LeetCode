/**
 * <a href="https://leetcode.com/problems/patients-with-a-condition/">1527. Patients With a Condition</a>
 */

/**
  Solution 1
 */
SELECT *
FROM Patients
WHERE conditions LIKE '%DIAB1%'