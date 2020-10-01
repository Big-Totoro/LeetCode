/**
 * <a href="https://leetcode.com/problems/reformat-department-table/">1179. Reformat Department Table</a>
 */

/**
  Solution 1
 */
SELECT u.product_id, ROUND(SUM(price * units) / SUM(units), 2) AS average_price
FROM Prices AS p
         INNER JOIN UnitsSold AS u
                    ON p.product_id = u.product_id
WHERE u.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY product_id
