/**
 * <a href="https://leetcode.com/problems/find-customer-referee/">584. Find Customer Referee</a>
 */
SELECT name
FROM Customer
WHERE referee_id NOT IN (2) OR referee_id IS NULL