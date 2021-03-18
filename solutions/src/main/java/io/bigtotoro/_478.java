package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/generate-random-point-in-a-circle/">478. Generate Random Point in a Circle</a>
 */

public class _478 {

    public static class Solution1 {
        private double radius;
        private double x_center;
        private double y_center;

        public Solution1(double radius, double x_center, double y_center) {
            this.radius = radius;
            this.x_center = x_center;
            this.y_center = y_center;
        }

        public double[] randPoint() {
            double x0 = x_center - radius;
            double y0 = y_center - radius;

            while(true) {
                double x = x0 + Math.random() * radius * 2;
                double y = y0 + Math.random() * radius * 2;
                if (Math.sqrt(Math.pow((x - x_center) , 2) + Math.pow((y - y_center), 2)) <= radius) {
                    return new double[]{x, y};
                }
            }
        }
    }
}
