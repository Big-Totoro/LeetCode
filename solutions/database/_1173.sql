/**
 * <a href="https://leetcode.com/problems/immediate-food-delivery-i/">1173. Immediate Food Delivery I</a>
 */

/**
  Solution 1
 */
SELECT ROUND(a.c / b.c * 100, 2) AS immediate_percentage
FROM (
         SELECT COUNT(*) AS c
         FROM Delivery AS d
         WHERE d.order_date = customer_pref_delivery_date
     ) AS a,
     (
         SELECT COUNT(*) AS c
         FROM Delivery AS d
     ) AS b