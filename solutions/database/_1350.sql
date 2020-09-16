/**
 * <a href="https://leetcode.com/problems/students-with-invalid-departments/">1350. Students With Invalid Departments</a>
 */
SELECT id, name
FROM Students AS s
WHERE s.department_id NOT IN (SELECT id FROM Departments AS d)