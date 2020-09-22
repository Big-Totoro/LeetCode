/**
 * <a href="https://leetcode.com/problems/customer-who-visited-but-did-not-make-any-transactions/">1581. Customer Who Visited but Did Not Make Any Transactions</a>
 */

/**
  Solution 1
 */
SELECT v.customer_id, COUNT(v.visit_id) AS count_no_trans
FROM Visits AS v
WHERE v.visit_id NOT IN (SELECT visit_id FROM Transactions)
GROUP BY v.customer_id

/**
  Solution 2
 */
SELECT v.customer_id, COUNT(v.visit_id) AS count_no_trans
FROM Visits AS v
         LEFT JOIN Transactions AS t
                   ON v.visit_id = t.visit_id
WHERE t.visit_id IS NULL
GROUP BY v.customer_id