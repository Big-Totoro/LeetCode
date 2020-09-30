/**
 * <a href="https://leetcode.com/problems/group-sold-products-by-the-date/">1484. Group Sold Products By The Date</a>
 */

/**
  Solution 1
 */
SELECT sell_date, COUNT(DISTINCT product) AS num_sold, GROUP_CONCAT(DISTINCT product ORDER BY product ASC) AS products
FROM Activities
GROUP BY sell_date