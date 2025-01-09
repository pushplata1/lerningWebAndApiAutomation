package org.example.Practice_Program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductPrice {

        public static void main(String[] args) {
            String[] product = {"iphone14", "iphone11", "Galaxy S24 Ultra", "Pixel 7", "iphone 10", "Samsung S15"};
            int[] price = {700, 600, 700, 899, 700, 580};

            // Optimized HashMap to group products by price
            Map<Integer, List<String>> map = new HashMap<>();

            // Populate the map with products grouped by price
            for (int i = 0; i < price.length; i++) {
                map.putIfAbsent(price[i], new ArrayList<>());
                map.get(price[i]).add(product[i]);
            }

            // Find the second-highest price
            int highestPrice = Integer.MIN_VALUE;
            int secondHighestPrice = Integer.MIN_VALUE;

            for (int p : map.keySet()) {
                if (p > highestPrice) {
                    secondHighestPrice = highestPrice;
                    highestPrice = p;
                } else if (p > secondHighestPrice && p < highestPrice) {
                    secondHighestPrice = p;
                }
            }

            // Print the second-highest price and associated products
            if (secondHighestPrice != Integer.MIN_VALUE) {
                System.out.println(secondHighestPrice + " -------------> " + map.get(secondHighestPrice));
            }
        }
    }


