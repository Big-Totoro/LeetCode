package io.bigtotoro;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/cheapest-flights-within-k-stops/">787. Cheapest Flights Within K Stops</a>
 */

public class _787 {

    /**
     * Dijkstra
     */
    public static class Solution1 {

        public static class City {
            private int city;
            private int price;
            private int stops;

            public static City valueOf(int city, int price, int stops) {
                City c = new City();
                c.city = city;
                c.price = price;
                c.stops = stops;

                return c;
            }

            @Override
            public String toString() {
                return "city: " + city +
                        ", price: " + price +
                        ", stops: " + stops;
            }
        }

        public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
            if (n <= 0 || flights == null || flights.length == 0 || K < 0) {
                return -1;
            }
            Map<Integer, List<City>> graph = new HashMap<>();

            /**
             * Build the graph
             */
            for (int[] flight : flights) {
                int source = flight[0];
                int destination = flight[1];
                int price = flight[2];
                List<City> destinationCities = graph.getOrDefault(source, new ArrayList<>());
                destinationCities.add(City.valueOf(destination, price, 0));
                graph.put(source, destinationCities);
            }

            /**
             * Calculate the shortest distances by Dijkstra algo
             */
            PriorityQueue<City> queue = new PriorityQueue<>((City city1, City city2) -> city1.price - city2.price);
            queue.offer(City.valueOf(src, 0, 0));

            while (!queue.isEmpty()) {
                City currentCity = queue.poll();

                if (currentCity.city == dst) {
                    return currentCity.price;
                }

                if (currentCity.stops > K) {
                    continue;
                }

                for (City city : graph.getOrDefault(currentCity.city, new ArrayList<>())) {
                    queue.offer(City.valueOf(city.city, currentCity.price + city.price, currentCity.stops + 1));
                }
            }

            return -1;
        }
    }

    public static class Solution2 {
        public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
            return 0;
        }
    }
}