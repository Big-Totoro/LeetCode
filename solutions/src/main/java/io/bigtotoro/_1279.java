package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/traffic-light-controlled-intersection/">1279. Traffic Light Controlled Intersection</a>
 */

public class _1279 {
    public static class TrafficLight {
        private Integer greenRoad;

        public TrafficLight() {
            greenRoad = 1;
        }

        public void carArrived(
                int carId,           // ID of the car
                int roadId,          // ID of the road the car travels on. Can be 1 (road A) or 2 (road B)
                int direction,       // Direction of the car
                Runnable turnGreen,  // Use turnGreen.run() to turn light to green on current road
                Runnable crossCar    // Use crossCar.run() to make car cross the intersection
        ) {
            synchronized(this) {
                if (roadId != greenRoad) {
                    turnGreen.run();
                    greenRoad = roadId;
                }
                crossCar.run();
            }
        }
    }
}
