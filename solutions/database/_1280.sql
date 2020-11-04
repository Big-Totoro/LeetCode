/**
 * <a href="https://leetcode.com/problems/find-the-team-size/">1303. Find the Team Size</a>
 */

/**
  Solution 1
 */
WITH cte AS (
    SELECT s.student_id, s.student_name, sbj.subject_name, e.subject_name AS exam
    FROM Students s
             CROSS JOIN Subjects sbj
             LEFT JOIN Examinations e
                       ON s.student_id = e.student_id AND sbj.subject_name = e.subject_name
)
SELECT student_id, student_name, subject_name, IFNULL(COUNT(exam), 0) AS attended_exams
FROM cte
GROUP BY cte.student_id, cte.student_name, cte.subject_name
ORDER BY cte.student_id, cte.subject_name;