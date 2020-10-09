/**
 * <a href="https://leetcode.com/problems/combine-two-tables/">175. Combine Two Tables</a>
 */

/**
  Solution 1
 */
SELECT FirstName, LastName, City, State
FROM Person p
         LEFT JOIN Address a
                   ON p.PersonId = a.PersonId