package org.example.Practice_Program;

import io.cucumber.java.sl.In;

import java.util.*;

public class programe5 {


    public static void main(String[] args) {
        String[] product ={"iphone14","iphone11","Galaxy S24 Ultra","Pixel 7","iphone 10","Samsung S15"};
        int[] price ={700,600,700,899,700,580};

        Map<Integer, List<String>> map = new TreeMap<>();
        for(int i=0;i<price.length-1;i++){
            map.putIfAbsent(price[i],new ArrayList<>());
            map.get(price[i]).add(product[i]);
        }

        Set<Integer> keySet= map.keySet();

      Integer[] h=  keySet.toArray(new Integer[(keySet.size())]);

        System.out.println(h[map.size()-2] +"------------->"+map.get(h[map.size()-2]));


    }
}
