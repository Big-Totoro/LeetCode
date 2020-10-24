/**
 * <a href="https://leetcode.com/problems/actors-and-directors-who-cooperated-at-least-three-times/">1050. Actors and Directors Who Cooperated At Least Three Times</a>
 */

/**
  Solution 1
 */
SELECT a.actor_id, a.director_id
FROM ActorDirector a
GROUP by a.actor_id, a.director_id
HAVING COUNT(a.director_id) >= 3

/**
  Solution 2
 */
